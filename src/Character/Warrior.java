package Character;

import java.util.Scanner;

public class Warrior extends Hero{
	public int attack() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("1. ������Ʈ");
	System.out.println("2. ��� ����");
	System.out.println("���ݹ�ȣ�� �Է��ϼ���:");
	int number = scanner.nextInt();
	
	int sum = 0;
	
	if(number == 1) {
		sum += heroLevel * 10;
		sum += heroPower * 30;
		System.out.println("��������"+sum+"�Դϴ�");
		return sum;
	}
	else if(number == 2) {
		sum += heroLevel * 10;
		sum += heroPower * 30;
		System.out.println("��������"+sum+"�Դϴ�");
		return sum;
	}
	System.out.println("��������"+sum+"�Դϴ�.");
	return sum;
	}
	
}
