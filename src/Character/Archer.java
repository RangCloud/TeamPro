package Character;

import java.util.Scanner;

public class Archer extends Hero {

	public int attack() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 화살 공격");
		System.out.println("2. 연속 화살 공격");
		System.out.println("공격 번호를 입력하세요:");
		int number = scanner.nextInt();
	
	
	int sum = 0;
	
	if(number == 1) {
		sum += heroLevel * 15;
		sum += heroPower * 15;
		sum += heroDefense * 15;
		System.out.println("데미지는" + sum + "입니다.");
		return sum;
	}
	
	else if(number == 2) {
		sum += heroLevel * 10;
		sum += heroPower * 20;
		sum += heroDefense * 10;
		System.out.println("데미지는" + sum + "입니다.");
		return sum;
	}
	System.out.println("데미지는" + sum + "입니다.");
	return sum;
	}
	
}