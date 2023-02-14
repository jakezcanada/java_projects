package school1;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // declare scanner for input
		
		System.out.println("Enter a number:"); // prompt for input
		int n = sc.nextInt(); // get input
		
		System.out.println("The sum of numbers from 1 to n: " + n*(n+1)/2); // prints the sum of numbers from 1 to n
	}

}
