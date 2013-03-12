package ProgrammingExcercise;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter in a series of numbers.\nEnter in a negative number to exit the loop.");
		
		int sum = 0;		
		int y = 0;
		
		while(y  == 0) {
			
			int x = scan.nextInt();
			
			if(x > 0)
				sum = sum + x;
			
			if(x < 0)
				y = -1;
		}
		
		System.out.println("Your total is: " + sum);
	}

}