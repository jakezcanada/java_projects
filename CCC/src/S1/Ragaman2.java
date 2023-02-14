package S1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ragaman2 {

	public static boolean compareInput(List<String> a, List<String> b, String ast1, String ast2) {
		boolean looper = true;
		if(Integer.parseInt(ast1)>0) {
			for(int i = 0; i < Integer.parseInt(ast1); i++) {
				a.add("*");
			}
		}
		if(Integer.parseInt(ast2)>0) {
			for(int i = 0; i < Integer.parseInt(ast2); i++) {
				b.add("*");
			}
		}
//		System.out.println(String.join(", ", a));
//		System.out.println(String.join(", ", b));
//		System.out.println(a.get(0));
		while(looper) {
			if(a.size()==0 && b.size()==0) {
				break;
			}
			String str1 = a.get(0);
			String str2 = b.get(0);
			if(str1.equals(str2)) {
				a.remove(0);
				b.remove(0);
			}else {
//				System.out.println(str1);
//				System.out.println(str2);
				if(str1.equals("*") || str2.equals("*")) {
					break;
				}
				if(str1.charAt(0) > str2.charAt(0)) {
					if(a.get(a.size()-1).equals("*")) {
						a.remove(a.size()-1);
						b.remove(0);
					}else {
						return false;
					}
				}else {
					if(b.get(b.size()-1).equals("*")) {
						a.remove(0);
						b.remove(b.size()-1);
					}else {
						return false;
					}
				}
			}
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in1 = sc.next(); // O(n) since we have read in every character
		String in2 = sc.next(); // O(m)
		if(in1.length() != in2.length()) { // O(1) simple comparisons are generally O(1)
			System.out.println("N");
			return;
		}
		int ast1 = in1.replaceAll("[^*]", "").length();
		int ast2 = in2.replaceAll("[^*]", "").length();
		if(ast1 == in1.length() || ast2 == in2.length()) {
			System.out.println("A");
			return;
		}
		List<String> arr1 = new ArrayList<String>();
		List<String> arr2 = new ArrayList<String>();
//		System.out.println(ast1);
//		System.out.println(ast2);
		arr1.addAll(Arrays.asList(in1.replaceAll("\\*", "").split("")));
		arr2.addAll(Arrays.asList(in2.replaceAll("\\*", "").split("")));
		Collections.sort(arr1);
		Collections.sort(arr2);
		if(compareInput(arr1, arr2, ast1+"", ast2+"")) {
			System.out.println("A");
		}else {
			System.out.println("N");
		}
	}
}
