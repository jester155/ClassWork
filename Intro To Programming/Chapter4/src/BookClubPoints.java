/*
Mark Provenzano
COP1000 
Chapter 4 Program Exercise 6
Book Club Points
*/

import java.util.Scanner;

public class BookClubPoints {
	
		public static Scanner scan = new Scanner( System.in );
	
	public static void main( String[] args ) {
	
		System.out.println( "Enter the number of books you have purchased this month." );
			int books = scan.nextInt();
		
		pointsEarned( books );
	}
	
	private static void pointsEarned( int q ) {
		
	//Takes the number of books you have entered and totals out the points
		switch ( q ) {
			case 0: System.out.println( "You have earned 0 points." );
				break;
		
			case 1: System.out.println( "You have earned 5 points." );
				break;
		
			case 2: System.out.println( "You have earned 15 points." );
				break;
		
			case 3: System.out.println( "You have earned 30 points." );
				break;
		
			case 4: System.out.println( "You have earned 60 points." );
				break;
			
			default: System.out.println( q + " is an invalid number of books." );
				break;
		}
	}
}