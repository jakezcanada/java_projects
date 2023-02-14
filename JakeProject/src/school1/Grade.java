package school1;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // declare scanner for input

		final int NUM_OF_GRADES = 5; // unchanging variable for the number of grades
		double result = 0; // end result
		
		for(int i = 1; i <= NUM_OF_GRADES; i++) { // loop to add input
			System.out.print("Enter grade " + i + ": "); // prompt for input
			result+=sc.nextDouble(); // add input to result, part of average calculation
		}

		System.out.println("The average is: "+String.format("%.2f", (result/NUM_OF_GRADES))+"%"); // calculate average and print it out
	}

}
