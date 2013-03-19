//Mark Provenzano
package ProgrammingExcercise;

import java.util.*;

public class SortNames {

		public static Scanner scan = new Scanner(System.in);
		public static List<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {

		SortNames s = new SortNames();
	
		s.setNames();
		s.print();	
	}
	
	public void print() {
		String[] sorted = new String[names.size()];
		names.toArray(sorted);

		for(String item : names) 
			if(item.equalsIgnoreCase(sorted[0]) || item.equalsIgnoreCase(sorted[names.size() - 1]))
				System.out.println(item);
		
	}
	
	public void setNames() {
		
		System.out.println("How many names would you like to enter");
			int choice = scan.nextInt();
			
		for(int i = 0 ; i < choice ; i++) {
			System.out.println("Enter in a new name");
				String name = scan.next();
			names.add(name.toLowerCase());
			
			organizeNames();
		}
			
	}
	
	public void organizeNames() {
		Collections.sort(names);
	}

}