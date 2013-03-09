package MiniGames;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
	private static Scanner scan = new Scanner(System.in);
	private static Random rand = new Random();
	
	public void start() {
		System.out.println("Welcome to Black Jack");
		System.out.println("Remember dealer always wins in ties and you loose if you go over 21");
		
		int dealer = dealer();
		int player = player();
		
		int dealer1[] = dealerConversion(dealer);
		
		int real = dealer1[0];
		int convert = dealer1[1];
		
		getResult(real, player, convert);
	}
	
	public int[] dealerConversion(int dealer) {
		
		int real;
		int convert;
		
		if(dealer > 21) {
			real = dealer;
			convert = 0;
		return new int[] {real, convert};
		}
		else {
			real = dealer;
			convert = dealer;
		return new int[]{dealer, convert};
		}
	}
	
	public static int dealer() {
		int x = rand.nextInt(11) + 1;
		
		do {
			x = x + rand.nextInt(11) + 1;
		} while(x < 16);

			return x;
	}
	
	public static int player() {
		int y = 0;
		String hit = "hit";
		
		while(y <= 21 && hit.equals("hit")) {
			y = y + rand.nextInt(11) + 1;
			
			if (y >= 21) {
				hit = "stay";
			}
			else {
			System.out.println("You have " + y);
			System.out.println("Hit or Stay?");
			hit = scan.nextLine();
			}
		}
		
		return y;
	}
	
	
	public static void getResult(int dealer , int player , int conversion) {
		if(conversion == 21 && player == 21)
			System.out.println("You lost, the dealer has 21");
		else if(conversion > player && player <= 21)
			System.out.println("You lost the dealer had " + dealer);
		else if(conversion < player && player <= 21)
			System.out.println("YOU WON!\n You had " + player + " Dealer had " + dealer);
		else if(conversion > 21 && player > 21) {
			System.out.println("You lost!\n You had " + player + " Dealer had " + dealer);
		}
		else if(player == conversion) {
			System.out.println("You lost!\n You had " + player + " Dealer had " + dealer);
		}
		else
			System.out.println("You lost you went over 21. you had " + player + " Dealer had " + dealer);
	}

}
