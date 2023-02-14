package S1;

import java.util.Scanner;

public class SnowCalls {

	public static String convert(String str) {
		str = str.replaceAll("[ABC]", "2").replaceAll("[DEF]", "3").replaceAll("[GHI]", "4").replaceAll("[JKL]", "5").replaceAll("[MNO]", "6").replaceAll("[PQRS]", "7").replaceAll("[TUV]", "8").replaceAll("[WXYZ]", "9");
		return str;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			String in = sc.next().replaceAll("-", "");
			in = convert(in);
			System.out.println(in.substring(0,3) + "-" + in.substring(3,6) + "-" + in.substring(6,10));
		}
	}
	
}
