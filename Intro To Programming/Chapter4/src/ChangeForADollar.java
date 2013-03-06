/*
Mark Provenzano
COP1000
Chapter 4 Program Exercise 8
Change For a Dollar
*/
import java.util.Scanner;

public class ChangeForADollar {

		public static Scanner scan = new Scanner( System.in );
	
	public static void main( String[] args ) {
	
		collectInput();
	}
	
	public static void collectInput() {
		
	//declared variables
		int pennies;
		int nickles;
		int dimes;
		int quarters;
	
	//Collects needed user input
		System.out.println( "Enter the number of pennies." );
			pennies = scan.nextInt();
	
		System.out.println( "Enter the number of nickels." );
			nickles = scan.nextInt();
	
		System.out.println( "Enter the number of dimes." );
			dimes =  scan.nextInt();
	
		System.out.println( "Enter the number of quarters." );
			quarters = scan.nextInt();
		
		dMath( pennies , nickles , dimes , quarters );
	}
	
	private static void dMath( int p , int n , int d , int q ) {
		
		int tNickles;
		int tDimes;
		int tQuarters;
		int total;
		
	//changes to true values
		tNickles = n * 5;
		tDimes = d * 10;
		tQuarters = q * 25;
	
		total = p + tNickles + tDimes + tQuarters;
		
		findResult( total );
	}
	
	private static void findResult( int t ) {
	//Finds the result for Win or Loss
		if( t == 100 ) {
			System.out.println( "Congradulations you won a dollar!" );
		}
		else if( t > 100 ) {
			System.out.println( "Your changes is greater than a dollar." );
		}	 
		else {
			System.out.println( "Your change is less than a dollar." );
		}
	}
}