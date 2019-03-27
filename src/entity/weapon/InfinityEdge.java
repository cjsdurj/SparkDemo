package entity.weapon;

import entity.Player;
import view.Textdialog;
import entity.Character;

public class InfinityEdge extends Weapon {
  
	

	public InfinityEdge() {
		
		// TODO Auto-generated constructor stub
		this.name ="无尽之刃";
	    this.description = "增加80攻击力，攻击有25%概率暴击，造成2倍伤害";
	    this.strength = 80;
	}

	@Override
	public void attack_someone(Character c) {
		// TODO Auto-generated method stub
		Player player= Player.getInstance(); 
		int damage =Player.getInstance().getCur_attack();
		
		double prob = Math.random();
		
		if(prob<0.25) {
			c.suffer_damage(2*damage,"暴击！"+player.getName()+"使用"+this.name+"，");
		}
		else {
		c.suffer_damage(damage,player.getName()+"使用"+this.name+"，"); }
		
		
	}

}
