package entity.weapon;

import entity.Player;
import entity.Character;

public class NullWeapon extends Weapon{
    

	public NullWeapon() {
		this.name ="空武器";
		this.description = "没有武器";
		this.strength =0;
	}

	@Override
	public void attack_someone(Character c) {
		Player player= Player.getInstance(); 
		int damage =Player.getInstance().getCur_attack();
		c.suffer_damage(damage,player.getName()+"赤手空拳，");
		}
		
	}

