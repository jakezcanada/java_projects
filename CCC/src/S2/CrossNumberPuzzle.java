package S2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CrossNumberPuzzle {
	public static boolean isPerfect(int num) {
		int sum = -num;
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum+=i;
				sum+=num/i;
			}
		}
		if(sum == num) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		for (int i = 1000; i < 10000; i++) {
			if(isPerfect(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		String str = "";
		for (int i = 100; i < 1000; i++) {
			int[] arr = Arrays.stream((i+"").split("")).mapToInt(Integer::parseInt).toArray();
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += Math.pow(arr[j], 3);
			}
			if(sum == i) {
				str += i + " ";
			}
		}
		System.out.print(str.substring(0,str.length()-1));
	}
}