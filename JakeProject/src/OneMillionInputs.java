import java.util.Scanner;

public class OneMillionInputs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for(int k = 0; k<num.length; k=k+1){
			num[k] = (int)(Math.random()*1000000);
		}
		int m = sc.nextInt();
		for(int count = 0; count<m; count++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int total = 0;
			for(int k = a; k<=b; k++){
				total = total + num[k];
			}
			System.out.println(total);
		}
		sc.close();
	}

}
