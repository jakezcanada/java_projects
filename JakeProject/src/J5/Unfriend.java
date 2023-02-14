package J5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Unfriend {

	public static boolean checkValid(List<List<Integer>> people, List<Integer> set, int setnum) {
		List<Integer> innerpeople = people.get(setnum - 1);
		// [1]
		for (int j = 0; j < innerpeople.size(); j++) {
			// check if the set contains children
			if (set.contains(innerpeople.get(j))) {
				// if the set contains the children
				if (!checkValid(people, set, innerpeople.get(j))) {
					return false;
				}
			} else {
				return false;
			}
		}
		return true;
	}

	public static boolean isPossible(List<List<Integer>> people, List<Integer> set) {
		for (int i = 0; i < set.size(); i++) {
			if (!checkValid(people, set, set.get(i))) {
				return false;
			}
		}

		return true;
	}

	public static List<List<Integer>> createPowerSet(int n) {

		if (n == 0) {
			List<List<Integer>> temp = new ArrayList<List<Integer>>();
			temp.add(new ArrayList<Integer>());
			return temp;
		}

		List<List<Integer>> smallerPowerSet = createPowerSet(n - 1);
		List<List<Integer>> withN = new ArrayList<List<Integer>>();

		for (int i = 0; i < smallerPowerSet.size(); i++) {
			List<Integer> copy = new ArrayList<Integer>(smallerPowerSet.get(i));
			copy.add(n);
			withN.add(copy);
		}
		smallerPowerSet.addAll(withN);
		return smallerPowerSet;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int mark = sc.nextInt();
		// HashMap<Integer, Integer[]> people = new HashMap<Integer, Integer[]>();
		// person, who they invited
		// int[][] people = new int[mark-1][mark];
		List<List<Integer>> people = new ArrayList<List<Integer>>();
		for (int i = 0; i < mark; i++) {
			people.add(new ArrayList<Integer>());
		}
		for (int i = 1; i <= mark - 1; i++) {
			int inviter = sc.nextInt();
			people.get(inviter - 1).add(i);
		}
		List<List<Integer>> testeate = createPowerSet(mark - 1);
		int solutions = testeate.size();
		for (int i = 0; i < testeate.size(); i++) {
			if (!isPossible(people, testeate.get(i))) {
				solutions--;
			}
		}
		System.out.println(solutions);
	}
}
