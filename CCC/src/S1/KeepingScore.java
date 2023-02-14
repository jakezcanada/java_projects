package S1;

import java.util.Scanner;

public class KeepingScore {

	public static String toSuit(String suit) {
		if(suit.equals("C")) {
			return "Clubs";
		}else if(suit.equals("D")) {
			return "Diamonds";
		}else if(suit.equals("H")) {
			return "Hearts";
		}else {
			return "Spades";
		}
	}
	
	public static int displayCard(String str, String suit) {
		suit = toSuit(suit);
		if(str.length()==0) {
			System.out.println(suit + " 3");
			return 3;
		}
		//System.out.println(str+" "+suit);
		String[] cards = str.split("");
		String cardChain = suit;
		int totalScore = 0;
		if(str.length() == 2) {
			totalScore++;
		}else if(str.length() == 1) {
			totalScore += 2;
		}
		for(int i = 0; i<str.length(); i++) {
			if(cards[i].equals("A")) {
				totalScore+=4;
			}else if(cards[i].equals("K")) {
				totalScore+=3;
			}else if(cards[i].equals("Q")) {
				totalScore+=2;
			}else if(cards[i].equals("J")) {
				totalScore+=1;
			}
			cardChain = cardChain + " " + cards[i];
		}
		System.out.println(cardChain + " " + totalScore);
		return totalScore;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int totalScore = 0;
		System.out.println("Cards Dealt Points");
		totalScore += displayCard(in.substring(in.indexOf("C")+1,in.indexOf("D")), in.substring(in.indexOf("C"),in.indexOf("C")+1));
		totalScore += displayCard(in.substring(in.indexOf("D")+1,in.indexOf("H")), in.substring(in.indexOf("D"),in.indexOf("D")+1));
		totalScore += displayCard(in.substring(in.indexOf("H")+1,in.indexOf("S")), in.substring(in.indexOf("H"),in.indexOf("H")+1));
		totalScore += displayCard(in.substring(in.indexOf("S")+1,in.length()), in.substring(in.indexOf("S"),in.indexOf("S")+1));
		System.out.print("Total " + totalScore);
	}

}
