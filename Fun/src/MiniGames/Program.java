package MiniGames;

import java.util.Scanner;

public class Program {
	public static BlackJack bGame = new BlackJack();
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

		menu();

	}
	
	public static void menu() {
		String choice;
		int c = 1;
		
		do {
			System.out.println("Which game would you like to play?");
			System.out.println("1: Black Jack");
			System.out.println("2: Flip a Coin");
				int x = scan.nextInt();
				if(x == 1) {
					bGame.start();
				}
				else if(x == 2) {
					HeadsorTails.start();
				}
				else {
					System.out.println(x + " is an invalid menu item");
					menu();
				}
				System.out.println("Play again?");
				choice = scan.next();
				if(choice.equals("yes"))
					c = 1;
				else
					c = 0;
		} while(c != 0);
	}

}
