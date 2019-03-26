package entity.monster;

public class HardMonsterFactory extends MonsterFactory {

	@Override
	public Monster getFrog() {
		// TODO Auto-generated method stub
		return new HardFrog("妙蛙花");
	}

	@Override
	public Monster getTurtle() {
		// TODO Auto-generated method stub
		return new HardTurtle("水箭龟");
	}

	@Override
	public Monster getDragon() {
		// TODO Auto-generated method stub
		return new HardDragon("喷火龙");
	}

}
