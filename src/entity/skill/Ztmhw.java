package entity.skill;

import java.util.ArrayList;

import entity.Player;
import entity.monster.Monster;

public class Ztmhw extends Skill {
    
	
	public Ztmhw() {
        this.name = "正统美猴王";
		this.description ="        戏说不是胡说，改编不是乱编！正统美猴王令模仿者汗颜，"
				+ "增加自己100%攻击力，无视任何攻击，持续2回合";
		this.on_the_offensive = false;
		this.max_pp =5;
		this.cur_pp =5;
	
	}

	@Override
	public void skillFunction(Player self, ArrayList<Monster> monsters) {
		// TODO Auto-generated method stub

	}

}
