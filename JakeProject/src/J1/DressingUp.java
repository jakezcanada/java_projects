package J1;
import java.util.Scanner;

public class DressingUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num = input * 2;
		int num2 = (input / 2) + 5;
		int num3 = (input / 2) + 3;
		for (int i = 1; i < input + 2; i = i + 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < num - (i * 2); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = input - 2; i > 0; i = i - 2) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < num - (i * 2); j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			if (i != 1) {
				System.out.println();
			}
		}
	}

}
