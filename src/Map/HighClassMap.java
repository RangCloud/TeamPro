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
		name="��� ��";
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