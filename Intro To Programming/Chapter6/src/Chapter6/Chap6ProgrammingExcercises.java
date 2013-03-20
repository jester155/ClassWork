package Chapter6;

import java.util.*;

class Chap6ProgrammingExcercises {
	
	private static void menu() {
		String[] questions = new String[] 
				{"Rectangle Area", "Feet To Inches", "Math Quiz", "Maximum Two Values", 
				"Falling Distance", "Kinetic Energy"};
		
		System.out.println("Choose which Question you would like to see");
		
		int x = questions.length - 1;
		for(String item : questions)
			System.out.println("Question " + (questions.length - x--) + ": " + item);

		int choice = s.nextInt();
		
		switch(choice) {
		
			case 1:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 1: Rectangle Area
				System.out.println("Enter in the width of a rectangle");
					double width = s.nextDouble();
				System.out.println("Enter in the length of a rectangle");
					double length = s.nextDouble(); 
				System.out.println(area(length , width));
				break;
			case 2:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 2: Feet To Inches
				System.out.print("Enter the number of feet you would like to convert to inches: ");
				System.out.println(feetToInches(s.nextDouble()));
				break;
			case 3:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 3: Math Quiz
				mathQuiz();
				break;
			case 4:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 4: Maximum Two Values
				System.out.println("Enter in two numbers");
				System.out.println(max(s.nextInt(), s.nextInt()) + " is the larger number.");
				break;
			case 5:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 5: Falling Distance
				for(int i = 1 ; i < 11 ; i++)
					fallingDistance(i);
				break;
			case 6:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 6: Kinetic Energy
				System.out.println("Enter the mass in kg and velocity in m/s of an object to find its kinetic energy");
				System.out.println(kineticEnergy(s.nextDouble(), s.nextDouble()));
				break;
			default:
				System.out.println(choice + " not a valid option!");
				menu();
				break;
		}
		
	}
	//.Programming Exercise 1
	private static double area(double l , double w) { 
		return l * w;
	}
	//.Programming Exercise 2
	private static double feetToInches(double feet) { 
		return feet * 12;
	}
	//.Programming Exercise 3
	private static void mathQuiz() { 
		
		int a = r.nextInt(1001);
		int b = r.nextInt(1001);
		
		System.out.println(" " + a + "\n+" + b);
			int answer = s.nextInt();
			
		if(answer == a + b)
			System.out.println("You got it correct!");
		else
			System.out.println("The answer was: " + (a + b));
	}
	//.Programming Exercise 4
	private static int max(int x , int y) { 
		if(x > y)
			return x;
		else
			return y;
	}
	//.Programming Exercise 5
	private static void fallingDistance(int time) {
		System.out.println(.5 * (9.8 * (Math.pow((time), 2))) + " meters in " + time + " Seconds.");
	}
	//.Programming Exercise 6
	private static double kineticEnergy(double m, double v) {
		return (m * (Math.pow(v, 2))) / 2;
	}
	//.Is the main method
	public static void main(String[] args) { 
		menu();	
	}
	
	private static Scanner s = new Scanner(System.in);
	private static Random r = new Random();

}
