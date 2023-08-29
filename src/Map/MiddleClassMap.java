package Map;
import java.util.Scanner;
import Character.*;
public class MiddleClassMap extends Map {
	int appropriateLevel=2;
	int Playerlevel;
	
	public MiddleClassMap(int secondMapMonsterlevel)
	{
		Playerlevel = secondMapMonsterlevel;
	}
	
	public void PassOrNot()
	{
		
		name="중급 맵";
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