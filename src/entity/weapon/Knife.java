package entity.weapon;

import entity.Player;
import entity.Character;

public class Knife extends Weapon{
    

	public Knife() {
		this.name ="匕首";
		this.description = "默认的武器，没有特效";
		this.strength =0;
	}

	@Override
	public void attack_someone(Character c) {
		Player player= Player.getInstance(); 
		int damage =Player.getInstance().getCur_attack();
		c.suffer_damage(damage,player.getName()+"使用"+this.name+"，");
		}
		
	}

