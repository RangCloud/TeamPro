package Attack;

public class MonsterAt {

	public static int monATpower;
	public static int monATdefense;
	public static int monAThp;
	public static int monATdamage;
	
	public static int MonAttack(int monpow, int herodef, int herohp){
	
		monAThp = herohp;
		monATpower = monpow;
		monATdefense = herodef;
		monATdamage = monATdefense - monATpower;
		
		if(monATdamage < 0)
		{
			monAThp = monAThp + monATdamage;
		}
		else
		{
			System.out.println("�������� ���� �ʾҽ��ϴ�.\n");
		}
		return monAThp;
	
	}

}
