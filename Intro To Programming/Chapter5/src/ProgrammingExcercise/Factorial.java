//Mark Provenzano
package ProgrammingExcercise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a positive integer");
			Scanner s = new Scanner(System.in);
			short x = s.nextShort();
			long n = 1;
			
			for(int i = 1 ; i <= x ; i++) {
				n = n * i;
			}
			System.out.println(n);
	}

}