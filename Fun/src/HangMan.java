import java.util.*;

public class HangMan {
	
	private static Scanner scan = new Scanner(System.in);
	private static Random rand = new Random();
	private static List<String> usedLetters = new ArrayList<>();
	private static List<String> words = new ArrayList<>();
	
	private static void setWordBank() {
		words.add("hello");
		words.add("lollipop");
		words.add("world");
	}
	
	private static void player() {
		String word = getWord(); 
		String choice;
		String answer = "";
		String[] characters = new String[word.length()];
		
		System.out.println("The word contains " + word.length() + " letters");
		
		while(arrayNullCheck(characters) != true) {
			String partial = "";
			
			System.out.println("Enter in a letter");
				choice = scan.next();
		
			if(usedLetters.contains(choice))
				System.out.println("You already used '" + choice + "' please choose a another letter.");
			else
				usedLetters.add(choice);
			
			if(word.contains(choice)) {
				
				int j = word.indexOf(choice); //.Is the same as setting to 0
				for(int f = 0; f < countCharacters(word , choice); f++) {
				     j = word.indexOf(choice, j);
				     characters[j] = choice;
				     j++;
				}
						
			}
			else
				System.out.println(choice + ": is not part of the word.");
			
			
			for (int i = 0; i < characters.length ; i++) {
	            if (characters[i] != null) 
	            	partial += " " + characters[i] + " ";
	            else {
	            	characters[i] = " _ ";
	            partial += characters[i];
	            characters[i] = null;
	            }
	        }
			System.out.println(partial);
		
		}
		
		getResult(characters, answer, word);
			
	}
	
	private static void getResult(String [] characters , String answer, String word) {
		for(String item : characters) 
			answer += item;
			
		if(checkWin(word, answer) == true)
			System.out.println("You won the answer was: " + word);
		else
			System.out.println("you lost");
	}
	private static int countCharacters(String word , String choice) {
		int count = 0;
		for(int i =0; i < word.length(); i++)
		    if(word.charAt(i) == parseChar(choice)) {
		        count++;
		    }
		return count;
	}
	
	private static char parseChar(String choice) {
		
		return choice.charAt(0);
	}
	
	private static boolean arrayNullCheck(String[] check) {
		
		for(int i = 0; i < check.length ; i++){
			if(check[i] == null)
				return false;
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
		else if(word.equals("world"))
			System.out.println("The earth, together with all of its countries, peoples, and natural features");
		else if(word.equals("lollipop"))
			System.out.println("A flat, rounded candy on the end of a stick.");
		return word;
	}
	
	public static void main(String[] args) {
		
		setWordBank();
		player();
	}
	
}
