package school1;

import java.util.Scanner;

public class Strings {

	public static String greeting(String name){
		return "Hello " + name + "!";
	}
	
	public static String repeatIt(String word, int N){
		String result = "";
		for(int i = 0; i<N; i++) {
			result += word;
		}
		return result;
	}
	
	public static int repeats(String phrase, String word){
		return (int) ((phrase.length() - phrase.replaceAll(word,"").length())/word.length());
	}
	
	public static int vowels(String phrase){
		return phrase.replaceAll("[^aeiouAEIOU]", "").length();
	}
	
	public static int words(String phrase){
		return phrase.trim().replaceAll("[ ]{2,}", " ").split(" ").length;
	}
	
	public static String upperLower(String phrase){
		String result = "";
		for(int i = 0; i<phrase.length(); i++) {
			char c = phrase.charAt(i);
			if (Character.isUpperCase(c)) {
	            result += Character.toLowerCase(c);
	        } else if (Character.isLowerCase(c)) {
	        	result += Character.toUpperCase(c);
	        }else {
	        	result += c;
	        }
		}
		return result;
	}
	
	public static int nCount(String phrase, int n){
		String[] nPhrase = phrase.trim().replaceAll("[ ]{2,}", " ").split(" ");
		int count = 0;
		for(int i = 0; i<nPhrase.length; i++) {
			if(nPhrase[i].length()==n) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean looper = true;
		while (looper) {
			// give the user a list of methods
			System.out.println("Choose from the following list of methods (type the number):");
			System.out.println("	1: greeting");
			System.out.println("	2: repeatIt");
			System.out.println("	3: repeats");
			System.out.println("	4: vowels");
			System.out.println("	5: words");
			System.out.println("	6: upperLower");
			System.out.println("	7: nCount");
			System.out.println("	Other: exit program");
			int input;
			// check if user entered an int or other
			if (sc.hasNextInt()) {
				input = sc.nextInt();
			} else {
				System.out.println("Option chosen: exit");
				break;
			}
			// switch case depending on user input
			switch (input) {
			case 1:
				System.out.println("Option chosen: greeting");
				// explain
				System.out.println("Method input: String name");
				System.out.println("Method output: Returns \"Hello <name>!\"");
				// prompt for input
				System.out.println("Input the name");
				String trash1 = sc.nextLine();
				String name = sc.nextLine();
				// print
				System.out.println(greeting(name));
				break;

			case 2:
				System.out.println("Option chosen: repeatIt");
				// explain
				System.out.println("Method input: String word, int N");
				System.out.println("Method output: Returns a word repeated N times");
				// prompt for input
				System.out.println("Input the word to repeat");
				String trash2 = sc.nextLine();
				String word1 = sc.nextLine();
				System.out.println("Input the number of times to repeat");
				int n1 = sc.nextInt();
				// print
				System.out.println("Your string: " + repeatIt(word1, n1));
				break;

			case 3:
				System.out.println("Option chosen: repeats");
				// explain
				System.out.println("Method input: String phrase, String word");
				System.out.println("Method output: Returns the number of times word appears in phrase");
				// prompt for input
				System.out.println("Input the phrase");
				String trash3 = sc.nextLine();
				String phrase1 = sc.nextLine();
				System.out.println("Input the word to find");
				String word2 = sc.nextLine();
				// print
				System.out.println("Word appears in phrase " + repeats(phrase1, word2) + " times");
				break;

			case 4:
				System.out.println("Option chosen: vowels");
				// explain
				System.out.println("Method input: String phrase");
				System.out.println("Method output: Returns the number of vowels (A E I O U) in String phrase");
				// prompt for input
				System.out.println("Input the phrase");
				String trash4 = sc.nextLine();
				String phrase2 = sc.nextLine();
				// print
				System.out.println("There are " + vowels(phrase2) + " vowels in the phrase");
				break;

			case 5:
				System.out.println("Option chosen: words");
				// explain
				System.out.println("Method input: String phrase");
				System.out.println("Method output: Returns the number of words in String phrase");
				// prompt for input
				System.out.println("Input the phrase");
				String trash5 = sc.nextLine();
				String phrase3 = sc.nextLine();
				// print
				System.out.println("There are " + words(phrase3) + " words in that phrase");
				break;

			case 6:
				System.out.println("Option chosen: upperLower");
				// explain
				System.out.println("Method input: String phrase");
				System.out.println("Method output: Switches the case of each letter in phrase and returns the result as a String");
				// prompt for input
				System.out.println("Input the phrase");
				String trash6 = sc.nextLine();
				String phrase4 = sc.nextLine();
				// print
				System.out.println("Your string: " + upperLower(phrase4));
				break;

			case 7:
				System.out.println("Option chosen: nCount");
				// explain
				System.out.println("Method input: String phrase, int n");
				System.out.println("Method output: Returns the number of words in phrase that are n letters long");
				// prompt for input
				System.out.println("Input the phrase");
				String trash7 = sc.nextLine();
				String phrase5 = sc.nextLine();
				System.out.println("Input n");
				int n2 = sc.nextInt();
				// print
				System.out.println("There are " + nCount(phrase5, n2) + " words that are " + n2 + " letters long");
				break;

			default:
				System.out.println("Option chosen: exit");
				// exit loop by setting looper to false
				looper = false;
				break;

			}
		}
		System.out.println("Goodbye :)");
	}

}
