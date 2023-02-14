package J2;

import java.util.Scanner;

public class WhoHasSeenTheWind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		boolean grounded = false;
		for(int i = 1; i<m; i++) {
			int temp = (int) ((-6*Math.pow(i, 4)) + (h*Math.pow(i, 3)) + (2*Math.pow(i, 2)) + i);
			if(temp<=0) {
				grounded = true;
				System.out.println("The balloon first touches ground at hour:");
				System.out.println(i);
				break;
			}
		}
		if(!grounded) {
			System.out.println("The balloon does not touch ground in the given time.");
		}
	}
}
