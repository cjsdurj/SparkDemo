package entity.skill;

import java.util.ArrayList;

import entity.Player;
import entity.monster.Monster;
import view.Textdialog;

public class Wtlkh extends Skill {
    
	
	public Wtlkh() {
        
		this.name = "文体两开花";
		this.description ="        开花就完事了。对随机两个敌方单位造成攻击力*0.75 点伤害";
		this.on_the_offensive = false;
		this.max_pp =20;
		this.cur_pp =20;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void skillFunction(Player self, ArrayList<Monster> monsters) {
        int size = monsters.size();
        int damage =(int)(self.getAttack()*0.75);
		new Textdialog(self.getName()+"使用文体两开花");
        for(int i=0;i<2;i++) {
			int choice = (int)(Math.random()*size);
			monsters.get(choice).suffer_damage(damage, "");
			
		}

	}

}
