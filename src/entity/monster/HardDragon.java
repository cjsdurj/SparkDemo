package entity.monster;

import javax.swing.ImageIcon;

public class HardDragon extends Dragon {

	public HardDragon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HardDragon(String name) {
		super(name,(int)(21+Math.random()*10));
 		this.image = (new ImageIcon("./util/6.png")).getImage();
	}

}
