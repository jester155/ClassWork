/*
 * Black Jack Logic
 * created by: Mark Provenzano
 * Feel free to make changes to the code to be more efficient.
 * I am always willing to learn.
 */
package MiniGames;

import java.util.*;


public class BlackJack {

	private static Scanner s = new Scanner(System.in);
	private static Random r = new Random();
	private int[] numbers = new int[2];
	
	public void start() {
		dealer();
		player();
		getResult(numbers[1] , numbers[0]);
	}
	
	private void dealer() {
		
		int d = 0;
		
		while(d < 16) {
			d = d + r.nextInt(11) + 1;
		}
		
		numbers[0] = d;
	}
	
	private void player() {
		int p = 0;
		String decision = "hit";
		
		while(p < 21 && decision.equals("hit")) {
			
			p = p + r.nextInt(11) + 1;
			
			System.out.println("You have " + p);
			
			if(p > 21)
				decision = "stay";
			else {
				System.out.println("Hit or stay?");
					decision = s.next();
			}	
				
		}
		
		numbers[1] = p;
	}
	
	private void getResult(int p , int d) {
		
		if((p > d && p <= 21) || d > 21)
			System.out.println("you won!\nYou had: " + p + "\nDealer had: " + d);
		else if(p > 21)
			System.out.println("You lost\nYou had: " + p + "\nDealer had: " + d);
		else
			System.out.println("You lost\nYou had: " + p + "\nDealer had: " + d);
	}

}
