package J1;
import java.util.Scanner;

public class NextInLine {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int biggestChild = b + (b-a);
		System.out.println(biggestChild);
	}

}
