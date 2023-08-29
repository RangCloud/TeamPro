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
		
		System.out.println("********RPG 게임********");
		System.out.println("1. 전사");
		System.out.println("2. 마법사");
		System.out.println("3. 궁수");
		System.out.print("직업의 번호를 입력하세요 : ");
		int number = scanner.nextInt();
		
		if(number == 1)
		{
			System.out.println("전사가 선택되었습니다.");
			player = new Warrior();
			player.heroDefense = 25;
			player.heroPower = 30;
			player.heroLevel = 1;
			player.heroHp = 150;
			player.heroMp = 0;
		}
		
		else if(number == 2)
		{
			System.out.println("마법사가 선택되었습니다.");
			player = new Magician();
			player.heroDefense = 10;
			player.heroPower = 20;
			player.heroLevel = 1;
			player.heroHp = 60;
			player.heroMp = 60;
		}
		
		else if(number == 3)
		{
			System.out.println("궁수가 선택되었습니다.");
			player = new Archer();
			player.heroDefense = 5;
			player.heroPower = 20;
			player.heroLevel = 1;
			player.heroHp = 50;
			player.heroMp = 0;
		}
		System.out.print("영웅의 이름을 입력하세요 : ");
		player.name = scanner.next();
		System.out.println("이름이 입력되었습니다.");
		System.out.println("게임에 입장하였습니다.");
		
		while(true)
		{
			System.out.println("************************");
			System.out.println("현재 당신의 이름 : "+player.name);
			System.out.println("현재 당신의 레벨 : "+player.heroLevel);
			System.out.println("현재 당신의 힘 : "+player.heroPower);
			System.out.println("현재 당신의 방어력 : "+player.heroDefense);
			System.out.println("현재 당신의 HP : "+player.heroHp);
			System.out.println("현재 당신의 MP : "+player.heroMp);
			System.out.println("현재 당신의 돈 : "+player.heroMoney+"원");
			System.out.println("현재 당신의 경험치 : "+player.heroExperience);
			System.out.println("************************");
			
			System.out.println("1. 사냥터");
			System.out.println("2. 무기 상점");
			System.out.println("3. 포션 상점");
			System.out.print("입장할 장소를 입력하세요.");
			number = scanner.nextInt();
			
			if(number == 1)
			{	
				System.out.println("1.하급 맵");
				System.out.println("2.중급 맵");
				System.out.println("3.상급 맵");
				
				System.out.println("입장할 장소를 입력하세요: ");
				number=scanner.nextInt();

				if(number==1)
				{	
					LowClassMap low = new LowClassMap(player.heroLevel);
					low.PassOrNot();
					LowGradeMonster Monster = new LowGradeMonster();
					System.out.println("몬스터가 출현했습니다.");
					System.out.println("************************");
					System.out.println("몬스터의 이름 : "+Monster.name);
					System.out.println("몬스터의 레벨 : "+Monster.monsterLevel);
					System.out.println("몬스터의 힘 : "+Monster.monsterPower);
					System.out.println("몬스터의 방어력 : "+Monster.monsterDefense);
					System.out.println("몬스터의 HP : "+Monster.monsterHp);
					System.out.println("몬스터의 MP : "+Monster.monsterMp);
					System.out.println("몬스터의 돈 : "+Monster.monsterMoney+"원");
					System.out.println("몬스터의 경험치 : "+Monster.monsterExperience);
					System.out.println("************************");
					
				}
				if(number==2)
				{
					MiddleClassMap middle=new MiddleClassMap(player.heroLevel);
					middle.PassOrNot();
					MiddleGradeMonster Monster = new MiddleGradeMonster();
					System.out.println("몬스터가 출현했습니다.");
					System.out.println("************************");
					System.out.println("몬스터의 이름 : "+Monster.name);
					System.out.println("몬스터의 레벨 : "+Monster.monsterLevel);
					System.out.println("몬스터의 힘 : "+Monster.monsterPower);
					System.out.println("몬스터의 방어력 : "+Monster.monsterDefense);
					System.out.println("몬스터의 HP : "+Monster.monsterHp);
					System.out.println("몬스터의 MP : "+Monster.monsterMp);
					System.out.println("몬스터의 돈 : "+Monster.monsterMoney+"원");
					System.out.println("몬스터의 경험치 : "+Monster.monsterExperience);
					System.out.println("************************");
					
				}
				if(number==3)
				{
					HighClassMap high = new HighClassMap(player.heroLevel);
					high.PassOrNot();
					HighGradeMonster Monster = new HighGradeMonster();
					System.out.println("몬스터가 출현했습니다.");
					System.out.println("************************");
					System.out.println("몬스터의 이름 : "+Monster.name);
					System.out.println("몬스터의 레벨 : "+Monster.monsterLevel);
					System.out.println("몬스터의 힘 : "+Monster.monsterPower);
					System.out.println("몬스터의 방어력 : "+Monster.monsterDefense);
					System.out.println("몬스터의 HP : "+Monster.monsterHp);
					System.out.println("몬스터의 MP : "+Monster.monsterMp);
					System.out.println("몬스터의 돈 : "+Monster.monsterMoney+"원");
					System.out.println("몬스터의 경험치 : "+Monster.monsterExperience);
					System.out.println("************************");

					
				}
				while(true)
				{
					
				System.out.println("영웅의 공격입니다.");
				Monster.monsterHp = HeroAt.HeroAttack(player.heroPower, Monster.monsterDefense, Monster.monsterHp);
				System.out.println("영웅이"+Math.abs(Monster.monsterDefense-player.heroPower)+"데미지를 입혔습니다.");
				System.out.println("몬스터의 현재 체력"+Monster.monsterHp);
				Thread.sleep(1000);
				if(Monster.monsterHp <= 0)
				{
					System.out.println("몬스터가 죽었습니다.");
					player.heroExperience += Monster.monsterExperience;
					player.heroMoney += Monster.monsterMoney;
					break;
				}
				System.out.println("몬스터의 공격입니다.");
				player.heroHp = MonsterAt.MonAttack(Monster.monsterPower, player.heroDefense, player.heroHp);
				System.out.println("몬스터가"+Math.abs(player.heroDefense-Monster.monsterPower)+"데미지를 입혔습니다.");
				System.out.println("영웅의 현재 체력"+player.heroHp);
				
				Thread.sleep(1000);
				if(player.heroHp <= 0)
				{
					System.out.println("영웅이 죽었습니다.");
					player.heroHp = 1;
					System.out.println("영웅의 체력"+player.heroHp+"으로 부활했습니다.");
					break;
				}
				
				}
			}
			
			else if(number == 2)
			{
				WeaponStore weaponStore = new WeaponStore();
				System.out.println("무기 상점에 입장하였습니다.");
				System.out.println("1. 공통 무기 (100원)");
				System.out.println("2. 공통 방패 (100원)");
				System.out.println("원하시는 물건을 입력하세요 : ");
				number = scanner.nextInt();
				int temp = player.heroMoney;
				if((player.heroMoney = weaponStore.show(player.heroMoney, number))!= -1)
				{
					System.out.println("구입이 완료되었습니다.");
					if(number == 1)
						player.heroPower += 5;
					if(number == 2)
						player.heroDefense += 5;
				}
				else
				{
					System.out.println("돈이 부족합니다.");
					player.heroMoney = temp;
				}
			}
			
			else if(number == 3)
			{
				PotionStore potionStore = new PotionStore();
				System.out.println("포션 상점에 입장하였습니다.");
				System.out.println("1. 힘 증강 포션 (100원)");
				System.out.println("2. 방어력 증강 포션 (100원)");
				System.out.println("3. 경험치 증강 포션 (300원)");
				System.out.println("4. HP 증강 포션 (10원)");
				System.out.println("5. MP 증강 포션 (10원)");
				System.out.println("원하시는 물건을 입력하세요 : ");
				number = scanner.nextInt();
				int temp = player.heroMoney;
				if((player.heroMoney = potionStore.show(player.heroMoney, number))!= -1)
				{
					System.out.println("구입이 완료되었습니다.");
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
					System.out.println("돈이 부족합니다.");
					player.heroMoney = temp;
				}
		}
			if(player.heroExperience >= player.heroLevel*100)
			{
				player.heroLevel += 1;
				System.out.println("영웅의 레벨이"+player.heroLevel+"이 되었습니다.");
				player.heroMoney += player.heroLevel*50;
				System.out.println("레벨업 기념으로 돈이"+player.heroLevel*50+"원 증가했습니다.");
				player.heroExperience = 0;
			}
		}
	}
}