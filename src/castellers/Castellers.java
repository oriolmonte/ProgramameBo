package castellers;

import java.util.Arrays;
import java.util.Scanner;

public class Castellers {
	
	public static void main (String args[])
	{
		Scanner s = new Scanner(System.in);
		long proves = Long.parseLong(s.nextLine());
		for(long i = 0; i<proves;i++)
		{
			String entradaRaw = s.nextLine();
			String [] entradaRawA = entradaRaw.split(" ");
			int grupSize = Integer.parseInt(entradaRawA[0]);
			int colla = Integer.parseInt(entradaRawA[1]);
			int possiblesGrups= colla/grupSize;
			String castellersS = s.nextLine();
			String [] castellersA = castellersS.split(" ");
			int[] castellers = new int[castellersA.length];
			for(int j=0;j<colla;j++)
			{
				castellers[j]=Integer.parseInt(castellersA[j]);
			}	
			Arrays.sort(castellers);
			int grups = Grups(castellers,possiblesGrups,grupSize);
			System.out.println(grups);
			
			
		}
	}
	public static int Grups(int[] castellers, int possiblesGrups,int grupSize)
	{
		int grups = 0;
		int i = 0;
		int j = 1;
		while(grups<possiblesGrups && i<castellers.length)
		{
			if(castellers[i+1]-castellers[i]<=15)
			{
				i++;
				j++;
				if (j==grupSize)
				{
					grups++;
					j=0;
				}
			}
			else
			{
				i++;
				j=0;
			}
		}
		return grups;
	}
	public static boolean GrupCorrecte(int)
}
