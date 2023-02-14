package J2;

import java.util.Scanner;

public class RollTheDice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int result = 0;
		for(int i = 1; i<=d1; i++) {
			for(int j = 1; j<=d2; j++) {
				if(i+j == 10) {
					result++;
				}
			}
		}
		if(result == 1) {
			System.out.println("There is " + result + " way to get the sum 10.");
		}else {
			System.out.println("There are " + result + " ways to get the sum 10.");
		}
		
	}

}
