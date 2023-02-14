import java.util.*;

public class ReduceArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] inputs = new int[a];
		int[] backupArr = new int[a];
		int[] lastArr = new int[a];
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < a; i++) {
			int input = sc.nextInt();
			inputs[i] = input;
			backupArr[i] = input;
			myList.add(input);
		}
		Collections.sort(myList);
		for (int i = 0; i < a; i++) {
			int num = backupArr[i];
			int rightLim = a;
			int leftLim = 0;
			int mid = (rightLim + leftLim) / 2;
			boolean toggle = false;
			while (!toggle) {
				if (num == myList.get(mid)) {
					lastArr[i] = mid;
					System.out.print(lastArr[i] + " ");
					toggle = true;
				} else if (num > myList.get(rightLim / 2)) {
					leftLim = mid;
					mid = (rightLim + leftLim) / 2;
				} else {
					rightLim = mid;
					mid = (rightLim + leftLim) / 2;
				}
			}
		}
	}

}
