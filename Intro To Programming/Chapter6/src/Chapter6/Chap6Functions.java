package Chapter6;

import java.util.*;

public class Chap6Functions {
	
	private static Random r = new Random();
	private static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		int result = 100;
		System.out.println(randNum(result) + 1);
		System.out.println(half(result));
		System.out.println(cube(4));
		System.out.println(timesTen(result));;
		System.out.println(upperCase(getFirstName()));
	}
	
	public static int randNum(int num) { //.AW 1
		return r.nextInt(num);
	}
	
	private static double half(int number) { //.AW 2
		return number / 2;
	}
	
	private static int cube(int num) { //.AW 3
		return (int) Math.pow(num, 3);
	}
	
	private static int timesTen(int x) { //.AW 4
		return x * 10;
	}
	
	private static String getFirstName() { //.AW 5
		System.out.print("Please enter your frist name: ");
		return s.next();
	}
	
	private static String upperCase(String str1) { //.AW 6
		String str2 = str1.toUpperCase();
		return str2;
		
	}
}
