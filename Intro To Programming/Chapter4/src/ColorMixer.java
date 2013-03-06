/*
Mark Provenzano
COP1000
Chapter 4 Program Exercise 5
Color Mixer
*/

import java.util.Scanner;

public class ColorMixer {
   
   		private static Scanner scan = new Scanner( System.in );
    
 	public static void main ( String[] args ) {
	
	//Gets color1 and color2
  		System.out.println( "List 2 primary colors" );
 		System.out.println( "What is the first primary color" );
      	String color1 = scan.next();
      
		System.out.println( "What is the secondary primary color." );
      	String color2 = scan.next();

   //Creates a secondary color after the combination for 2 colors are chosen
      if( color1.equals( "red" ) || color2.equals( "red" ) ) {
		if ( color1.equals( "blue" ) || color2.equals( "blue" ) ) {
       		System.out.println("The Color Is Purple");
       	}
       	else if ( color1.equals( "yellow" ) || color2.equals( "yellow" ) ) {
       		System.out.println( "The Color Is Orange" );
       }
       	else {
        		System.out.println( "You have to enter in primary color next time." );
       	}
      }
      else if ( color1.equals( "blue" ) || color2.equals( "blue" ) ) {
		
       	if ( color1.equals( "yellow" ) || color2.equals( "yellow" ) ) {
		  		System.out.println( "The Color Is Green" );
       	}
       	else {
        		System.out.println( "You have to enter in primary color next time." );
       	}
      } 
      else {
		System.out.println( "You have to enter in primary color next time." );
      }
  	}
}