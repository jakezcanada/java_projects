package AMathContest;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int smallest = num;
		for(int i = 0; i < num; i++) {
			int cum = sc.nextInt();
			if(smallest > Math.abs(cum))
				smallest = Math.abs(cum);
		}
		System.out.println(smallest);
	}
}
