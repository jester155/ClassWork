/*
 * Simple Java game by: Mark Provenzano
 * Heads or Tails
 * FULLY COMMENTED
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class HeadsorTails {
		
		private static Random coin = new Random(); //Random Generator
		private static Scanner s = new Scanner(System.in); //Gets user input and stores data
		private static BufferedReader enter = new BufferedReader(new InputStreamReader(System.in)); //Scans for any key, does not store data
	
	public static void main(String[] args) {
		start();
		flip();

	}
	
	public static void start() {	//Start of the program
		
		System.out.println("Press enter to flip a coin. Best of 3 and you win");
		
		try { //Requires the user to enter any form of input before continuing
			enter.readLine();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void flip() {		//Flips the coin three times
		
		int call = call() , head = 0 , tail = 0 , c; //Variables declared and initialized
		
		for(int i = 1 ; i <= 3 ; i++) { //Performs the function 3 times 
			c = coin.nextInt(2); //Random generator can only choose between 0 or 1
			
			if(c == 0) {
				System.out.print("Tails ");
				tail++;
			}
			else if (c == 1) {
				System.out.print("Heads ");
				head++;
			}
		}
		
		getResult(tail , head , call);
	}
	
	public static void playAgain() {//Asks if the user would like to play again
		
		System.out.println("\nPlay again??");
		System.out.println("1: Yes \n2: No");
			int x = s.nextInt(); //Scans the next input from the user
		
		if(x == 1) {
			flip();
		}
		else if(x == 2) {
			System.out.println("Press 'Enter' to exit application");
			
			try { //Requires some input from the user to continue (exit the application)
				enter.readLine();
			} 
			catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		else {
			System.out.println(x + " is not an option.");
			
			playAgain();
		}
	}
	
	public static int call() {		//Asks the user for their call of heads or tails
		
		int x = 0; //Variables declared and initialized
		
		System.out.println("Call heads or tails!");
			String h = s.next();
		if(h.equals("heads")) {
			System.out.println("\nYou have chosen Heads!");
			x = 1;
		}
		else if(h.equals("tails")) {
			System.out.println("\nYou have chosen Tails");
			x = 2;
		}
		else {;
			System.out.println(h + " is not a valid entry");
			call();
		}
		return x;
	}
	
	public static void getResult(int t , int h , int c) {	//Determines if the user won or lost 
		
		String win = "\nYOU WIN!!!" , lose = "\nYou lost..."; //Variables declared and initialized
		
		if(t >= 2 && c == 2) {
			System.out.println(win);
		}
		else if(h >= 2 && c == 1) {
			System.out.println(win);
		}
		else {
			System.out.println(lose);
		}
		playAgain();
	}

}