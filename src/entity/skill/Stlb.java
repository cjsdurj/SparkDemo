package entity.skill;

import java.util.ArrayList;

import entity.Player;
import entity.monster.Monster;
import view.Choosedialog;
import view.Textdialog;

public class Stlb extends Skill {
     
	public Stlb() {
		this.name = "三头六臂";
		this.description ="        幻化出三头六臂，尽显神通；每个头都能造成一次"
				+ "独立攻击，伤害递增：第一次攻击：0.6*攻击力，第二次攻击："
				+ "1.2*攻击力，第三次攻击：2.4*攻击力。";
		this.on_the_offensive = false;
		this.max_pp =10;
		this.cur_pp =10;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skillFunction(Player self, ArrayList<Monster> monsters) {
		// TODO Auto-generated method stub
		    int size = monsters.size();
		    int damage =(int)(self.getAttack()*0.6);
			new Textdialog(self.getName()+"使用三头六臂显神通");
	        for(int i=0;i<3;i++) {
				int choice = new Choosedialog(monsters).getChoice();
				monsters.get(choice).suffer_damage(damage, "");
				damage = damage*2;
			}
	}

}
