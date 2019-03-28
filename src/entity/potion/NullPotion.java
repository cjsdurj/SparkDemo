package entity.potion;

public class NullPotion extends Potion{
      public NullPotion() {
    	  super();
    	  this.name ="空物品";
    	  this.description ="这里没有物品";
      }

	@Override
	public void Use() {
		// TODO Auto-generated method stub
		
	}
}
