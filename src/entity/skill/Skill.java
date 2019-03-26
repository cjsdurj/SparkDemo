
package entity.skill;

import java.util.ArrayList;

import entity.Player;
import entity.monster.Monster;
import view.Textdialog;

public abstract class Skill {
	protected String name ="";
	protected String description ="";
	protected int max_pp;
	protected int cur_pp;
	protected Type type;
	
	public boolean useSkill(Player self,ArrayList<Monster> monsters,int i) {
		if(cur_pp>0) {
			if(this.type ==Type.single) {
			skillFunction(self, monsters, i);}
			else if(this.type ==Type.all) {
				skillFunction(self, monsters);	
			}else {
				skillFunction(self);
			}
			this.cur_pp --;
			return true;
			
		}else {
			new Textdialog("该技能PP值不足，无法释放");
			return false;
		}
	}
	
	private void skillFunction(Player self) {};

	private void skillFunction(Player self, ArrayList<Monster> monsters) {};

	public void skillFunction(Player self,ArrayList<Monster> monsters,int i ) {};
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public Type getType() {
		return type;
	}

	public int getMax_pp() {
		return max_pp;
	}

	public int getCur_pp() {
		return cur_pp;
	}
	
	
}

