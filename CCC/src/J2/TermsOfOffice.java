package J2;

import java.util.Scanner;

public class TermsOfOffice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean looper = true;
		int start = sc.nextInt();
		int end = sc.nextInt();
		int year = start;
		System.out.println("All positions change in year " + start);
		while(looper) {
			year += 60;
			if(year<=end) {
				System.out.println("All positions change in year " + year);
			}else {
				break;
			}
		}
	}

}
