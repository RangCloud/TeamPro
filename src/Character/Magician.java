package Character;

import java.util.Scanner;

public class Magician extends Hero{
	public int attack() {
		int sum = 0;
		if(heroMp >= 10) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("1. �� ����");
			System.out.println("2. �� ��ź");
			System.out.println("���ݹ�ȣ�� �Է��ϼ���:");
			int number = scanner.nextInt();
			
			if(number == 1) {
				sum += heroLevel * 10;
				sum += heroPower * 15;
				sum += heroDefense * 5;
				System.out.println("��������" + sum + "�Դϴ�.");
				heroMp = heroMp - 5;
				return sum;
			}
			else if(number == 2) {
				sum += heroLevel * 8;
				sum += heroPower * 13;
				sum += heroDefense * 10;
				System.out.println("��������" + sum + "�Դϴ�.");
				heroMp = heroMp - 5;
				return sum;
			}
			System.out.println("��������" + sum + "�Դϴ�.");
			return sum;
		}
			else {
				System.out.println("heroMp�� �������� �ʽ��ϴ�.");
				return sum;
			}
		}
		
	}
