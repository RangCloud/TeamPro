package Character;

import java.util.Scanner;

public class Warrior extends Hero{
	public int attack() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("1. 쓰러스트");
	System.out.println("2. 삼단 베기");
	System.out.println("공격번호를 입력하세요:");
	int number = scanner.nextInt();
	
	int sum = 0;
	
	if(number == 1) {
		sum += heroLevel * 10;
		sum += heroPower * 30;
		System.out.println("데미지는"+sum+"입니다");
		return sum;
	}
	else if(number == 2) {
		sum += heroLevel * 10;
		sum += heroPower * 30;
		System.out.println("데미지는"+sum+"입니다");
		return sum;
	}
	System.out.println("데미지는"+sum+"입니다.");
	return sum;
	}
	
}
