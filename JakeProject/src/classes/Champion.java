package classes;

import java.util.Arrays;
import java.util.Scanner;

public class Champion {

	static int LowerBound(int a[], int x) {
		int l = -1;
		int r = a.length;
		while(l+1<r) {
			int m = (l+r)/2; // int m = (l+r) >>> 1
			if(a[m]>=x) {
				r=m;
			}else {
				l=m;
			}
		}
		return r;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] v = new int[n];
		int[] v_sorted = new int[n];
		int[] friend = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
			v_sorted[i] = v[i];
		}
		Arrays.sort(v_sorted);
		for(int i = 0; i < k; i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			if(v[a] > v[b]) {
				friend[a]++;
			}else if(v[b] > v[a]) {
				friend[b]++;
			}
		}
		for(int i = 0; i < n; i++) {
			int idx = LowerBound(v_sorted, v[i]);
			System.out.print((idx - friend[i]) + " ");
		}
	}
}
