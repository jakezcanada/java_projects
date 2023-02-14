package J1;

import java.util.Scanner;

public class BestFish {
	public static int bestFish(int numOfFish, int person, Scanner sc) {
		for(int i = 0; i<numOfFish; i++) {
			int L = sc.nextInt();
			int W = sc.nextInt();
			if(L * W > person) {
				person = L*W;
			}
		}
		return person;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = -1;
		int numOfFishC = sc.nextInt();
		C = bestFish(numOfFishC,C,sc);
		int N = -1;
		int numOfFishN = sc.nextInt();
		N = bestFish(numOfFishN,N,sc);
		if(C>N) {
			System.out.println("Casper");
		}else if(C<N) {
			System.out.println("Natalie");
		}else {
			System.out.println("Tie");	
		}
	}
	
}
