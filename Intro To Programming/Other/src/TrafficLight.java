import java.util.Random;

class TrafficLight {

	public static void main(String[] args) {
		Random rand = new Random();
		int option = rand.nextInt(2);
		if(option == 0)
			System.out.println("Red");
		else
			System.out.println("Green");
	}

}
