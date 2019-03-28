package entity.skill;

import java.util.ArrayList;

import entity.Player;
import entity.monster.Monster;

public class NullSkill extends Skill {
	
	public NullSkill() {
		super();
		this.name ="空技能";
		this.on_the_offensive = false;
	}

	@Override
	public void skillFunction(Player self, ArrayList<Monster> monsters) {
		// TODO Auto-generated method stub
		
	}


}
