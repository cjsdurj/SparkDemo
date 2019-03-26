package entity.monster;

public class SimpleMonsterFactory extends MonsterFactory {

	@Override
	public   Monster getFrog() {
		// TODO Auto-generated method stub
		return new SimpleFrog("妙蛙种子");
	}

	@Override
	public Monster getTurtle() {
		// TODO Auto-generated method stub
		return new SimpleTurtle("杰尼龟");
	}

	@Override
	public Monster getDragon() {
		// TODO Auto-generated method stub
		return new SimpleDragon("小火龙");
	}

}
