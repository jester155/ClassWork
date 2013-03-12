import java.util.*;

public class Lopps {

	public static String u = "yes";
	public static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		myloop();
		//whileLoop();
		//forLoop();
		//doWhileLoop();

	}
	private static void myloop() {
		
		System.out.println("Which color shall I print for you?");
		String c = s.nextLine();
		System.out.println("How many times shall I print " + c + " for you?");
		int x = s.nextInt();

		
		for(int i = 1; i <= x; i++) {
			System.out.println(c);
			
		}
	}
	
	private static void forLoop()  {
		int x = 1; 
		for(int i = 0; i < x;) {
		System.out.println("Doing something?");
		
		u = s.nextLine();
		
		if(u.equals("no"))
			x = 0; 
		else 
			x = 1;
		}
	}
	private static void whileLoop() {
		
		while (u.equals("yes")) {
			System.out.println("Doing something?");
			u = s.next();
		}

	}
	
	private static void doWhileLoop() {

		System.out.println(u);
		do {
			System.out.println("Doing something??");
			u = s.next();
		} while(u.equals("yes"));
	}

}
