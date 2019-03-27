package entity.weapon;

import entity.Player;
import view.Textdialog;
import entity.Character;

public class Bloodthirster extends Weapon{
     
	
	public Bloodthirster() {
		
		this.name = "饮血剑";
		this.description = "增加50攻击力，造成伤害的20%治疗自己";
		this.strength =50;
	}

	@Override
	public void attack_someone(Character c) {
		// TODO Auto-generated method stub
		Player player= Player.getInstance(); 
		int damage =Player.getInstance().getCur_attack();
		c.suffer_damage(damage,player.getName()+"使用"+this.name+"，");
		player.add_hp((int)(damage*0.2));
		new Textdialog(player.getName()+"治疗自己"+(int)(damage*0.2)+"点血");
		
	}

}
