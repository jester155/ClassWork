import java.util.*;
public class LargeToSmall {


	public static void main(String[] args) {
	 int number;
	 Scanner scan = new Scanner(System.in);


	 System.out.println("Please enter a number.");
	 System.out.println("To end use -99");

	  number = scan.nextInt();

	 int large = number;
	 int small = number;



	 while (number != -99){
		 System.out.println("Please enter another number");
	 number = scan.nextInt();

	 if(number > large)
		 large = number; 

	 if(number < small && number != -99)
		 small = number;



	}
	System.out.println(large);
	System.out.println(small);


	}
}