//Mark Provenzano
package ProgrammingExcercise;

import java.util.*;

public class SortNames {

	public static Scanner scan = new Scanner(System.in);
	public 	static List<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {

	SortNames s = new SortNames();
	
	s.setNames();
	s.print();
		

	}
	public void print() {
		String[] sorted = new String[names.size()];
		names.toArray(sorted);
		
		System.out.println(sorted[0]);
		System.out.println(sorted[names.size() - 1]);
	}
	
	public void setNames() {
		
		System.out.println("How many names would you like to enter");
		int choice = scan.nextInt();
		
		for(int i = 0 ; i < choice ; i++) {
			System.out.println("Enter in a new name");
			String name = scan.next();
			names.add(name);
		}
		
		Collections.sort(names);
	}

}