package entity.state;

import java.util.ArrayList;

import entity.Character;
import entity.Player;
import entity.monster.Monster;
import entity.skill.Skill;
import view.Textdialog;

public abstract class State {
	protected Player player;
	protected String name;
    
	public State() {
    	this.player = Player.getInstance();
    }
    
    public void checkstate() {}
    
    public void suffer_damage(int i,String s) {
    	this.player = Player.getInstance();
		int defence = player.getCur_defence();
		int real_damage = i - defence;
		if (real_damage > 0) {
			new Textdialog(s+player.getName()+"受到"+real_damage+"点伤害");
			if (player.getCur_hp() < real_damage) {
				player.setCur_hp(0);
			} else {
				player.setCur_hp(player.getCur_hp()-real_damage);
			}
		}else {
			new Textdialog(s+player.getName()+"受到0点伤害");
		}
	}
	
	public void attack_someone(Character c) {
		this.player = Player.getInstance();
		if (player.is_alive()) {
			player.getWeapon_onUse().attack_someone(c);
		} else {
			new Textdialog(player.getName() + "已经死亡，不能发起进攻");
		}
	}
	
	public  void UseSkill(Skill skill,ArrayList<Monster> monsters) {
		this.player = Player.getInstance();
		if(player.is_alive()) {
		skill.useSkill(player, monsters);}
		else {
		  new Textdialog(player.getName()+"已经死亡，无法使用技能");
		}
	}

	public String getName() {
		return name;
	}
	
	
	
}
