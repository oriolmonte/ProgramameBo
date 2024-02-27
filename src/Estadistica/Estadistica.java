package Estadistica;
import java.util.Scanner;
public class Estadistica {
	public static final int DEN = 10000;
	public static void main (String[] args)
	{
		int stat;
		Scanner s = new Scanner(System.in);
		long proves = s.nextLong();
		for(long i = 0; i<proves;i++)
		{
			stat = s.nextInt();
			int mcd = Euclides(stat, DEN);
			int mostra = DEN/mcd;
			System.out.println(mostra);
		}
		s.close();
	}
	public static int Euclides (int stat, int den)
	{
		int big = den;
		int small = stat;
		int remainder = big%small;
		while (remainder!=0)
		{
			big = small;
			small = remainder;
			remainder = big%small;
		}
		return small;
	}

}
