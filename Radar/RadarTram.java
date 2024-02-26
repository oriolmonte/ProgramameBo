package Radar;

import java.util.Scanner;

public class RadarTram {
	
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		String cursor = s.nextLine();
		String[] cursorS = cursor.split(" ");
		while(!cursor.contentEquals("0 0 0"))
		{
			double distancia = Integer.parseInt(cursorS[0])/1000.00;
			int velMax = Integer.parseInt(cursorS[1]);
			double temps = Integer.parseInt(cursorS[2])/3600.00;
			if (distancia<=0 || velMax <=0 || temps<=0)
			{
				System.out.println("ERROR");
			}
			else
			{
				double actualVel = distancia/temps;
				if(actualVel>velMax)
				{
					double diff = (actualVel-velMax)/velMax;
					if (diff<0.2)
					{
						
						System.out.println("MULTA");
					}
					else
					{
						System.out.println("PUNTOS");
					}
				}
				else
				{
					System.out.println("OK");
				}
			}
			cursor = s.nextLine();
			cursorS = cursor.split(" ");
		}
		s.close();
		
	}

}
