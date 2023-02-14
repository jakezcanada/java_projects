package S1;

import java.util.Scanner;

public class Fix {

	public static boolean fixFree(String a, String b) {
		if(a.indexOf(b) == 0) {
			return true;
		}
		if(b.indexOf(a) == 0) {
			return true;
		}
		a = new StringBuffer(a).reverse().toString();
		b = new StringBuffer(b).reverse().toString();
		if(a.indexOf(b) == 0) {
			return true;
		}
		if(b.indexOf(a) == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			String a = sc.next();
			String b = sc.next();
			String c = sc.next();
			if(fixFree(a, b) || fixFree(a, c) || fixFree(b, c)) {
				System.out.println("No");
			}else {
				System.out.println("Yes");
			}
		}
	}
}
