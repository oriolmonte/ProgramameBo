package sacher;

import java.util.Scanner;

public class sacher {
	
	public static void main(String[] args)
	{
		String cursor;
		Scanner s = new Scanner(System.in);
		long proves = Long.parseLong(s.nextLine());
		for(long i = 0; i<proves;i++)
		{
			int tabletas = 1;
			cursor = s.nextLine();
			String[] cursorS = cursor.split(" ");
			int ancho = Integer.parseInt(cursorS[0]);
			int alto = Integer.parseInt(cursorS[1]);
			int total = Integer.parseInt(cursorS[2]);
			int current = ancho*alto;
			while(current<total)
			{
				current += ancho*alto;
				tabletas++;
			}
			System.out.println(tabletas);
		}
		s.close();
	}

}
