import java.util.*;

public class TwoDArrayPractice5 {
	private static int findSecondGreatest(List<Integer> l) {
		int secondGreatest = 0;
		Collections.sort(l);
		secondGreatest = l.get(l.size() - 2);
		return secondGreatest;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int[][] arr = new int[num2][num1];
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> finalList = new ArrayList<Integer>();
		for (int i = 0; i < num1; i++) {
			for (int j = 0; j < num2; j++) {
				int a = sc.nextInt();
				arr[j][i] = a;
			}
		}
		for (int i = 0; i < num2; i++) {
			for (int j = 0; j < num1; j++) {
				myList.add(arr[i][j]);
			}
			int secondGreatest = findSecondGreatest(myList);
			finalList.add(secondGreatest);
			while (!myList.isEmpty()) {
				myList.remove(myList.get(0));
			}
		}
		String last = Arrays.toString(finalList.toArray()).replace("[", "").replace("]", "").replace(",", "");
		System.out.println(last);
	}
}
