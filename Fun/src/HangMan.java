import java.util.*;

public class HangMan {
	
	private static Scanner scan = new Scanner(System.in);
	private static Random rand = new Random();
	private static List<String> usedLetters = new ArrayList<>();
	private static List<String> words = new ArrayList<>();
	private static List<String> correctLetters = new ArrayList<>();
	
	private static void setWordBank() {
		words.add("hi");
		words.add("world");
	}
	
	private static void player() {
		String word = getWord(); 
		String choice;
		boolean cont = false;
		String answer = "";
		String[] characters = new String[word.length()];
		
		System.out.println("The word is a " + word.length() + " word");
		
		while(cont != true) {
			String partial = "";
			
			System.out.println("Enter in a letter");
			choice = scan.next();
		
			if(usedLetters.contains(choice))
				System.out.println("You already used '" + choice + "' please choose a another letter.");

				usedLetters.add(choice);
			
			if(word.contains(choice)) {
				correctLetters.add(choice);
				characters[word.indexOf(choice)] = choice;
			}
			else
				System.out.println(choice + ": is not part of the word.");
			cont = arrayNullCheck(characters);
			
			for (int i=0; i < characters.length ; i++) {
	            if (characters[i] != null) 
	            	partial += characters[i];
	            else {
	            	characters[i] = " _ ";
	            partial += characters[i];
	            characters[i] = null;
	            }
	        }
			System.out.println(partial);
			
		}
			for(String item : characters) 
				answer += item;
			
			if(checkWin(word, answer) == true)
				System.out.println("You won the answer was: " + word);
			else
				System.out.println("you lost");
			
			
		
	}
	
	private static boolean arrayNullCheck(String[] check) {
		int i = 0;
		for(String item : check){
			if(check[i] == null)
				return false;
			i++;
		}
		return true;
	}
	
	private static boolean checkWin(String word , String answer) {
		return answer.equals(word);
	}
	
	private static String getWord() {
		String word = words.get(rand.nextInt(words.size()));
		if(word.equals("hello"))
			System.out.println("This word is a common used greeting in the englis lanuage");
		else
			System.out.println("The earth, together with all of its countries, peoples, and natural features");
		return word;
	}
	
	public static void main(String[] args) {
		
		setWordBank();
		player();
	}
	
}
