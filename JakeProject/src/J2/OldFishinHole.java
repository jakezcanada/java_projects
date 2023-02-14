package J2;

import java.util.Scanner;

public class OldFishinHole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int bt = sc.nextInt();
		int nt = sc.nextInt();
		int yp = sc.nextInt();
		int max = sc.nextInt();
		int results = 0;
		for(int i = 0; i<=max; i++) {
			for(int j = 0; j<=max; j++) {
				for(int k = 0; k<=max; k++) {
					if(i*bt+j*nt+k*yp <= max && i+j+k != 0) {
						System.out.println( i +" Brown Trout, " + j + " Northern Pike, " +k +" Yellow Pickerel");
						results++;
					}
				}
			}
		}
		System.out.println("Number of ways to catch fish: " + results);
	}

}
