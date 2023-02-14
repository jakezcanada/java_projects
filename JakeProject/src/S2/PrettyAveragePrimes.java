package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrettyAveragePrimes {
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int in = Integer.parseInt(br.readLine())*2;
			for (int j = 2; j < (in/2)+1; j++) {
				if(isPrime(j) && isPrime(in-j)) {
					System.out.println(j + " " + (in-j));
					break;
				}
			}
		}
	}
}
