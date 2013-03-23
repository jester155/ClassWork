package MiniGames;
import java.util.*;
import java.io.*;

public class HangMan {
	
	private static void setWordBank() throws IOException {
        BufferedReader in = null;
        FileReader fr = null;
        
        try {
            fr = new FileReader("bin\\WordBank\\Words.txt");
            in = new BufferedReader(fr);
            String str;
            while ((str = in.readLine()) != null) {
                words.add(str);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
            fr.close();
        }

        for (String item : words)
        		System.out.print(" '" + item + "' ");
    }
	
	private static void player() throws IOException {
		String word = getWord(); 
		String choice;
		String answer = "";
		String[] characters = new String[word.length()];
		
		System.out.println("The word contains " + word.length() + " letters\n");
		
		while(arrayNullCheck(characters) != true) {
			String partial = "";
			if(usedLetters != null) {
				System.out.print("Used letters:");
				for(String letters : usedLetters)
					System.out.print(" '" + letters + "' ");
			}
			
			System.out.print("\nEnter in a letter: ");
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
			System.out.println("\n" + partial + "\n");
			
			Collections.sort(usedLetters);
			
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
		
		for(int i = 0; i < check.length ; i++) {
			if(check[i] == null)
				return false;
		}
		return true;
	}
	
	private static boolean checkWin(String word , String answer) {
		return answer.equals(word);
	}
	
	private static String getWord() throws IOException {
		String[] definitions = new String[words.size()];
		String word = words.get(rand.nextInt(words.size()));
		
        BufferedReader in = null;
        FileReader fr = null;
        int i = 0;
        try { 
        	fr = new FileReader("bin\\WordBank\\Definitions.txt");
        	in = new BufferedReader(fr);
            String str;
        	while ((str = in.readLine()) != null) {
            	definitions[i] = str;
            	i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            in.close();
            fr.close();
        }
        
        System.out.println("\n" + definitions[words.indexOf(word)] + "\n");
		
		return word;
		
	}
	
	public static void main(String[] args) throws IOException {
		
		setWordBank();
		player();
	}
	
	private static Scanner scan = new Scanner(System.in);
	private static Random rand = new Random();
	private static List<String> usedLetters = new ArrayList<>();
	private static List<String> words = new ArrayList<>();
	
}
