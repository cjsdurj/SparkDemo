
package entity.skill;

import java.util.ArrayList;

import entity.Character;
import entity.Player;
import entity.monster.Monster;
import view.Textdialog;

public abstract class Skill {
	protected String name ="";
	protected String description ="";
	protected int max_pp;
	protected int cur_pp;
	protected boolean on_the_offensive;
	
	public void useSkill(Player self,ArrayList<Monster> monsters) {
		if(canUseSkill()) {
			
			ArrayList<Character> order = new ArrayList<Character>();
			
			if(this.is_OnTheOffensive()) {
			skillFunction(self, monsters);
			order.addAll(monsters);
			order.sort(null);
			}else {
				order.add(self);
				order.addAll(monsters);
				order.sort(null);	
			}
			
			for(Character c:order) {
				if(c instanceof Player) {
					skillFunction(self, monsters);
				}else if(c instanceof Monster) {
					c.attack_someone(self);
				}
			}
			
			this.cur_pp --;	
		}
	}
	
	public boolean canUseSkill() {
		if(cur_pp>0) return true;
		else {
			if(this.name.equals("空技能"))  return false;
			new Textdialog("该技能PP值不足，无法释放");
			return false;
		}
	}
	
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Skill other = (Skill) obj;
		return  this.name.equals(other.getName());
	}

	public abstract void skillFunction(Player self, ArrayList<Monster> monsters);

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public boolean is_OnTheOffensive() {
		return on_the_offensive;
	}

	public int getMax_pp() {
		return max_pp;
	}

	public int getCur_pp() {
		return cur_pp;
	}

	public void setCur_pp(int cur_pp) {
		this.cur_pp = cur_pp;
	}
	
	
}

