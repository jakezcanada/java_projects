package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PatternGenerator {
	
	public static void findPatterns(int digitsLeft, int bitsLeft, String str) {
		if(digitsLeft == 0 && bitsLeft == 0) {
			System.out.println(str);
			return;
		}else if(digitsLeft == 0 || bitsLeft>digitsLeft) {
			return;
		}
		if(bitsLeft > 0) {
			findPatterns(digitsLeft-1, bitsLeft-1, str+"1");
		}
		findPatterns(digitsLeft-1, bitsLeft, str+"0");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int patterns = Integer.parseInt(br.readLine());
		for (int i = 0; i < patterns; i++) {
			String in = br.readLine();
			int digs = Integer.parseInt(in.split(" ")[0]);
			int bits = Integer.parseInt(in.split(" ")[1]);
			System.out.println("The bit patterns are");
			findPatterns(digs, bits, "");
			if(i != patterns-1)
				System.out.println();
		}
	}
}
