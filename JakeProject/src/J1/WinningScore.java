package J1;

import java.util.Scanner;

public class WinningScore {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int apples = (sc.nextInt()*3) + (sc.nextInt()*2) + sc.nextInt(); 
		int bananas = (sc.nextInt()*3) + (sc.nextInt()*2) + sc.nextInt(); 
		if(apples>bananas) {
			System.out.println("A");
		}else if(apples<bananas){
			System.out.println("B");
		}else {
			System.out.println("T");
		}
	}

}
