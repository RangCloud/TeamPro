package Map;

import java.util.Scanner;

public class PotionStore extends Map{
	int powerPotion = 100;
	int defensePotion = 100;
	int experiencePotion = 300;
	int hpPotion = 10;
	int mpPotion = 10;
	
	public int show(int money, int number) {
		name = "포션 상점";
		System.out.println(name + "에서 물건을 구매 시도하는 중입니다.");
		if(number == 1) {
			if(powerPotion <= money)
				return money - powerPotion;
		}
		if(number == 2) {
			if(defensePotion <= money)
				return money - defensePotion;
		}
		if(number == 3) {
			if(experiencePotion <= money)
				return money - experiencePotion;
		}
		if(number == 4) {
			if(hpPotion <= money)
				return money - hpPotion;
		}
		if(number == 5) {
			if(mpPotion <= money)
				return money - mpPotion;
		}
		return - 1;
	}
}
