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
		
		name="�߱� ��";
		if(appropriateLevel<=Playerlevel) {
			System.out.println(name+"�� ���� �� ȯ���մϴ�.");
			System.out.println("��������");
			
	}
		else
		{
			System.out.println("������������ ����"+name+"�� ������ �� �����ϴ�. ");
		}
		
	}
}