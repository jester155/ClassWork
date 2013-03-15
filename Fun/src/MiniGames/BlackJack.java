package MiniGames;

import java.util.*;


public class BlackJack {

		private static Scanner s = new Scanner(System.in);
		private static Random r = new Random();
		
	public void start() {
		int d = dealer();
		int p = player();
		getResult(p , d);
	}
	
	private int dealer() {
		
		int d = 0;
		
		while(d < 16) {
			d = d + r.nextInt(11) + 1;
		}
		
		return d;
	}
	
	private int player() {
		int p = 0;
		String decision = "hit";
		
		while(p <= 21 && decision.equals("hit")) {
			
			p = p + r.nextInt(11) + 1;
			
			System.out.println("You have " + p);
			
			if(p > 21)
				decision = "stay";
			else {
				System.out.println("Hit or stay?");
					decision = s.next();
			}
			
				
		}
		
		return p;
	}
	
	private void getResult(int p , int d) {
		if(p > d && p <= 21 || d > 21)
			System.out.println("you won!\nYou had: " + p + "\nDealer had: " + d);
		else
			System.out.println("You lost\nYou had: " + p + "\nDealer had: " + d);
	}
}
