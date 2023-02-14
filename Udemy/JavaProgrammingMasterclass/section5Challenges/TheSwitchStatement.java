package section5Challenges;

import java.util.Scanner;

public class TheSwitchStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char userIn = sc.next().charAt(0);
		switch(userIn) {
			case 'A':case 'B':case 'C':case 'D':case 'E':
				System.out.println("we found " + userIn);
				break;
			default:
				System.out.println("found nothing");
				break;
		}
	}

}
