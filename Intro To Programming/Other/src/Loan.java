import java.util.*;

public class Loan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter in your salary");
			int salary = scan.nextInt();
		System.out.println("How many years have you had your current job?");
			int years = scan.nextInt();
			
			if(salary > 30000 && years > 3)
				System.out.println("You Qulify");
			else if(salary > 30000 || years > 3) {
				if(salary > 30000)
					System.out.println("You need more time on your job");
				else if(years > 3)
					System.out.println("You need a heigher salary");
			}
			else
				System.out.println("You dont Qualify");
	}

}
