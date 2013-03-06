/*
 * Mark Provenzano
 * COP1000
 * Chapter 4 Exercise 10
 * Time Calculator
 */

import java.util.*;

public class TimeCalculator {

		public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("How many seconds do you want to enter");
			int s = scan.nextInt();
		
		tCalculate(s);

	}
	
	public static void tCalculate( int s ) {
	//Declared variables
		int mTime = 0;
		int sTime = 0;
		int hTime = 0;
		int dTime = 0;
		int m = 60;
		int hr = 3600;
		int d = 8640;
		
	//Performs the calculations
		if(s < m) {
			System.out.println("You entered " + s + "seconds");
		}
		else if (s >= m && s < hr) {
			mTime = s / m;
			sTime = s % m;
		}
		else if (s >= hr && s < d) {
			hTime = s / hr;
			mTime = (s % hr) / m;
			sTime = (s % hr) % m;
		}
		else if (s >= d) {
			dTime = s / d;
			hTime = (s % d) / hr;
			mTime = ((s % d) % hr) / m;
			sTime = ((s % d) % hr) % m; 
		}
	//prints the time out to the screen
		System.out.println("Your time is " + dTime + "d:" + hTime + "hr:" + mTime + "m:" + sTime + "s");
	}
}
