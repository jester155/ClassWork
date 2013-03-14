//Mark Provenzano
package ProgrammingExcercise;

import java.util.Scanner;

public class BugCollector {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int collection = 0;
		int days = 0;
		
		System.out.println("You will enter the number of bugs you have collected over the last 7 days");
		
		for(int i = 1 ; i <= 7 ; i++) {
			System.out.println("How many bugs were collected on day " + i );
			int collect = scan.nextInt();
			collection = collection + collect;
			days = i;
		}
		
		System.out.println("You have collected " + collection + " bugs over " + days + "  days" );
	}

}