package J3;
import java.util.Scanner;

public class SmileWithSimiles {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		String[] a = new String[n];
		String[] b = new String[m];
		for(int i = 0; i<n; i++) {
			a[i] = sc.next();
		}
		for(int i = 0; i<m; i++) {
			b[i] = sc.next();
		}
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<m; j++) {
				System.out.println(a[i] + " as " + b[j]);
			}
		}
	}
}
