import java.util.Scanner;

public class ConvertTheTime {
	// && min<60 && hour<24 && day<7
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sec =sc.nextInt();
		int min = 0;
		int hour = 0;
		int day = 0;
		int week = 0;
		while(sec>=60){
				sec = sec-60;
				min = min + 1;
		}
		while(min>=60){
				min = min - 60;
				hour = hour + 1;
		}
		while(hour>=24){
			hour = hour - 24;
			day = day + 1;
		}
		while(day>=7){
			day = day - 7;
			week = week + 1;
		}
		System.out.println(week+" w "+day+" d "+hour+" h "+min+" m "+sec+" s ");
	}

}