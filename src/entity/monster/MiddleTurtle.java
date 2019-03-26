package entity.monster;

import javax.swing.ImageIcon;

public class MiddleTurtle extends Turtle {

	public MiddleTurtle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MiddleTurtle(String name) {
		super(name,11+(int)(Math.random()*10));
 		this.image = (new ImageIcon("./util/8.png")).getImage();
		
	}
	

}
