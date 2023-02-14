package J1;

import java.util.Scanner;

public class BoilingWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int result = in*5-400;
		System.out.println(result);
		if(result==100) {
			System.out.println("0");
		}else if (result>100) {
			System.out.println("-1");
		}else {
			System.out.println("1");
		}
	}

}
