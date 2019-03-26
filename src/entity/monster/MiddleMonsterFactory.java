package entity.monster;

public class MiddleMonsterFactory extends MonsterFactory {

	@Override
	public Monster getFrog() {
		// TODO Auto-generated method stub
		return new MiddleFrog("妙蛙草");
	}

	@Override
	public Monster getTurtle() {
		// TODO Auto-generated method stub
		return new MiddleTurtle("卡咪龟");
	}

	@Override
	public Monster getDragon() {
		// TODO Auto-generated method stub
		return new MiddleDragon("火恐龙");
	}

}
