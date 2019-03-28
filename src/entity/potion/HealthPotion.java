package entity.potion;

import entity.Player;
import view.Textdialog;

public class HealthPotion extends Potion {

	public HealthPotion() {
		super();
		this.name ="生命药水";
		this.description ="回复人物所有生命值";
	}

	@Override
	public void Use() {
		Player player = Player.getInstance();
		new Textdialog(player.getName()+"使用了生命药水，精神满满");
		player.setCur_hp(player.getHp());
		
	}
       
}
