  package ProgrammingExcercise;

public class TuitionIncrease {


	public static void main(String[] args) {
		
		double tuition = 6000;
		final double increase = 0.02;
		
		for(int i = 0 ; i < 5 ; i++) {
			
			double hold = tuition * increase;
			tuition = tuition + hold;
			System.out.println("The tuition for the " + i + " year is " + tuition);
		}
	}

}