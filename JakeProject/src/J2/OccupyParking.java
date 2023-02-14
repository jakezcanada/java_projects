package J2;

import java.util.Scanner;

public class OccupyParking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] a = sc.next().split("");
		String[] b = sc.next().split("");
		int sum = 0;
		for(int i = 0; i<n; i++) {
			if(a[i].equals("C") && b[i].equals("C")) {
				sum++;
			}
		}
		System.out.println(sum);

	}

}
