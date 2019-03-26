package entity.monster;

import javax.swing.ImageIcon;

public class SimpleDragon extends Dragon {

	public SimpleDragon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SimpleDragon(String name) {
		super(name,1+(int)(Math.random()*10));
 		this.image = (new ImageIcon("./util/4.png")).getImage();
	}

}
