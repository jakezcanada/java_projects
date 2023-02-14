import java.util.Scanner;

public class NthDayOfTheYear {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int result = 0;
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		boolean leapYearChecker = false;

		if (year % 4 == 0) {
			leapYearChecker = true;
		}
		if (month == 2) {
			result += 31;
			if (year % 4 == 0) {
				leapYearChecker = false;
			}
		}
		if (month == 3) {
			result += 59;
		}
		if (month == 4) {
			result += 90;
		}
		if (month == 5) {
			result += 120;
		}
		if (month == 6) {
			result += 151;
		}
		if (month == 7) {
			result += 181;
		}
		if (month == 8) {
			result += 212;
		}
		if (month == 9) {
			result += 243;
		}
		if (month == 10) {
			result += 273;
		}
		if (month == 11) {
			result += 304;
		}
		if (month == 12) {
			result += 334;
		}
		if(leapYearChecker){
			result += 1;
		}
		result += day;
		System.out.println(result);
	}
}
