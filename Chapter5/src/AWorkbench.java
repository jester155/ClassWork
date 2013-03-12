/*
 * Mark Provenzano
 * Chapter 5 Algorithm Workbench 1, 3, 5, 9, 10 
 * COP1000
 */
import java.util.Scanner;

public class AWorkbench {

		public static Scanner scan = new Scanner(System.in); //Public scanner object with a variable of 'scan'
		
	public static void main(String[] args) { //.main method
		menu();	

	}

	private static void one() { 	//.Algorithm work bench: Question 1
		
		int product = 0; 
			
			while(product < 100) { //Loops while product is less than 100
				System.out.println("What is a number");
					int x = scan.nextInt();
				product = x * 10;
			}
	}

	private static void three() { 	//.Algorithm work bench: Question 3
		
		for(int i = 0 ; i <= 1000 ; i = i + 10) { //loop that counts in increments of 10 from 0 to 1000
			System.out.println(i);		
		}

	}
	
	private static void five() {	//.Algorithm work bench: Question 5
		double t = 0;
		
		for(double i = 1 ; i <= 30 ; i++) {
			
			double p = 31;
			double x = p - i;
				t = i / x;
			System.out.println(i + " / " + x + " = " + t);
		}
	}
	
	private static void nine() {	//.Algorithm work bench: Question 9
		
		for (int count = 0 ; count < 50 ; count++) {
			System.out.println("The count is: " + count);
		}
	}
	
	private static void ten() { 	//.Algorithm work bench: Question 10
		
		int count = 1;
		
		while(count >= 1 && count <= 50) {
			System.out.println("The count is: " + count);
			count++;
		}
	}

	private static void menu() { 	//.Basic console if-else menu
		
		System.out.println("Which example would you like to run?");
		System.out.println("1: Question 1");
		System.out.println("2: Question 3");
		System.out.println("3: Question 5");
		System.out.println("4: Question 9");
		System.out.println("5: Question 10");
			int o = scan.nextInt();
			
			if(o == 1) {
				one();
			}
			else if(o == 2) {
				three();
			}
			else if(o == 3) {
				five();
			}
			else if(o == 4) {
				nine();
			}
			else if(o == 5) {
				ten();
			}
			else {
				System.out.println("Please enter a valid menu option!\n");
				menu();
			}
	}
}