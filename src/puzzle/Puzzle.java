package puzzle;

import java.util.Scanner;

public class Puzzle {

	    public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String cursor = s.nextLine();
			while (!cursor.equals("0"))
			{			        
				int superficie = Integer.parseInt(cursor);
				int root = (int)Math.sqrt(superficie);
				while (superficie%root!=0)
				{
					root--;
				}
				int result = superficie/root;
				System.out.println(result);
				cursor=s.nextLine();
			}
	    }
}


