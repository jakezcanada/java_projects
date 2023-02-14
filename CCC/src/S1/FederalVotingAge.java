package S1;

import java.util.Scanner;

public class FederalVotingAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			if(year<1989) {
				System.out.println("Yes");
			}else if(year==1989) {
				if(month>2) {
					System.out.println("No");
				}else if(month<2) {
					System.out.println("Yes");
				}else {
					if(day<28) {
						System.out.println("Yes");
					}else {
						System.out.println("No");
					}
				}
			}else {
				System.out.println("No");
			}
		}
	}
	
}
