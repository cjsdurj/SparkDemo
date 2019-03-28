package entity;

import java.awt.Image;

import javax.swing.ImageIcon;
  
import view.Textdialog;

public abstract class Character implements Comparable {

	protected Image image;
	protected String name;

	protected int level;
	
	protected int strength;
	protected int intelligence;
	protected int agility;

	protected int speed;
	protected int hp;
	protected int attack;
	protected int defence;

	// 状态现有值
	protected int cur_hp;
	protected int cur_attack;
	protected int cur_defence;
	protected int cur_speed;

	public Character() {

	}
	
	public Character(String name, int level) {

		this.level = level;
		this.name = name;
	}
	

	// 目标发起进攻
	public void attack_someone(Character c) {
		if(this.is_alive()) {
		int damage = this.cur_attack;
		c.suffer_damage(damage,this.getName()+"发起进攻，");}
		else {
		 new Textdialog(this.getName()+"已经死亡，不能发起进攻");
		}
	}

	// 目标受到伤害
	public void suffer_damage(int i,String s) {
		int defence = this.cur_defence;
		int real_damage = i - defence;
		if (real_damage > 0) {
			new Textdialog(s+this.getName()+"受到"+real_damage+"点伤害");
			if (this.cur_hp < real_damage) {
				this.cur_hp = 0;
			} else {
				this.cur_hp -= real_damage;
			}
		}else {
			new Textdialog(s+this.getName()+"受到0点伤害");
		}
	}
	
	
	public  void  update_attributes() {
		speed = 10+(int)(intelligence*0.5+agility*0.5);
		hp = 30 + strength * 6;
		attack = (int) (strength * 1.5+agility*0.5);
		defence = (int) (strength * 0.5+intelligence*0.5+agility*0.5);
		
		cur_speed = speed;
		cur_hp = hp;
		cur_attack = attack;
		cur_defence = defence;
		
	}

	public boolean is_alive() {
		return this.cur_hp > 0;
	}
    
	
	
	@Override
	public int compareTo(Object o) {
		Character c =(Character)o;
		return   c.cur_speed - this.cur_speed ;
	}

	public Image getImage() {
		return image;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public int getStrength() {
		return strength;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getSpeed() {
		return speed;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefence() {
		return defence;
	}

	public int getCur_hp() {
		return cur_hp;
	}

	public int getCur_speed() {
		return cur_speed;
	}

	public int getCur_attack() {
		return cur_attack;
	}

	public int getCur_defence() {
		return cur_defence;
	}


	public int getAgility() {
		return agility;
	}

	public void setCur_hp(int cur_hp) {
		this.cur_hp = cur_hp;
	}
	
	
}
