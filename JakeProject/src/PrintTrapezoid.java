import java.util.Scanner;

public class PrintTrapezoid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt()*2;// number of stars
		int k = d/2;// number of spaces
		int looper = k;
		// loop for 10 lines
		for (int i = 0; i < looper; i++) {

			for (int l = k; l * 2 > 1; l--) {
				System.out.print(" ");// two spaces
			}
			// loop for d stars
			for (int j = 0; j * 2 < d; j++) {
				System.out.print("*");
			}

			System.out.println();

			k--;// discriminate the number of spaces
			d = d + 4;// increment the number of stars
		}
	}
}
