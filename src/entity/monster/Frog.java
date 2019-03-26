package entity.monster;

public class Frog extends Monster {

	public Frog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Frog(String name, int level) {
		super(name, level);
		// TODO Auto-generated constructor stub
		intelligence= 20 + level * 5;
		agility = 10 + level * 3;
		strength = 15 +level*4;
		this.update_attributes();
	}
	
	

}
