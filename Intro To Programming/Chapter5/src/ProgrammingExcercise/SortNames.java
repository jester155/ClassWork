package ProgrammingExcercise;

import java.util.*;

public class SortNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> names = new ArrayList<String>();
			ListIterator<String> iterator = names.listIterator();
		
		System.out.println("How many names would you like to enter");
		int choice = scan.nextInt();
		
		for(int i = 0 ; i < choice ; i++) {
			System.out.println("Enter in a new name");
			String name = scan.next();
			names.add(name);
		}
		
		Collections.sort(names);
		
		int e = names.size() - 1;
		int a = names.size();
		
		String[] sorted = new String[a];
		names.toArray(sorted);
		
		System.out.println(sorted[0]);
		System.out.println(sorted[e]);
		
		//for(String items : names) {
			
		//}
			
		
		/*
		 * String[] names = new String[3];
		
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
		*/
	}

}