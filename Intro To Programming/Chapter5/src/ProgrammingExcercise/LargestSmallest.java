//Mark Provenzano
package ProgrammingExcercise;

import java.util.*;

public class LargestSmallest {

	public static List<Integer> numbers = new ArrayList<>();
	public static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		LargestSmallest lS = new LargestSmallest();
		
		lS.setNumbers();
		lS.print();
	}
	
	public void setNumbers() {
		System.out.println("Enter in a series of numbers");
		System.out.println("Enter -99 to stop");
		int x = 0;
		
		do {
			x = in.nextInt();
			
			if(x != -99)
				numbers.add(x);
			
		} while (x != -99);
		
		organize();
	}
	
	public void print() {
		
		int[] list = new int[numbers.size()];
		int i = 0;
		
		for(int item : numbers){
			list[i] = item;
			i++;
		}
		
		System.out.println(list[0]);
		System.out.println(list[numbers.size() - 1]);
	}
	
	public void organize() {
		Collections.sort(numbers);
	}
}