package entity.monster;

public class Dragon extends Monster {

	public Dragon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dragon(String name, int level) {
		super(name, level);
		// TODO Auto-generated constructor stub
		agility  = 20 + level * 5;
		intelligence = 10 + level * 3;
		strength = 15 +level*4;
		this.update_attributes();
	}
    
}
