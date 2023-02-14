package J2;

import java.util.Scanner;

public class RSANumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int result = 0;
		for(int n = start; n<end+1; n++) {
			int counter = 0;
	        for(int i = 1; i <= n; ++i) {
	            if (n % i == 0) {
	                counter++;
	            }
	        }
	        if(counter == 4) {
	        	result++;
	        }
		}
		System.out.println("The number of RSA numbers between "+ start + " and " + end + " is " + result);
	}

}
