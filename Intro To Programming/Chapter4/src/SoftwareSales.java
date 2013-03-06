/*
Mark Provenzano
COP1000
Chapter 4 Exercise 7
Software Sales
*/

import java.util.Scanner;

public class SoftwareSales {
	
		public static Scanner scan = new Scanner( System.in );
	
	public static void main( String[] args ) {
	
	//Declaration of variables
		int q;

		System.out.println( "How many packages would you like to purchase?" );
			q = scan.nextInt();
			
		findDiscount( q );
	}
	
	private static void findDiscount( int q ) {
		if( q >= 10 && q <= 19 ) { //applies a 20% discount
			dMath( 0.2 , q );
		}
		else if( q >= 20 && q <= 49 ) { //applies a 30% discount
			dMath( 0.3 , q );
		}
		else if( q >= 50 && q <= 99 ) { //applies a 40% discount
			dMath( 0.4 , q );
		}
		else if( q >= 100 ) { //applies a 50% discount
			dMath( 0.5 , q );
		}
		else { //There is no discount under 10 packages
			dMath( 0.0 , q );
		}
	}
	
	private static void dMath( double d , int q ) {
		double sTotal;
		double dTotal;
		double rTotal;
		final double price = 99.00;
			
					
		sTotal = q * price;
		dTotal = sTotal * d; 
		rTotal = sTotal - dTotal;
				
		System.out.println( "Saved:	 $" + dTotal );
		System.out.println( "Total:	 $" + rTotal );
	}
}