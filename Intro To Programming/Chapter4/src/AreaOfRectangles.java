/*
Mark Provenzano
COP1000
Chapter 4 Exercise 2
Area of Rectangles
*/

import java.util.Scanner;

public class AreaOfRectangles {
	
		public static Scanner scan = new Scanner( System.in );
	
	public static void main( String[] args ) {
		
	//declarations of variables
		int length1;
		int width1;
		
		int length2;
		int width2;
		
		int a1;
		int a2;
		
	//Collects need information from the user 
		System.out.println( "What is the length of the first rectangle?" );
			length1 = scan.nextInt();
		
		System.out.println( "What is the width of the first rectangle?" );
			width1 = scan.nextInt();
		a1 = fArea( length1 , width1 );
		
		System.out.println( "What is the length of the second rectangle?" );
			length2 = scan.nextInt();
		
		System.out.println( "What is the width of the second rectangle?" );
			width2 = scan.nextInt();
		a2 = fArea( length2 , width2 );
		
		fGreater( a1 , a2 );
	}
	
	private static int fArea( int l , int w ) { //Finds the area of a rectangle+
		return l * w;
	} 
	
	private static void fGreater( int a1 , int a2 ) { //Finds which rectangle is larger and prints it to the screen
		if( a1 > a2 ) {
			System.out.println( "The first rectangle has a larger area." );
		}
		else if( a1 < a2 ) {
			System.out.println( "The second rectangle has a larger area." );
		}
		else {
			System.out.println( "The two rectangles have the same area." );
		}
	}
}