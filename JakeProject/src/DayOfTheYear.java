import java.util.*;
import java.text.DateFormatSymbols;

public class DayOfTheYear {
	public static String getMonth(int month) {
	    return new DateFormatSymbols().getMonths()[month];
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_YEAR, sc.nextInt());
		cal.set(Calendar.YEAR, sc.nextInt());
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int moy = cal.get(Calendar.MONTH);
		System.out.println(dom + " " + getMonth(moy));
	}
}
