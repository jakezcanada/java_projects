package J5;
import java.util.*;

public class Bananas {

//	  

	private static String removeStrings(String monkeyWord) {
		while(monkeyWord.contains("BAS") || monkeyWord.contains("ANA")) {

			if(monkeyWord.contains("BAS")) {
				int i = monkeyWord.indexOf("BAS");
				String start = monkeyWord.substring(0,i);
				String end = monkeyWord.substring(i+3,monkeyWord.length());
				monkeyWord = start + "A" + end;
			}
			if(monkeyWord.contains("ANA")) {
				int i = monkeyWord.indexOf("ANA");
				String start = monkeyWord.substring(0,i);
				String end = monkeyWord.substring(i+3,monkeyWord.length());
				monkeyWord = start + "A" + end;
			}
		}
		if(monkeyWord.equals("A")) {
			return "YES";
		}else {
			return "NO";
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = "";
		int index = 0;
		boolean uneven = false;
		String monkeyWord = "";
		while(!monkeyWord.equals("X")){ 
			monkeyWord = sc.nextLine();
			if(!monkeyWord.equals("X")) {
				System.out.println(removeStrings(monkeyWord));
			}else {
				break;
			}
			
		}

	}
}
