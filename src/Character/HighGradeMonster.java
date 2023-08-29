package Character;

public class HighGradeMonster extends Monster{
	
	// 생성자에서 몬스터 속성 초기화
	public HighGradeMonster() {
		this.name = "상급";
		this.monsterHp = 3000;
		this.monsterMp = 0;
		this.monsterLevel = 15;
		//this.power = (int)(Math.random() * 100) + 201; // 201 ~ 300 사이의 랜덤 데미지 생성
		this.monsterPower = 30;
		this.monsterDefense = 30;
		this.monsterMoney = 50;
		this.monsterExperience = 100;
	}
	
}