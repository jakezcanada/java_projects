package J2;

import java.util.Scanner;

public class Epidemiology {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int checkN = sc.nextInt();
		int starting = sc.nextInt();
		int infect = sc.nextInt();
		int infected = starting;
		int days = 0;
		int sum = 0;
		while(sum<=checkN) {
			sum+=infected;
			infected*=infect;
			days++;
		}
		System.out.println(days-1);
	}

}
