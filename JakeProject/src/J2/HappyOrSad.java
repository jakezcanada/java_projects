package J2;
import java.util.Scanner;

public class HappyOrSad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		int sad = findNumOf(":-(",sentence);
		int happy = findNumOf(":-)",sentence);
		if(sad > happy) {
			System.out.println("sad");
		}else if(happy > sad) {
			System.out.println("happy");
		}else if(happy==sad && happy != 0){
			System.out.println("unsure");
		}else {
			System.out.println("none");
		}
	}

	private static int findNumOf(String face, String sentence) {
		int result = 0;
		while(sentence.indexOf(face) != -1) {
			String sentence1 = sentence.substring(0, sentence.indexOf(face));
			String sentence2 = sentence.substring(sentence.indexOf(face) + 3, sentence.length());
			sentence = sentence1 + sentence2;
			result++;
		}
		return result;
	}

}
