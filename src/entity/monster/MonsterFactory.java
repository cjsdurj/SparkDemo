package entity.monster;

public abstract class MonsterFactory {
	
	public abstract  Monster getFrog();
	public abstract  Monster getTurtle();
	public abstract Monster getDragon();
    
	public Monster getRandom() {
    	double a = Math.random();
    	if(a<0.33) {
    		return getFrog();
    	}
    	else if(a>=0.33&&a<0.67) {
    		return getTurtle();
    	}
    	else {
    		return  getDragon();
    	}
    }
}
