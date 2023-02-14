package section4Challenges;

import java.util.Scanner;

public class SecondsAndMinutes59 {

	public static String getDurationString(int minutes, int seconds) {
		boolean checkMinutes = minutes >= 0 ? true:false;
		boolean checkSeconds = seconds >= 0 && seconds <= 59 ? true:false;
		if(!checkMinutes || !checkSeconds) {
			return "Invalid Value";
		}
		int totalMin = minutes;
		int totalSec = seconds;
		int totalHours = 0;
		if(totalMin >= 60) {
			boolean greaterThan60 = true;
			while(greaterThan60) {
				if(totalMin < 60) {
					greaterThan60 = false;
				}else {
					totalHours++;
					totalMin = totalMin - 60;
				}
			}
		}
		return totalHours + "h " + totalMin + "m " + totalSec + "s";
	}
	public static String getDurationString(int seconds) {
		boolean checkSeconds = seconds >= 0 && seconds <= 59 ? true:false;
		if(!checkSeconds) {
			return "Invalid Value";
		}
		int totalSec = seconds;
		int totalMin = 0;
		if(totalSec >= 60) {
			boolean greaterThan60 = true;
			while(greaterThan60) {
				if(totalSec < 60) {
					greaterThan60 = false;
				}else {
					totalMin++;
					totalSec = totalSec - 60;
				}
			}
		}
		return totalMin + " " + totalSec;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int sec = sc.nextInt();
		if(getDurationString(sec).equals("Invalid Value")) {
			
		}
		System.out.println(getDurationString(sc.nextInt(),sc.nextInt()));
	}

}
