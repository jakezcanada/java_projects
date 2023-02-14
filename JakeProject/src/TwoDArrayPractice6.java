import java.util.Scanner;

public class TwoDArrayPractice6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = 5;
		String[][] arr = new String[num][num + 1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				String input = sc.next();
				arr[i][j] = input;
			}
		}
		int calc = (num / 2) + 1;
		int calc2 = (calc / 2) + 1;
		String middleNum = calc + "";
		for (int i = 1; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length - 1; j++) {
				if (num > 8) {
					if (j == calc2 + 1 && arr[i][j].equals(arr[calc - 1][calc - 1])) {

					} else {
						arr[i][j] = " ";
					}
				} else {
					if (j == calc2 && arr[i][j].equals(arr[calc - 1][calc - 1])) {

					} else {
						arr[i][j] = " ";
					}
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (j == arr.length - 1) {
					System.out.println(arr[i][j]);
				} else {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
	}
}
