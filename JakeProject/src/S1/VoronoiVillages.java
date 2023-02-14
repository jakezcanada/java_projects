package S1;

import java.util.Arrays;
import java.util.Scanner;

public class VoronoiVillages {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] v = new int[n];
		for(int i = 0; i < n; i++) {
			v[i] = sc.nextInt();
		}
		Arrays.sort(v);
		double L = 0;
		double R = 0;
		double s = Integer.MAX_VALUE;
		for(int i = 1; i < n - 1; i++) {
			int RDiff = v[i + 1] - v[i];
			int LDiff = v[i] - v[i-1];
			L = LDiff/2.0;
			R = RDiff/2.0;
			if(L+R<s) {
				s = L+R;
			}
		}
		System.out.println(String.format("%.1f", s));
	}

}
