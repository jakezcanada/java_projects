package work;

public class DateThing {
	
	public static String talkingCalendar(String date) {
		String[] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String answer = "";
		String[] temp = date.split("/");
		int day = Integer.parseInt(temp[2]);
		answer += arr[Integer.parseInt(temp[1])-1] + " ";
		answer += day + ((day == 1) ? "st, " : (day == 2) ? "nd, " : "th, ");
		answer += temp[0];
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(talkingCalendar("2017/12/02"));
		System.out.println(talkingCalendar("2007/11/11"));
		System.out.println(talkingCalendar("1987/08/24"));
	}
}
