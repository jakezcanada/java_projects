package J4;

import java.util.Scanner;

public class CyclicShifts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		boolean check = false;
		if(str1.length()<str2.length()) {
			System.out.print("no");
		}else {
			for(int i = 0; i<str1.length()-str2.length()+1; i++) {
				String sub = str1.substring(i,i+str2.length());
				for(int j = 0; j<str2.length(); j++) {
					if(str2.equals(sub)) {
						check = true;
						break;
					}
					sub = sub.substring(1,sub.length())+sub.charAt(0);
				}
				if(check) {
					break;
				}
			}
			if(check) {
				System.out.print("yes");
			}else {
				System.out.print("no");
			}
		}
		
	}

}
