package section5Challenges;

import java.util.Scanner;

public class DayOfTheWeekChallenge {

	public static void printDayOfTheWeek(int day) {
		switch(day) {
			case 0:
				System.out.println("Monday");
				break;
			case 1:
				System.out.println("Tuesday");
				break;
			case 2:
				System.out.println("Wednesday");
				break;
			case 3:
				System.out.println("Thursday");
				break;
			case 4:
				System.out.println("Friday");
				break;
			case 5:
				System.out.println("Saturday");
				break;
			case 6:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Invalid day");
				break;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		printDayOfTheWeek(sc.nextInt());
	}

}
