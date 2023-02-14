package J4;
import java.util.*;

public class FavouriteTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int num = Integer.parseInt(in)%720;
		int mins = 0;
		int hours = 12;
		for(int i = 0; i<num; i++) {
			mins++;
			if(mins==60) {
				hours++;
				if(hours>12) {
					hours-=12;
				}
			}
			String[] time = (hours+""+mins).split("");
			int[] arr = new int[time.length];
			for(int j=0; j<time.length; j++) {
		         arr[i] = Integer.parseInt(time[i]);
		    }
		}
		
	}
}