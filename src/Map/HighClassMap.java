package Map;
import java.util.Scanner;
import Character.*;

import Character.MiddleGradeMonster;
public class HighClassMap extends Map{
	int appropriateLevel=3;
	int Playerlevel;
	
	public HighClassMap(int thirdMapMonsterlevel)
	{
		Playerlevel = thirdMapMonsterlevel;
	}
	
	public void PassOrNot()
	{
		name="상급 맵";
		if(appropriateLevel<=Playerlevel) {
			System.out.println(name+"에 오신 걸 환영합니다.");
			System.out.println("전투시작");
				}
		else
		{
			System.out.println("레벨부족으로 인해"+name+"에 입장할 수 없습니다. ");
		}
		
	}
}