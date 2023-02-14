package J1;
import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = (int) Math.sqrt(a);
		System.out.println("The largest square has side length "+ b + ".");
	}

}
