package J4;

import java.util.Scanner;

public class BigBangSecrets {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int shiftIn = sc.nextInt();
		char[] letters = sc.next().toCharArray();
		for(int i = 0; i<letters.length; i++) {
			int shift = (shiftIn + (3 * (i+1)));
			shift = shift%26;
			int temp = letters[i] - shift;
			if(temp < 65) {
				temp = 91-(65-temp);
			}
			letters[i] = (char) temp;
			
		}
		System.out.println(String.valueOf(letters));
	}
}
