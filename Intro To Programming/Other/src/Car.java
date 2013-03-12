import java.util.ArrayList;
import java.util.List;


public class Car {
	
	public List<String> Cars = new ArrayList<String>();

	public List<String> getAll() {

		Cars.add(getModel());
		Cars.add(getReg());
		
		return Cars;
	}
	
	public String getModel() {
		String model = "Chev";
		
		return model;
	}
	
	public String getReg() {
		String reg;
		
		reg = "m87v67";
		
		return reg;
	}
	
}
