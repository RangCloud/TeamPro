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

		name="�ϱ� ��";
		if(appropriateLevel<=Playerlevel) {
			System.out.println(name+"�� ���� �� ȯ���մϴ�.");
			System.out.println("��������");	
	
	}
		else
		{
			System.out.println(name+"�� ������ �� ����. ���������߻�");
		}
		
		
	}
	
}