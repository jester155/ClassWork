package ProgrammingExcercise;

public class CaloriesBurned {

	public static void main(String[] args) {

		double calories = 0;;
		
		for(double i = 10 ; i <= 30 ; i = i + 5) {
			calories = i * 3.9; 
			System.out.println("you burned " + calories + " in " + i + " Minutes");
		}
		
	}
	
}