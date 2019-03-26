package entity.monster;

import javax.swing.ImageIcon;

public class MiddleDragon extends Dragon {

	public MiddleDragon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MiddleDragon(String name) {
		super(name,11+(int)(Math.random()*10));
 		this.image = (new ImageIcon("./util/5.png")).getImage();
	}

}
