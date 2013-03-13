//Mark Provenzano
package ProgrammingExcercise;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a series of numbers.\nEnter in a negative number to exit the loop.");
		
		int sum = 0;		
		int x = 0;
		
		while(x >= 0) {
			
			x = scan.nextInt(); //.Variable of x is in the loop so that its not initialized out of the loop.
			
			if(x >= 0) //.If x is less than 0 then it is not added to sum.
				sum = sum + x;
		}
		
		System.out.println("Your total is: " + sum);
	}

}