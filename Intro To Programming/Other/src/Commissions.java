import java.util.Scanner;


public class Commissions {

	public static void main(String[] args) {
		//.Declared Variables
		Scanner scan = new Scanner(System.in);
		double sales;
		final double commissionRate = 0.15;
		String keepGoing = "Y";
		//.-------------------.//
		
		while(keepGoing.equalsIgnoreCase("y")) {
		 
			System.out.print("Enter you sales: ");
			sales = scan.nextDouble();
		
			double commission = sales * commissionRate;
			System.out.println("Your commission: " + commission);
			
			System.out.print("Do you want to continue? [y / n]: ");
			keepGoing = scan.next();
		}
		
		/*
		do {
			System.out.print("Enter you sales: ");
			sales = scan.nextDouble();
		
			double commission = sales * commissionRate;
			System.out.println("Your commission: " + commission);
			
			System.out.print("Do you want to continue? [y / n]: ");
			keepGoing = scan.next();
			
		} while (keepGoing.equalsIgnoreCase("y"));
		*/
	}

}
