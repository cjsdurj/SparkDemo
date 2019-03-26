package entity.monster;

import javax.swing.ImageIcon;

public class MiddleFrog extends Frog {

	public MiddleFrog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MiddleFrog(String name) {
		super(name,(int)(11+Math.random()*10));
 		this.image = (new ImageIcon("./util/2.png")).getImage();
		// TODO Auto-generated constructor stub
	}
	

}
