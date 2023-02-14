package S1;

import java.util.Scanner;

public class SnakesAndLadders {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int position = 1;
		int in = 1;
		while(in!=0) {
			in = sc.nextInt();
			if(in == 0) {
				System.out.print("You Quit!");
				return;
			}
			position+=in;
			if(position > 100) {
				position-=in;
			}
			if(position == 99) {
				position = 77;
			}
			if(position == 54) {
				position = 19;
			}
			if(position == 90) {
				position = 48;
			}
			if(position == 9) {
				position = 34;
			}
			if(position == 40) {
				position = 64;
			}
			if(position == 67) {
				position = 86;
			}
			System.out.println("You are now on square " + position);
			if(position == 100) {
				System.out.print("You Win!");
				return;
			}
		}
	}
}
