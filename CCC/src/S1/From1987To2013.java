package S1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class From1987To2013 {

	public static boolean hasDiffDigits(int n) {
		String[] nStr = (n+"").split("");
		Set<String> mySet = new HashSet<String>(Arrays.asList(nStr));
		if(mySet.size()==nStr.length) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n<100000) {
			n+=1;
			if(hasDiffDigits(n)) {
				System.out.print(n);
				return;
			}
		}
	}

}