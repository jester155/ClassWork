package Imps;

import java.util.*;


public class Car {
	
	public static Scanner scan = new Scanner(System.in);
	
	public List<String> Models = new ArrayList<String>();
	public List<String> Registration = new ArrayList<String>();
	
	public void getInfo() {
		System.out.println("Input Model");
			String m = scan.next();
		
		System.out.println("Input Registration");
			String r = scan.next();
	
	this.Models.add(m);
	this.Registration.add(r);
	}
	
	public void print() {
		int holder = 0;
		
		for(String item : Models) {
			System.out.println("[" + item + " , " + Registration.toArray()[holder] + "]");
		}
	}
}