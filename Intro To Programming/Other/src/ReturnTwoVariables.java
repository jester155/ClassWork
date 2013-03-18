
public class ReturnTwoVariables {

	public static void main(String[] args) {
		int x = 10;
		int[] ret = inOut(x);
		
		for(int item : ret)
			System.out.println(item);

	}
	
	private static int[] inOut(int in){
		
		int out = in  + 10;
		
		return new int[] {in, out};
	}

}
