package J3;

import java.util.Scanner;

public class SumacSequences {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int last2 = sc.nextInt();
		int last1 = sc.nextInt();
		int current = last2 - last1;
		int terms = 3;
		while(current <= last1) {
			last2 = last1;
			last1 = current;
			current = last2 - last1;
			terms++;
		}
		System.out.println(terms);
	}
}
