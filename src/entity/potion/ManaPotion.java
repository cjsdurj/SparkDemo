package entity.potion;

import entity.Player;
import entity.skill.Skill;
import view.Choosedialog;
import view.Textdialog;

public class ManaPotion extends Potion{

	public ManaPotion() {
		super();
		// TODO Auto-generated constructor stub
		this.name ="魔法药水";
	    this.description = "恢复一个技能的所有pp值";
	}

	@Override
	public void Use() {
		// TODO Auto-generated method stub
		Player player = Player.getInstance();
		Skill[] skills =player.getSkills(); 
		int choice =  new Choosedialog(skills).getChoice();
		skills[choice].setCur_pp(skills[choice].getMax_pp());
		new Textdialog(skills[choice].getName()+"的pp值已经回复满");
	}
	
	

}
