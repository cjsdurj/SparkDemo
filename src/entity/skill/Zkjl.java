package entity.skill;

import java.util.ArrayList;

import entity.Player;
import entity.monster.Monster;
import view.Choosedialog;

public class Zkjl extends Skill {
	public Zkjl() {
		this.name = "章口就莱";
		
		this.description ="        章口就莱，先发制人；无视人物速度，必定先手；"
				+ "对目标造成攻击力*0.9的伤害。";
		this.on_the_offensive = true;
		this.max_pp =20;
		this.cur_pp =20;
	}
	@Override
	public void skillFunction(Player self, ArrayList<Monster> monsters) {
		// TODO Auto-generated method stub
		int damage =(int)(self.getAttack()*0.9);
		int monster_choice = new Choosedialog(monsters).getChoice();
		if (monster_choice ==-1) return;
		monsters.get(monster_choice).suffer_damage(damage, self.getName()+"使用章口就莱,");
		
	}
          
}
