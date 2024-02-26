package trifelios;

import java.util.Arrays;
import java.util.Scanner;

public class Trifelios {

	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		long proves = Long.parseLong(s.nextLine());
		for(long i = 0; i<proves;i++)
		{
			String cursor = s.nextLine();
			String[] cursorS = cursor.split(" ");
			cursorS[0] = cursorS[0].toLowerCase();
			cursorS[1] = cursorS[1].toLowerCase();	
			StringBuilder primera = new StringBuilder(cursorS[0]);
			StringBuilder segona = new StringBuilder(cursorS[1]);

			while(cursorS[0].contains("b"))
			{
				int b = cursorS[0].indexOf('b');
				primera.setCharAt(b,'v');
				cursorS[0]=primera.toString();
			}
			while(cursorS[1].contains("b"))
			{
				int b = cursorS[1].indexOf('b');
				segona.setCharAt(b,'v');
				cursorS[1]=segona.toString();
			}
			if(!cursorS[0].equals(cursorS[1]))
			{
				boolean trobat = false;
				int j = 0;
				while(!trobat && j<cursorS[0].length())
				{
					String substringCua = cursorS[0].substring(0, j);
					String substringPrincipi = cursorS[0].substring(j,cursorS[0].length());
					String concat = substringPrincipi+substringCua;
					if (concat.equals(cursorS[1]))
					{
						trobat = true;
					}
					j++;
				}
				if (trobat)
				{
					System.out.println("SI");			
				}
				else
					System.out.println("NO");			

			}
			else
				System.out.println("NO");			
		}
	}

}
