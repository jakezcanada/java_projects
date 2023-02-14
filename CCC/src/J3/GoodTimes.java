package J3;

import java.util.Scanner;

public class GoodTimes {
	public static int addTime(String time, int add){
		int t = Integer.parseInt(time);
		int h = (int) (t/100);
		int m = t-(h*100);
		h += (int) (add/100);
		m += add-(((int) (add/100))*100);
		if(h<0) {
			h += 24;
		}
		if(m>59) {
			m -= 60;
			h += 1;
		}
		if(h>23) {
			h -= 24;
		}
		return (h*100)+m;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time= sc.next();
		System.out.println(time + " in Ottawa");
		System.out.println(addTime(time, -300) + " in Victoria");
		System.out.println(addTime(time, -200) + " in Edmonton");
		System.out.println(addTime(time, -100) + " in Winnipeg");
		System.out.println(time + " in Toronto");
		System.out.println(addTime(time, 100) + " in Halifax");
		System.out.println(addTime(time, 130) + " in St. John's");
	}
}