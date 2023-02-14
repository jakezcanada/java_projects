package J1;
import java.util.*;

public class WhoIsInTheMiddle {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(sc.nextInt());
		myList.add(sc.nextInt());
		myList.add(sc.nextInt());
		Collections.sort(myList);
		System.out.println(myList.get(1));
	}
}
