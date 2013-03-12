import java.util.Arrays;


public class ArrayStuff {


	public static void main(String[] args) {

		int[] example = example(); //.Creates an int array which holds integers.//
		
		System.out.println(example[0] + "\n" + example[1]); //Can call specific items in that array.//
		
		for( int items : example()) { //.Prints outs every item in the array, no matter how long.// 
			System.out.println(items);
		}
	}
	
	public static int[] example(){ //.Returns and int array with the following integers of out1 and out2.//
		//.Declared variables.//
		
		int out1 = 10;
		int out2 = 20;
		
		//.Returns the variables as an array.//
		return new int[] {out1 , out2};
	}

}
