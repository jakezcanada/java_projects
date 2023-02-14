package school1;

import java.util.Scanner;

public class Prime {
	
	// method isPrime checks whether a number is prime or not
	public static boolean isPrime(int n) {
		if(n<2) { // anything under 2 is prime
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n%i==0) { // check divisibility
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // declare scanner for input
		int start = 2; // start from 2 since 1 is not a prime number
		
		System.out.println("Enter a number:"); // prompt for input
		int input = sc.nextInt(); // get input
		
		System.out.println("Prime numbers from 1 to " + input + ":"); // begin prints
		for(int i = start; i <= input; i++) {
			if(isPrime(i)) { // check for prime number
				System.out.println(i); // print out prime numbers
			}
		}
	}
	
}
