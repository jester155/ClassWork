package ProgrammingExcercise;

import java.util.*;

public class SortNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] names = new String[3];
		
		System.out.println("Enter in a name");
		String a = scan.nextLine();
			names[0] = a;
		
		System.out.println("Enter in a name");
		String b = scan.next();	
			names[1] = b;
		
		System.out.println("Enter in a name");
		String c = scan.next();	
			names[2] = c;
		
		Arrays.sort(names);
		
		for(String items : names)
			System.out.println(items);
		
	}

}