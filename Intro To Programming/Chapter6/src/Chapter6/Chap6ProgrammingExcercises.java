package Chapter6;

import java.util.Random;
import java.util.Scanner;

class Chap6ProgrammingExcercises {
	
	private static void menu() {
		
		System.out.println("Choose which Question you would like to see");
		
		for(int i = 1 ; i < 4 ; i++)
			System.out.println(i + ": Question " + i);

		int c = s.nextInt();
		
		switch(c) {
		
			case 1:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXCERCISE 1
		
				System.out.println("Enter in the width of a rectangle");
					double width = s.nextDouble();
				System.out.println("Enter in the length of a rectangle");
					double length = s.nextDouble(); 
				System.out.println(area(length , width));
				break;
			case 2:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXCERCISE 2
		
				System.out.print("Enter the number of feet you would like to convert to inches: ");
				System.out.println(feetToInches(s.nextDouble()));
				break;
			case 3:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXCERCISE 3
				mathQuiz();
				break;
			default:
				System.out.println(c + " not a vaid option!");
				menu();
				break;
		}
	}
	
	private static double area(double l , double w) { //.Programming Example 1
		return l * w;
	}
	
	private static double feetToInches(double feet) { //.Programming Example 2
		return feet * 12;
	}
	
	private static void mathQuiz() { //.Programming Example 4
		
		int a = r.nextInt(1001);
		int b = r.nextInt(1001);
		
		System.out.println(" " + a + "\n+" + b);
			int answer = s.nextInt();
			
		if(answer == a + b)
			System.out.println("You got it correct!");
		else
			System.out.println("The answer was: " + (a+b));
	}
	
	public static void main(String[] args) { //.Is the main method
		menu();	
	}
	
	private static Scanner s = new Scanner(System.in);
	private static Random r = new Random();

}
