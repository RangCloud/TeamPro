package Character;

import java.util.Scanner;

public class Archer extends Hero {

	public int attack() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. ȭ�� ����");
		System.out.println("2. ���� ȭ�� ����");
		System.out.println("���� ��ȣ�� �Է��ϼ���:");
		int number = scanner.nextInt();
	
	
	int sum = 0;
	
	if(number == 1) {
		sum += heroLevel * 15;
		sum += heroPower * 15;
		sum += heroDefense * 15;
		System.out.println("��������" + sum + "�Դϴ�.");
		return sum;
	}
	
	else if(number == 2) {
		sum += heroLevel * 10;
		sum += heroPower * 20;
		sum += heroDefense * 10;
		System.out.println("��������" + sum + "�Դϴ�.");
		return sum;
	}
	System.out.println("��������" + sum + "�Դϴ�.");
	return sum;
	}
	
}