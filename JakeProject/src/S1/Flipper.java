package S1;

import java.util.Scanner;

public class Flipper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int V = str.replaceAll("H", "").length();
		int H = str.length()-V;
		int[] l1 = {1,2};
		int[] l2 = {3,4};
		if(V % 2 != 0) {
			l1[0] = 2;
			l1[1] = 1;
			l2[0] = 4;
			l2[1] = 3;
		}
		if(H % 2 != 0) {
			System.out.println(l2[0] + " " + l2[1]);
			System.out.println(l1[0] + " " + l1[1]);
		}else {
			System.out.println(l1[0] + " " + l1[1]);
			System.out.println(l2[0] + " " + l2[1]);
		}

	}

}
