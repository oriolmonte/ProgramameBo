package mundolimpio;

import java.util.Scanner;

public class MundoLimpio {
	
	public static void main (String args[])
	{
		String cursor;
		Scanner s = new Scanner(System.in);
		long proves = Long.parseLong(s.nextLine());
		for(long i = 0; i<proves;i++)
		{
			cursor = s.nextLine();
			String[] cursorS = cursor.split(" ");
			int netejes = Integer.parseInt(cursorS[0]);
			String[] hms = cursorS[1].split(":");
			int hores = Integer.parseInt(hms[0]);
			int minuts = Integer.parseInt(hms[1]);
			int segons = Integer.parseInt(hms[2]);
			long segonsTotals = netejes*(hores*3600+minuts*60+segons);
			String output = TurnIntoFormat(segonsTotals);
			System.out.println(output);

		}
	}
	static private String TurnIntoFormat(long totalSeconds)
	{
		int days, hours, minutes;
		hours = (int)Math.ceil(totalSeconds / 3600);
		days = (int)Math.ceil(hours / 24);
		hours %= 24;
		totalSeconds %= 3600;
		minutes = (int)Math.ceil(totalSeconds/60);
		totalSeconds %= 60;
		return days + " " + String.format("%02d",hours) + ":" +  String.format("%02d",minutes) + ":" + String.format("%02d",totalSeconds);
	}
}