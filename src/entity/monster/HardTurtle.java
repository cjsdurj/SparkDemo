package entity.monster;

import javax.swing.ImageIcon;

public class HardTurtle extends Turtle {

	public HardTurtle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HardTurtle(String name) {
		super(name,21+(int)(Math.random()*10));
 		this.image = (new ImageIcon("./util/9.png")).getImage();
	}

}
