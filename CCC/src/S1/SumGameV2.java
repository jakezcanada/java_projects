package S1;

import java.util.Iterator;
import java.util.Scanner;

public class SumGameV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[] swif = new int[in];
		int[] sem = new int[in];
		int[] check = new int[in];
		for(int i = 0; i < in; i++) {
			swif[i] = sc.nextInt();
		}
		for(int i = 0; i < in; i++) {
			sem[i] = sc.nextInt();
		}
		check[0] = swif[0] - sem[0];
		int largest = 0;
		if(swif[0] - sem[0] == 0) largest = 1;
		for(int i = 1; i < in; i++) {
			check[i] = check[i-1]+swif[i]-sem[i];
			if(check[i] == 0) {
				largest = i+1;
			}
		}
		System.out.println(largest);
	}
}
