package MiniGames;

import java.util.Random;
import java.util.Scanner;

public class BlackJack {
	private static Scanner scan = new Scanner(System.in);
	private static Random rand = new Random();
	
	public static void main(String[] args) {
		dealer();
		player();
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
		String hit;
		
		do {
			y = rand.nextInt(11) + 1;
			if(y == 11) {
				System.out.println("You pulled an ace use as 1 or ll?");
				y = scan.nextInt();
			}
			
			System.out.println("You have " + y);
			System.out.println("Hit or Stay?");
			hit = scan.nextLine();
		} while (y < 21 || hit.equals("hit"));
		
		return y;
	}
	
	public static void getResult(int dealer , int player) {
		
	}

}
