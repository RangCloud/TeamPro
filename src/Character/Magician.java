package Character;

import java.util.Scanner;

public class Magician extends Hero{
	public int attack() {
		int sum = 0;
		if(heroMp >= 10) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1. 불 지옥");
			System.out.println("2. 물 폭탄");
			System.out.println("공격번호를 입력하세요:");
			int number = scanner.nextInt();
			
			if(number == 1) {
				sum += heroLevel * 10;
				sum += heroPower * 15;
				sum += heroDefense * 5;
				System.out.println("데미지는" + sum + "입니다.");
				heroMp = heroMp - 5;
				return sum;
			}
			else if(number == 2) {
				sum += heroLevel * 8;
				sum += heroPower * 13;
				sum += heroDefense * 10;
				System.out.println("데미지는" + sum + "입니다.");
				heroMp = heroMp - 5;
				return sum;
			}
			System.out.println("데미지는" + sum + "입니다.");
			return sum;
		}
			else {
				System.out.println("heroMp가 남아있지 않습니다.");
				return sum;
			}
		}
		
	}
