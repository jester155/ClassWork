/*
 * Created by Mark Provenzano
 * Complete Menu with Examples of loops
 * NOOB FRIENDLY METHODS
 */
import java.util.*;

public class Loops {
		
		public static Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		menu();
	}
	
	private static void menu() {
		
		System.out.println("Which example would you like to run?");
		System.out.println("1: For Loop");
		System.out.println("2: While Loop");
			int o = scan.nextInt();
			
			if(o == 1) {
				forLoop();
			}
			else if(o == 2) {
				whileLoop();
			}
			else {
				System.out.println("Please enter a valid menu option!\n");
				menu();
			}
		
	}
	
	private static void forLoop() {
		
		int x = getInput();
		
		for( int i = 0 ; x > i ; i++ ) {
			System.out.println("Here is your line");
		}
	}
	
	private static void whileLoop() {
		
		int x = getInput();
		
		while (x > 0) {
			System.out.println(x +":" + "Here is your line");
			 x--;
		}
		
	} 
	
	private static int getInput() {
		System.out.println("Enter the number you times to print");
			int x = scan.nextInt();
	return x;
	}

}