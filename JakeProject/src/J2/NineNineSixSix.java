package J2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NineNineSixSix {

	public static String flip(int n) {
		List<String> numList = new ArrayList<String>();
		numList = Arrays.asList((n+"").split(""));
		if(numList.contains("2") || numList.contains("3") || numList.contains("4") || numList.contains("5") || numList.contains("7")) {
			return "no";
		}
		String result = "";
		for(int i = numList.size()-1; i>=0; i--) {
			if(numList.get(i).equals("6")) {
				result = result + "9";
			}else if(numList.get(i).equals("9")) {
				result = result + "6";
			}else {
				result = result + numList.get(i);
			}
		}	
		return result;
	}

	public static boolean rotatable(int n) {
		List<String> numList = new ArrayList<String>();
		numList = Arrays.asList((n+"").split(""));
		if(flip(n).equals(n+"")) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int results = 0;
		for(int i = start; i<end+1; i++) {
			if(rotatable(i)) {
				results++;
				System.out.println(i);
			}
		}
		System.out.print(results);
	}

}
