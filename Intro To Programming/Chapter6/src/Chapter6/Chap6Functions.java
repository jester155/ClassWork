package Chapter6;

import java.util.*;

public class Chap6Functions {
	
	private static void menu() {
		int result = 100;
		
		System.out.println("Select which workbench you would like to run: ");
		
		for(int i = 1 ; i < 7 ; i++)
			System.out.println(i + ": Algorithm Workbench " + i);
		
		int choice = s.nextInt();
		
		switch(choice) {
		
		case 1: 
		//.--ALGORITHM WORKBENCH 1--.// 
			System.out.println(randNum(result) + 1);
			break;
		case 2: 
		//.--ALGORITHM WORKBENCH 2.--//
			System.out.println(half(result));
			break;
		case 3: 
		//.--ALGORITHM WORKBENCH 3--.//
			System.out.println(cube(4));
			break;
		case 4: 
		//.--ALGORITHM WORKBENCH 4--.//
			System.out.println(timesTen(result));
			break;
		case 5: 
		//.--ALGORITHM WORKBENCH 5--.//
			System.out.println((getFirstName()));
			break;
		case 6: 
		//.--ALGORITHM WORKBENCH 6--.//
			System.out.println(upperCase(s.next()));
			break;
		default:
		//.--Not Part of an Algorithm Workbench, just part of the menu--.//
			System.out.println("Choose a valid menu option");
			menu();
			break;
			
		}
	}
	
	public static int randNum(int num) { //.Algorithm Workbench 1 
		return r.nextInt(num);
	}
	
	private static double half(int number) { //.Algorithm Workbench 2 
		return number / 2;
	}
	
	private static int cube(int num) { //.Algorithm Workbench 3
		return (int) Math.pow(num, 3);
	}
	
	private static int timesTen(int x) { //.Algorithm Workbench 4
		return x * 10;
	}
	
	private static String getFirstName() { //.Algorithm Workbench 5
		System.out.print("Please enter your frist name: ");
		return s.next();
	}
	
	private static String upperCase(String str1) { //.Algorithm Workbench 6
		return str1.toUpperCase();
	}
	
	public static void main(String[] args) {
		menu();
	}
	
	private static Random r = new Random();
	private static Scanner s = new Scanner(System.in);
}
