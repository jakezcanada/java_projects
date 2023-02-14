import java.util.Scanner;

public class MinElementChallenge {
	private static Scanner sc = new Scanner(System.in);
	private static int[] readIntegers(int num){
		int[] arr = new int[num];
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	private static int findMin(int[] arr){
		int num = arr[0];
		for(int i = 0; i<arr.length; i++){
			if(num>arr[i]){
				num = arr[i];
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int numOfInputs = sc.nextInt();
		int[] numbers = readIntegers(numOfInputs);
		int minNumber = findMin(numbers);
		System.out.println(minNumber);
	}

}
