package entity.monster;

import javax.swing.ImageIcon;

public class HardFrog extends Frog {

	public HardFrog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HardFrog(String name) {
		super(name,(int)(21+Math.random()*10));
 		this.image = (new ImageIcon("./util/3.png")).getImage();
		// TODO Auto-generated constructor stub
	}

}
