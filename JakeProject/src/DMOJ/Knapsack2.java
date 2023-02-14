package DMOJ;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;

public class Knapsack2 {
	
	static List<Integer[]> items = new ArrayList<Integer[]>();
	static int sackSpace;
	public static Integer maxValue(List<Integer[]> sack, int level, int maxVal) {
		for(int i = 0; i<2; i++) {
			if(i == 1) {
				sack.add(items.get(level));
			}
			int value = 0;
			int weight = 0;
			for(int j = 0; j<sack.size(); j++) {
				value += sack.get(j)[1];
				weight += sack.get(j)[0];
			}
			if(maxVal<value && weight<sackSpace) {
				maxVal = value;
			}
			if(level<items.size()-1) {
				level++;
				maxValue(sack, level, maxVal);
			}
		}
		return maxVal;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfItems = sc.nextInt();
		sackSpace = sc.nextInt();
		List<Integer[]> sack = new ArrayList<Integer[]>();
		for(int i = 0; i<numOfItems; i++) {
			Integer[] temp = {sc.nextInt(), sc.nextInt()};
			System.out.println(temp[0] + " " + temp[1]);
			items.add(temp);
		}
		System.out.println(maxValue(sack, 0, 0));
	}

}
