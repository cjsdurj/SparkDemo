package entity.monster;

import javax.swing.ImageIcon;

public class SimpleFrog extends Frog {

	public SimpleFrog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SimpleFrog(String name) {
		super(name,1+(int)(Math.random()*10));
 		this.image = (new ImageIcon("./util/1.png")).getImage();
	}
   
}
