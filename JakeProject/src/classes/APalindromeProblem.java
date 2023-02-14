package classes;

import java.util.Scanner;

public class APalindromeProblem {

	public static boolean check(String str) {
		if(str.length()<2) {
			return true;
		}
		String str1 = str.substring(0,str.length()/2);
		String str2;
		if(str.length()%2!=0) {
			str2 = new StringBuilder(str.substring((str.length()/2)+1,str.length())).reverse().toString();
		}else {
			str2 = new StringBuilder(str.substring(str.length()/2,str.length())).reverse().toString();
		}
		if(str1.equals(str2)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean yn = false;
		if(str.length()<=1) {
			System.out.println("NO");
		}else {
			for(int i = 1; i<str.length(); i++) {
				String str1 = str.substring(0,i);
				String str2 = str.substring(i,str.length());
				if(check(str2) && check(str1)) {
					yn = true;
					break;
				}
			}
			if(yn) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
