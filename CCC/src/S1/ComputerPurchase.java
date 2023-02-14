package S1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ComputerPurchase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0) {
			return;
		}
		if(n==1) {
			System.out.print(sc.next());
			return;
		}
		List<String> arr = new ArrayList<String>();
		boolean sameScore = false;
		for(int i = 0; i<n; i++) {
			String tn = sc.next();
			int value = (2*sc.nextInt()) + (3*sc.nextInt()) + sc.nextInt();
			arr.add(value + " " + tn);
		}
		Collections.sort(arr, (a,b) -> Integer.parseInt(a.split(" ")[0])>Integer.parseInt(b.split(" ")[0]) ? -1 :
			Integer.parseInt(a.split(" ")[0])==Integer.parseInt(b.split(" ")[0]) ? a.split(" ")[1].compareTo(b.split(" ")[1]) < 0 ? -1 : 1 : 1);
		System.out.println(arr.get(0).split(" ")[1]);
		System.out.println(arr.get(1).split(" ")[1]);
	}

}
