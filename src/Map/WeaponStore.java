package Map;

public class WeaponStore extends Map{
	int commonWeapon = 100;
	int commonShield = 100;
	
	public int show(int money, int number){
		name = "무기 상점";
		System.out.println(name+"에서 물건을 구매 시도하는 중입니다.");
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
