package AMathContest;

import java.util.Scanner;

public class P7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextLong();
		long sum = 0;
		for(double i = 1.0; i <= a; i++) {
			sum += a/i;
		}
		System.out.println(sum);
	}
}
