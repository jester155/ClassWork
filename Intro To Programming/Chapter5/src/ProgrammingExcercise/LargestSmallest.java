//Mark Provenzano
package ProgrammingExcercise;

import java.util.Scanner;

public class LargestSmallest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a series of numbers");
		
		int x = scan.nextInt(); 
		int y = 0;
		int holder1 = 0;
		int holder2 = 0;
		
		while(x != -99) {
			
			y = x;
			
			x = scan.nextInt();
			int z = x;
			
			 
			
			if(x > y)
				holder1 = x;
			
			if(x < y && z != -99 && y != 0 && x != 0)
				holder2 = x;
		}
		System.out.println(holder1 + " , " + holder2);
	}

}
