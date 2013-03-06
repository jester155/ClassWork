/*
Mark Provenzano
COP1000
Chapter 4 Exercise 1
Roman Numerals
*/

import java.util.Scanner;

public class RomanNumerals {
	
		public static Scanner scan = new Scanner( System.in );
	
	public static void main( String[] args ) {
		
		System.out.println( "Enter a number 1-10" );
			int x = scan.nextInt();
		
		convertNumber(x);
	} 
	
	private static void convertNumber( int y ) { //converts a number 1-10 into a Roman numeral
		if( y == 1 ) {
			System.out.println( "The Roman Numeral is I" );
		}
		else if( y == 2 ) {
			System.out.println( "The Roman Numeral is II" );
		}
		else if( y == 3 ) {
			System.out.println( "The Roman Numeral is III" );
		}
		else if( y == 4 ) {
			System.out.println( "The Roman Numeral is IV" );
		}
		else if( y == 5 ) {
			System.out.println( "The Roman Numeral is V" );
		}
		else if( y == 6 ) {
			System.out.println( "The Roman Numeral is VI" );
		}
		else if( y == 7 ) {
			System.out.println( "The Roman Numeral is VII" );
		}
		else if( y == 8 ) {
			System.out.println( "The Roman Numeral is VIII" );
		}
		else if( y == 9 ) {
			System.out.println( "The Roman Numeral is IX" );
		}
		else if( y == 10 ) {
			System.out.println( "The Roman Numeral is X" );
		}
		else {
			System.out.println( "You have entered an invalid number" );
		}
	}
}