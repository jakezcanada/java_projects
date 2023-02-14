import java.util.Scanner;

public class RenAshbell {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ra = sc.nextInt();
		for(int i = 0; i<n-1; i++) {
			if(ra<=sc.nextInt()) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}

}
