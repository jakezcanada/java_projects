import java.util.Scanner;

public class COCI06Contest2Number1R2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r1 = sc.nextInt();
		int mean = sc.nextInt();
		int calculation = mean-r1;
		int r2 = calculation + mean;
		System.out.println(r2);
	}
}
