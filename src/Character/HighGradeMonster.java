package Character;

public class HighGradeMonster extends Monster{
	
	// �����ڿ��� ���� �Ӽ� �ʱ�ȭ
	public HighGradeMonster() {
		this.name = "���";
		this.monsterHp = 3000;
		this.monsterMp = 0;
		this.monsterLevel = 15;
		//this.power = (int)(Math.random() * 100) + 201; // 201 ~ 300 ������ ���� ������ ����
		this.monsterPower = 30;
		this.monsterDefense = 30;
		this.monsterMoney = 50;
		this.monsterExperience = 100;
	}
	
}