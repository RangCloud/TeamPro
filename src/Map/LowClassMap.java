package Map;
import java.util.Scanner;
import Character.*;
public class LowClassMap extends Map {
	int appropriateLevel=1;
	int Playerlevel;
	
	public LowClassMap(int firstMapMonsterlevel)
	{
		Playerlevel = firstMapMonsterlevel;
	}
	
	public void PassOrNot() {

		name="하급 맵";
		if(appropriateLevel<=Playerlevel) {
			System.out.println(name+"에 오신 걸 환영합니다.");
			System.out.println("전투시작");	
	
	}
		else
		{
			System.out.println(name+"에 입장할 수 없음. 레벨오류발생");
		}
		
		
	}
	
}