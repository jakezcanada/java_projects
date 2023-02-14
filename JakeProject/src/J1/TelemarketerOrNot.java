package J1;

import java.util.Scanner;

public class TelemarketerOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean pickup = false;
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a != 9 && a != 8) {
			pickup = true;
		}
		if(b != c) {
			pickup = true;
		}
		if(d != 9 && d != 8) {
			pickup = true;
		}
		if(pickup){
			System.out.println("answer");
		}else {
			System.out.println("ignore");
		}
	}

}
