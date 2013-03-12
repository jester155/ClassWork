
import java.util.ArrayList;
import java.util.List;


public class ListArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		List<String> dogs = new ArrayList<String>();
		
		dogs.add("pit bull");
		dogs.add("Doxin");
		
		animals.addAll(dogs);
		
		
		System.out.println(animals);
		
		for(String item : animals) { 
			System.out.println(item);
		}

	}

}
