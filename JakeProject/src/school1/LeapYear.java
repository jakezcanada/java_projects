package school1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // declare scanner for input
		
		System.out.println("Enter a year:"); // prompt for input
		int y = sc.nextInt(); // get year
		
		System.out.print("That is" + ((y%4==0) ? "" : " not") + " a leap year"); // print if it is a leap year or not
	}

}
