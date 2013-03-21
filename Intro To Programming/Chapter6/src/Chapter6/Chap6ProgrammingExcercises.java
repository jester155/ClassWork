/*
 *Mark Provenzano
 *COP1000
 *Chapter 6 PROGRAMMING EXERCISES
 */
package Chapter6;

import java.util.*;

class Chap6ProgrammingExcercises {
	
	private static void menu() {
		String[] questions = new String[] 
				{"Rectangle Area", "Feet To Inches", "Math Quiz", "Maximum Two Values", 
				"Falling Distance", "Kinetic Energy", "Test Average and Grade", "Odd/Even Counter", "Prime Numbers"};
		
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
			case 7:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 7: Test Average and Grade
				calcAverage();
				break;
			case 8:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 8: Odd/Even Counter
				oddEven();
				break;
			case 9:
				//.-------------------------------------------------------------------------.//
				//.PROGRAMMING EXERCISE 9: Prime Numbers
				System.out.println("enter in a number to see if it is prime");
				boolean prime = isPrime(s.nextInt());
				if(prime == true)
					System.out.println("The number is prime");
				else
					System.out.println("The number is not prime");
				break;
			default:
				System.out.println(choice + " not a valid option!");
				menu();
				break;
		}
		
	}
	//.Programming Exercise 1: Finds the area of a rectangle
	private static double area(double l , double w) { 
		return l * w;
	}
	//.Programming Exercise 2: Converts feet into inches
	private static double feetToInches(double feet) { 
		return feet * 12;
	}
	//.Programming Exercise 3: This is a simple math quiz
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
	//.Programming Exercise 4: Returns the greater value
	private static int max(int x , int y) { 
		if(x > y)
			return x;
		else
			return y;
	}
	//.Programming Exercise 5: Finds the falling distance of an object over time
	private static void fallingDistance(int time) {
		System.out.println(.5 * (9.8 * (Math.pow((time), 2))) + " meters in " + time + " Seconds.");
	}
	//.Programming Exercise 6: Finds kinetic energy of an object
	private static double kineticEnergy(double m, double v) {
		return (m * (Math.pow(v, 2))) / 2;
	}
	//.Programming Exercise 7: Calculates the average of 5 tests and displays the score and letter grade
	private static void calcAverage() {
		double[] scores = new double[5];
		String[] grades = new String[] {"A", "B", "C", "D", "F"};
		double total = 0;
		
		System.out.println("Enter in 5 of your test scores to find the average");
		
		for(int i = 0; i < 5 ; i++)
			scores[i] = s.nextDouble();
		
		for(double item : scores)
			total += item;	
		
		System.out.print(total/scores.length + ": ");
		
		/*
		 *While Loop that will check the score and print out the proper Letter Grade
		 *This is so that there is not a bunch of if / else if statements
		 */
		int gradeScale = 90;
		int x = 0;
		Boolean contLoop = true;
		while(contLoop == true){
			if(total/scores.length >= gradeScale) {
				System.out.print("You got an " + grades[x] + "\n");
				contLoop = false;
			}
			else if(total/scores.length < 50){
				System.out.print("You got an " + grades[4] + "\n");
				contLoop = false;
			}
			x++;
			gradeScale -= 10;
		}
	}
	//.Programming Exercise 8: Finds and sorts odd or even Numbers
	private static void oddEven() {
		List<Integer> odd = new ArrayList<>();
		List<Integer> even = new ArrayList<>(); 
		//.Loop that sorts if a number is even or odd
		int x = 0;
		for(int i = 0 ; i < 100 ; i++) {
			x = r.nextInt();
			if((x%2) == 0)
				even.add(x);
			else
				odd.add(x);
		}
		//.Counts the number of total even numbers
		int evenTotal = 0;
		for(int item : even)
			evenTotal++;
		System.out.println("Total even numbers is: " + evenTotal);
		//.Counts the number of total odd numbers
		int oddTotal = 0;
		for(int item : odd)
			oddTotal++;
		System.out.println("Total odd numbers is: " + oddTotal);	 
	}
	//.Programming Exercise 9: Finds if a number is prime and returns true or false
	private static boolean isPrime(int n) {
	    //.Checks if n is a multiple of 2 or if the number is 2 since 2 is the only even prime number
		if (n == 2)
			return true;
		else if (n % 2 == 0) 
			return false;
		//.If not, then just check the odds
		for(int i = 3 ; i * i <= n ; i += 2) {
		    if(n % i == 0)
		        return false;
		}
		return true;
	}
	//.Is the main method
	public static void main(String[] args) { 
		String cont;
		do{
			menu();
			System.out.print("Do you want to continue? [yes / no]: ");
			cont = s.next();
		} while(cont.equalsIgnoreCase("yes") || cont.equalsIgnoreCase("y"));
	}
	//.Public Objects that are used in the entire program.
	private static Scanner s = new Scanner(System.in);
	private static Random r = new Random();

}
