/*
 * Mark Provenzano
 * COP1000
 * Chapter 4 Exercise 9
 * Shipping Charge
 */

import java.util.*;

public class ShippingCharges {
	
		public static Scanner scan = new Scanner( System.in );
		
	public static void main( String[] args ) {
		System.out.println( "How much does your package weigh in poubds?" );
			double w = scan.nextDouble();
		
		caculateShipping( w );
	}
	
	public static void caculateShipping( double w ) { //Calculates the shipping charge
		if( w < 2 ) {
			System.out.println( "Shipping cost: $1.10" );
		}
		else if ( w > 2 && w <= 6 ) {
			System.out.println( "Shipping cost: $2.20" );
		}
		else if ( w > 6 && w <= 10 ) {
			System.out.println( "Shipping cost: $3.70" );
		}
		else if ( w > 10) {
			System.out.println( "Shipping cost: $3.80" );
		}
	}
}
