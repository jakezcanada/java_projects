package J2;

import java.util.Scanner;

public class LuckyNumber {

	public static String[] addItems(String[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		return (sum+"").split("");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			String[] in = sc.next().split("");
			int len = in.length;
			while(len>1) {
				in = addItems(in);
				len = in.length;
			}
			System.out.println(in[0]);
		}
	}
}
