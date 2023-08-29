package Main;

import java.util.Scanner;

import Attack.HeroAt;
import Attack.MonsterAt;
import Character.Archer;
import Character.Hero;
import Character.HighGradeMonster;
import Character.LowGradeMonster;
import Character.Magician;
import Character.MiddleGradeMonster;
import Character.Monster;
import Character.Warrior;
import Map.HighClassMap;
import Map.LowClassMap;
import Map.MiddleClassMap;
import Map.PotionStore;
import Map.WeaponStore;

public class GameMain {

	//private static int number;
	//private static player monster;

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		
		Hero player = new Hero();
		
		System.out.println("********RPG ����********");
		System.out.println("1. ����");
		System.out.println("2. ������");
		System.out.println("3. �ü�");
		System.out.print("������ ��ȣ�� �Է��ϼ��� : ");
		int number = scanner.nextInt();
		
		if(number == 1)
		{
			System.out.println("���簡 ���õǾ����ϴ�.");
			player = new Warrior();
			player.heroDefense = 25;
			player.heroPower = 30;
			player.heroLevel = 1;
			player.heroHp = 150;
			player.heroMp = 0;
		}
		
		else if(number == 2)
		{
			System.out.println("�����簡 ���õǾ����ϴ�.");
			player = new Magician();
			player.heroDefense = 10;
			player.heroPower = 20;
			player.heroLevel = 1;
			player.heroHp = 60;
			player.heroMp = 60;
		}
		
		else if(number == 3)
		{
			System.out.println("�ü��� ���õǾ����ϴ�.");
			player = new Archer();
			player.heroDefense = 5;
			player.heroPower = 20;
			player.heroLevel = 1;
			player.heroHp = 50;
			player.heroMp = 0;
		}
		System.out.print("������ �̸��� �Է��ϼ��� : ");
		player.name = scanner.next();
		System.out.println("�̸��� �ԷµǾ����ϴ�.");
		System.out.println("���ӿ� �����Ͽ����ϴ�.");
		
		while(true)
		{
			System.out.println("************************");
			System.out.println("���� ����� �̸� : "+player.name);
			System.out.println("���� ����� ���� : "+player.heroLevel);
			System.out.println("���� ����� �� : "+player.heroPower);
			System.out.println("���� ����� ���� : "+player.heroDefense);
			System.out.println("���� ����� HP : "+player.heroHp);
			System.out.println("���� ����� MP : "+player.heroMp);
			System.out.println("���� ����� �� : "+player.heroMoney+"��");
			System.out.println("���� ����� ����ġ : "+player.heroExperience);
			System.out.println("************************");
			
			System.out.println("1. �����");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� ����");
			System.out.print("������ ��Ҹ� �Է��ϼ���.");
			number = scanner.nextInt();
			
			if(number == 1)
			{	
				System.out.println("1.�ϱ� ��");
				System.out.println("2.�߱� ��");
				System.out.println("3.��� ��");
				
				System.out.println("������ ��Ҹ� �Է��ϼ���: ");
				number=scanner.nextInt();

				if(number==1)
				{	
					LowClassMap low = new LowClassMap(player.heroLevel);
					low.PassOrNot();
					LowGradeMonster Monster = new LowGradeMonster();
					System.out.println("���Ͱ� �����߽��ϴ�.");
					System.out.println("************************");
					System.out.println("������ �̸� : "+Monster.name);
					System.out.println("������ ���� : "+Monster.monsterLevel);
					System.out.println("������ �� : "+Monster.monsterPower);
					System.out.println("������ ���� : "+Monster.monsterDefense);
					System.out.println("������ HP : "+Monster.monsterHp);
					System.out.println("������ MP : "+Monster.monsterMp);
					System.out.println("������ �� : "+Monster.monsterMoney+"��");
					System.out.println("������ ����ġ : "+Monster.monsterExperience);
					System.out.println("************************");
					
				}
				if(number==2)
				{
					MiddleClassMap middle=new MiddleClassMap(player.heroLevel);
					middle.PassOrNot();
					MiddleGradeMonster Monster = new MiddleGradeMonster();
					System.out.println("���Ͱ� �����߽��ϴ�.");
					System.out.println("************************");
					System.out.println("������ �̸� : "+Monster.name);
					System.out.println("������ ���� : "+Monster.monsterLevel);
					System.out.println("������ �� : "+Monster.monsterPower);
					System.out.println("������ ���� : "+Monster.monsterDefense);
					System.out.println("������ HP : "+Monster.monsterHp);
					System.out.println("������ MP : "+Monster.monsterMp);
					System.out.println("������ �� : "+Monster.monsterMoney+"��");
					System.out.println("������ ����ġ : "+Monster.monsterExperience);
					System.out.println("************************");
					
				}
				if(number==3)
				{
					HighClassMap high = new HighClassMap(player.heroLevel);
					high.PassOrNot();
					HighGradeMonster Monster = new HighGradeMonster();
					System.out.println("���Ͱ� �����߽��ϴ�.");
					System.out.println("************************");
					System.out.println("������ �̸� : "+Monster.name);
					System.out.println("������ ���� : "+Monster.monsterLevel);
					System.out.println("������ �� : "+Monster.monsterPower);
					System.out.println("������ ���� : "+Monster.monsterDefense);
					System.out.println("������ HP : "+Monster.monsterHp);
					System.out.println("������ MP : "+Monster.monsterMp);
					System.out.println("������ �� : "+Monster.monsterMoney+"��");
					System.out.println("������ ����ġ : "+Monster.monsterExperience);
					System.out.println("************************");

					
				}
				while(true)
				{
					
				System.out.println("������ �����Դϴ�.");
				Monster.monsterHp = HeroAt.HeroAttack(player.heroPower, Monster.monsterDefense, Monster.monsterHp);
				System.out.println("������"+Math.abs(Monster.monsterDefense-player.heroPower)+"�������� �������ϴ�.");
				System.out.println("������ ���� ü��"+Monster.monsterHp);
				Thread.sleep(1000);
				if(Monster.monsterHp <= 0)
				{
					System.out.println("���Ͱ� �׾����ϴ�.");
					player.heroExperience += Monster.monsterExperience;
					player.heroMoney += Monster.monsterMoney;
					break;
				}
				System.out.println("������ �����Դϴ�.");
				player.heroHp = MonsterAt.MonAttack(Monster.monsterPower, player.heroDefense, player.heroHp);
				System.out.println("���Ͱ�"+Math.abs(player.heroDefense-Monster.monsterPower)+"�������� �������ϴ�.");
				System.out.println("������ ���� ü��"+player.heroHp);
				
				Thread.sleep(1000);
				if(player.heroHp <= 0)
				{
					System.out.println("������ �׾����ϴ�.");
					player.heroHp = 1;
					System.out.println("������ ü��"+player.heroHp+"���� ��Ȱ�߽��ϴ�.");
					break;
				}
				
				}
			}
			
			else if(number == 2)
			{
				WeaponStore weaponStore = new WeaponStore();
				System.out.println("���� ������ �����Ͽ����ϴ�.");
				System.out.println("1. ���� ���� (100��)");
				System.out.println("2. ���� ���� (100��)");
				System.out.println("���Ͻô� ������ �Է��ϼ��� : ");
				number = scanner.nextInt();
				int temp = player.heroMoney;
				if((player.heroMoney = weaponStore.show(player.heroMoney, number))!= -1)
				{
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					if(number == 1)
						player.heroPower += 5;
					if(number == 2)
						player.heroDefense += 5;
				}
				else
				{
					System.out.println("���� �����մϴ�.");
					player.heroMoney = temp;
				}
			}
			
			else if(number == 3)
			{
				PotionStore potionStore = new PotionStore();
				System.out.println("���� ������ �����Ͽ����ϴ�.");
				System.out.println("1. �� ���� ���� (100��)");
				System.out.println("2. ���� ���� ���� (100��)");
				System.out.println("3. ����ġ ���� ���� (300��)");
				System.out.println("4. HP ���� ���� (10��)");
				System.out.println("5. MP ���� ���� (10��)");
				System.out.println("���Ͻô� ������ �Է��ϼ��� : ");
				number = scanner.nextInt();
				int temp = player.heroMoney;
				if((player.heroMoney = potionStore.show(player.heroMoney, number))!= -1)
				{
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					if(number == 1)
						player.heroPower += 3;
					if(number == 2)
						player.heroDefense += 3;
					if(number == 3)
						player.heroExperience += 50;
					if(number == 4)
						player.heroHp += 50;
					if(number == 5)
						player.heroMp += 50;
			}
				
				else
				{
					System.out.println("���� �����մϴ�.");
					player.heroMoney = temp;
				}
		}
			if(player.heroExperience >= player.heroLevel*100)
			{
				player.heroLevel += 1;
				System.out.println("������ ������"+player.heroLevel+"�� �Ǿ����ϴ�.");
				player.heroMoney += player.heroLevel*50;
				System.out.println("������ ������� ����"+player.heroLevel*50+"�� �����߽��ϴ�.");
				player.heroExperience = 0;
			}
		}
	}
}