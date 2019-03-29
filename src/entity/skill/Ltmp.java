package entity.skill;

import java.util.ArrayList;

import entity.Player;
import entity.monster.Monster;
import entity.state.StrengthenedState;
import view.Textdialog;

public class Ltmp extends Skill {
    
	public Ltmp() {
		
		this.name = "零糖麦片";
		this.description ="        麦片不含糖，中老年人居家旅行必备养生品；使用立即回复自己50%最大生命值";
		this.on_the_offensive = true;
		this.max_pp =30;
		this.cur_pp =30;
	}

	@Override
	public void skillFunction(Player self, ArrayList<Monster> monsters) {
		// TODO Auto-generated method stub
		new Textdialog(self.getName()+"使用了零糖麦片，元气满满");
        self.add_hp((int)(0.5*self.getHp()));
	}

}
