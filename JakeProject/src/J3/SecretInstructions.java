package J3;

import java.util.Scanner;

public class SecretInstructions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = "";
		String pD = "";
		int check = 1;
		while(!in.equals("99999")) {
			in = sc.next();
			if(in.equals("99999")) {
				break;
			}
			if(check!=1){
				System.out.println();
			}else {
				check=2;
			}
			int c1 = Integer.parseInt(in.substring(0,1)) + Integer.parseInt(in.substring(1,2));
			int c2 = Integer.parseInt(in.substring(2,5));
			if(c1==0) {
				System.out.print(pD);
			}else if(c1%2==0){
				System.out.print("right");
				pD = "right";
			}else {
				System.out.print("left");
				pD = "left";
			}
			System.out.print(" " + c2);
		}
	}
}
