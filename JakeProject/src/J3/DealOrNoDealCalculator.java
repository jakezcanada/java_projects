package J3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class DealOrNoDealCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> cases = new HashMap<Integer, Integer>();
		cases.put(1, 100);
		cases.put(2, 500);
		cases.put(3, 1000);
		cases.put(4, 5000);
		cases.put(5, 10000);
		cases.put(6, 25000);
		cases.put(7, 50000);
		cases.put(8, 100000);
		cases.put(9, 500000);
		cases.put(10, 1000000);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			cases.remove(sc.nextInt());
		}
		int deal = sc.nextInt();
		int average = 0;
		for (Entry<Integer, Integer> entry : cases.entrySet()){
			average+=entry.getValue();
		}
		System.out.println((average/cases.size()) < deal ? "deal" : "no deal");
	}
}
