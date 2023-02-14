import java.util.*;

public class ItsColdHere {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> myList1 = new ArrayList<Integer>();
		List<String> myList2 = new ArrayList<String>();
		String place1 = sc.next();
		int num1 = sc.nextInt();
		String lowest = place1;
		int lowest2 = num1;
		while(true){
			String place = sc.next();
			int num = sc.nextInt();
			if(num<lowest2){
				lowest2 = num;
				lowest = place;
			}
			if(place.equals("Waterloo")){
				break;
			}
		}
		System.out.println(lowest);
	}

}
