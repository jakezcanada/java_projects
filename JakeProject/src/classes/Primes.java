package classes;

import java.util.Scanner;

public class Primes {
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i = 2; i<=Math.sqrt(num); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int index = 0;
		for(int i = 1; index<num; i++) {
			if(isPrime(i)) {
				System.out.println(i);
				index++;
			}
		}
	}
}
