package entity.monster;

public abstract class Turtle extends Monster {
	public Turtle() {}
	public Turtle (String name,int level) {
		super(name,level);
		strength = 20 + level * 5;
		agility = 10 + level * 3;
		intelligence = 15 +level*4;
		this.update_attributes();
	}
}
