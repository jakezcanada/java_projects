package J2;

import java.util.Scanner;

public class TimeToDecompress {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int a = sc.nextInt();
			String b = sc.next();
			for(int j = 0; j<a; j++) {
				System.out.print(b);
				if(j+1==a) {
					System.out.println();
				}
			}
		}
	}
}
