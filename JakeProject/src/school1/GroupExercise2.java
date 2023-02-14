package school1;

import java.util.Scanner;

// NAMES: JAKE, ISABELLA, MARSHALL, HARRY

public class GroupExercise2 {

	// finds divisbility by 11 through recursion
	public static long find(long n) {
		if(n<100) {
			return n;
		}
		long lastNum = (long) (n%10);
		long newN = Long.parseLong((n+"").substring(0, (n+"").length()-1)) - lastNum;
		System.out.println(newN);
		return find(newN);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// prompt for input
		System.out.println("Enter a positive integer:");
		long n = sc.nextLong();
		// check input validity
		if(n<0) {
			System.out.println("Dumb input.");
		}else if(n>0){
			find(n);
			System.out.print("The number " + n + " is " + (n%11==0 ? "" : "not ") + "divisible by 11.");
		}else {
			System.out.println("Zero halts the program.");
		}

	}

}
