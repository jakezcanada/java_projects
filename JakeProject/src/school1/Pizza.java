package school1;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // declare scanner for input
		System.out.println("What is your pizza size?"); // prompt for input
		double d = sc.nextInt(); // get pizza diameter
		System.out.println("The cost of your pizza is $" + String.format("%.2f", (0.05*d*d)+1.75));
		// the line above displays the final message and formats the pizza's calculated price
	}

}
