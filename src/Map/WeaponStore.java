package Map;

public class WeaponStore extends Map{
	int commonWeapon = 100;
	int commonShield = 100;
	
	public int show(int money, int number){
		name = "���� ����";
		System.out.println(name+"���� ������ ���� �õ��ϴ� ���Դϴ�.");
		if(number == 1) {
			if(commonWeapon <= money)
				return money - commonWeapon;
		}
		if(number == 2) {
			if(commonShield <= money)
				return money - commonShield;
		}
		return - 1;
	}
}
