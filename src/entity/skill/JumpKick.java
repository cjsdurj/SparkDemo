package entity.skill;

import java.util.ArrayList;

import entity.Player;
import entity.monster.Monster;

public class JumpKick extends Skill {

	
	
	public JumpKick() {
		this.name = "飞踢";
		
		this.description ="跳至高空，给敌人致命一击。对单个目标造成100+自己攻击力*1的伤害";
		this.type = Type.single;
		this.max_pp =5;
		this.cur_pp =5;
	}

	@Override
	public void skillFunction(Player self,ArrayList<Monster> monsters,int i ) {
		// TODO Auto-generated method stub
		int damage = 100+self.getAttack();
		monsters.get(i).suffer_damage(damage, self.getName()+"使用飞踢,");
	}

}
