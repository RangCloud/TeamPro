package Attack;

public class HeroAt {
	
	public static int herAtpower;
	public static int herAtdefense;
	public static int herAthp;
	public static int herAtdamage;

	public static int HeroAttack(int heropow, int monsterdef, int monsterhp){
	
		herAthp = monsterhp;
		herAtpower = heropow;
		herAtdefense = monsterdef;
		herAtdamage = herAtdefense - herAtpower;
		
		if(herAtdamage < 0)
		{
			herAthp = herAthp + herAtdamage;
		}
		else
		{
			System.out.println("데미지가 들어가지 않았습니다.\n");
		}
		return herAthp;
	
	}
}