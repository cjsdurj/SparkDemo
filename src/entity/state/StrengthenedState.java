package entity.state;

import java.util.ArrayList;

import entity.Character;
import entity.monster.Monster;
import entity.skill.Skill;
import view.Textdialog;

public class StrengthenedState extends State {
    private int round =2;
	
	public StrengthenedState() {
		super();
		// TODO Auto-generated constructor stub
		this.name ="正统美猴王";
		player.setCur_attack(2*player.getAttack());
		
	}
    
	@Override
	public void suffer_damage(int i, String s) {
			new Textdialog(s+player.getName()+"处于无敌状态，无视一切伤害");
			checkstate();
			
	}

	@Override
	public void checkstate() {
         if(round ==0) {
        	 player.setCur_attack(player.getAttack());
        	 player.setState(new NormalState());
         }
	}

	@Override
	public void UseSkill(Skill skill, ArrayList<Monster> monsters) {
		// TODO Auto-generated method stub
		super.UseSkill(skill, monsters);
		round --;
		checkstate();
	}

	@Override
	public void attack_someone(Character c) {
		// TODO Auto-generated method stub
		super.attack_someone(c);
		round --;
		checkstate();
	}
	
	

}
