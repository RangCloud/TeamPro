package Character;

public class LowGradeMonster extends Monster{

	
	public LowGradeMonster() {
		this.name = "하급몬스터";
		this.monsterHp = 50;
		this.monsterMp = 0;
		this.monsterLevel = 1;
		//this.power = (int)(Math.random() * 100) + 1; // 1 ~ 100 사이의 랜덤 데미지 생성
		this.monsterPower = 10;
		this.monsterDefense = 0;
		this.monsterMoney = 10;
		this.monsterExperience = 10;
	}
	
	
}