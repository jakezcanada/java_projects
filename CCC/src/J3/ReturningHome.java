package J3;

import java.util.ArrayList;
import java.util.Scanner;

public class ReturningHome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		while (sc.hasNextLine() != false) {
			String direction = sc.next();
			String place = sc.next();
			a.add(direction);
			if(place.equals("SCHOOL")) {
				break;
			}
			a.add(place);
		}
		for(int i = a.size()-1; i>0; i -= 2) {
			System.out.println("Turn " + ((a.get(i).equals("R")) ? "LEFT" : "RIGHT") + " onto " + a.get(i-1) +" street.");
		}
		System.out.println("Turn " + ((a.get(0).equals("R")) ? "LEFT" : "RIGHT") + " into your HOME.");
	}

}
