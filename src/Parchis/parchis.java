package Parchis;

import java.util.Scanner;

public class parchis {

	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		String cursor = s.nextLine();
		String[] cursorS = cursor.split(" ");
		while(!cursor.contentEquals("0 0 0"))
		{
			int meta = Integer.parseInt(cursorS[0]);
			int posicio = Integer.parseInt(cursorS[1]);
			int tirada = Integer.parseInt(cursorS[2]);
			int posFinal;
			if(posicio+tirada>=meta)
			{
				posFinal = meta-(tirada+posicio-meta);
			}
			else
			{
				posFinal = posicio+tirada;
			}
			System.out.println(posFinal);
			cursor = s.nextLine();
			cursorS = cursor.split(" ");
			//test
		}
	}
}
