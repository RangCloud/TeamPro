package Character;

public class MiddleGradeMonster extends Monster{
	
	public MiddleGradeMonster() {
		this.name = "중급";
		this.monsterHp = 2000;
		this.monsterMp = 0;
		this.monsterLevel = 5;
		//this.power = (int)(Math.random() * 100) + 101; // 101 ~ 200 사이의 랜덤 데미지 생성 
		this.monsterPower  = 20;
		this.monsterDefense = 20;
		this.monsterMoney = 30;
		this.monsterExperience = 50;
	}
	


}