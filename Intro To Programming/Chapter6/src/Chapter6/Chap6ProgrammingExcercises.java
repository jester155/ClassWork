package Chapter6;

import java.util.Random;
import java.util.Scanner;

public class Chap6ProgrammingExcercises {
	
	private static Scanner s = new Scanner(System.in);
	private static Random r = new Random();
	
	public static void main(String[] args) {

		System.out.println("Choose which Question you would liek to see");
		System.out.println("1: Question 1");
		System.out.println("2: Question 2");
		System.out.println("3: Question 3");
		
		switch(s.nextInt()) {
		
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
		
		System.out.println("Enter the number of feet you would likt to convert to inches"); //.ProEx 2
		System.out.println(feetToInches(s.nextDouble())); //.ProEx 2
			break;
		
		case 3:
		//.-------------------------------------------------------------------------.//
		//.PROGRAMMING EXCERCISE 3
		mathQuiz();
			break;
		
		}
		
		
	}
	
	private static double area(double l , double w) { //.ProEx 1
		return l * w; //.ProEx 1
	}
	
	private static double feetToInches(double feet) { //.ProEx 2
		return feet * 12;
	}
	
	private static void mathQuiz() {
		
		int a = r.nextInt(1000) + 1;
		int b = r.nextInt(1000) + 1;
		
		System.out.println(" " + a + "\n+" + b);
			int answer = s.nextInt();
			
		if(answer == a + b)
			System.out.println("You got it correct!");
		else
			System.out.println("The answer was: " + (a+b));
	}

}
