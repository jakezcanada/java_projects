package section5Challenges;

import java.util.Scanner;

public class MinAndMaxChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		while(true) {
			if(sc.hasNextInt()) {
				int num = sc.nextInt();
				if(num<min) {
					min = num;
				}
				if(num>max) {
					max = num;
				}
			}else {
				break;
			}
		}
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}

}
