import java.util.Scanner;

public class QuickEstimates {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long[] arr = new long[num];
		for(int i = 0; i<num; i++){
			String input = sc.next();
			long length = input.length();
			arr[i] = length;
		}
		for(int i = 0; i<num; i++){
			System.out.println(arr[i]);
		}
	}
}
