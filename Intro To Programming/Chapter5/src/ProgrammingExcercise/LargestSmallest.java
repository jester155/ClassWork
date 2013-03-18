//Mark Provenzano
package ProgrammingExcercise;

import java.util.*;

public class LargestSmallest {

		private static List<Integer> numbers = new ArrayList<>();
		private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		LargestSmallest lS = new LargestSmallest();
		
		lS.setNumbers();
		lS.print();
	}
	
	private void setNumbers() { //.Sets the numbers that are going into the Array list
		System.out.println("Enter in a series of numbers");
		System.out.println("Enter -99 to stop");
		int x;
		
		do {
			x = in.nextInt();
			
			if(x != -99)
				numbers.add(x);
			
		} while (x != -99);
		
		organizeNumbers();
	}
	
	private void print() { //.Prints out the first and last number of an array
		
		int[] list = new int[numbers.size()];
		int i = 0;
		
		for(int item : numbers){
			list[i] = item;
			
			if(item == list[0] || item == list[numbers.size() - 1])
				System.out.println(item);
			
			i++;
		}
		
		//System.out.println(list[0]);
		//System.out.println(list[numbers.size() - 1]);
	}
	
	private void organizeNumbers() { //.Organizes the array list
		Collections.sort(numbers);
	}
}