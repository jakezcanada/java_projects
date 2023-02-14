package J3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HiddenPalindrome {

	public static boolean isPalindrome(String str) {
		List<String> fh = new ArrayList<>();
		List<String> sh = new ArrayList<>();
		if(str.length()<2) {
			return true;
		}
		if(str.length() % 2 == 0) {
			fh.addAll(Arrays.asList(str.substring(0, str.length()/2).split("")));
			sh.addAll(Arrays.asList(str.substring(str.length()/2, str.length()).split("")));
		}else {
			fh.addAll(Arrays.asList(str.substring(0, str.length()/2).split("")));
			sh.addAll(Arrays.asList(str.substring((str.length()/2)+1, str.length()).split("")));
		}
//		System.out.println(fh);
//		System.out.println(sh);
		Collections.reverse(sh);
		if(String.join(", ", fh).equals(String.join(", ", sh))) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		int longestPalindrome = -1;
		for(int i = in.length(); i > 0; i--) {
			for(int j = 0; j < in.length(); j++) {
				//j+i
				if(j+i>in.length()) {
					break;
				}
				String sub = in.substring(j,j+i);
				if(isPalindrome(sub)) {
					//System.out.println(sub);
					longestPalindrome = sub.length();
					break;
				}
			}
			if(longestPalindrome!=-1) {
				break;
			}
		}
		System.out.println(longestPalindrome);
	}

}
