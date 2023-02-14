package S1;

import java.util.Scanner;

public class SumGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int[] t1 = new int[days];
		int sum = 0;
		for(int i = 0; i<days; i++) {
			sum+=sc.nextInt();
			t1[i] = sum;
		}
		sum = 0;
		int answer = 0;
		for(int i = 0; i<days; i++) {
			sum+=sc.nextInt();
			if(sum == t1[i]) {
				answer = i+1;
			}
		}
		System.out.println(answer);
		
	}

}
