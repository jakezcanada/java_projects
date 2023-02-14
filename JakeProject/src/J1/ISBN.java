package J1;
import java.util.Scanner;

public class ISBN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 91;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		total = total + a;
		total = total + (b*3);
		total = total + c;
		System.out.println("The 1-3-sum is " + total);
	}

}
