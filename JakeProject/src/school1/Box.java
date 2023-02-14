package school1;

import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // declare scanner for input
		
		System.out.println("Input length:"); // prompt for input
		int l = sc.nextInt(); // get length
		
		System.out.println("Input width:"); // prompt for input
		int w = sc.nextInt(); // get width
		
		for(int i = 0; i<l; i++) {
			for(int j = 0; j<w; j++) {
				System.out.print(((i == 0 || j == 0) || (i == l-1 || j == w-1)) ? "X" : " "); // calculate what to print and print it
			}
			System.out.println(); // next line
		}
		
	}

}
