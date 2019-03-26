package entity.monster;

import javax.swing.ImageIcon;

public class SimpleTurtle extends Turtle {
     public SimpleTurtle(String name) { 
    	super(name,1+(int)(Math.random()*10));
 		this.image = (new ImageIcon("./util/7.png")).getImage();
     }
}
