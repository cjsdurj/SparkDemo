
package entity.potion;

import view.Textdialog;


public abstract class Potion {
	
	protected String name;
	protected String description;
	
	public Potion() {
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

    public abstract void Use();
	
    
}

        
    
    
    
    
    
    

