package school1;

import java.util.Scanner;

public class Radius {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // declare scanner for input
		
		System.out.println("What is your radius?"); // prompt for input
		double r = sc.nextInt(); // get circle diameter
		System.out.println("What is your height?"); // prompt for input
		double h = sc.nextInt(); // get cylinder height
		double pi = 3.14; // declare pi for ease of calculation
		
		System.out.println("\n\n"); // create space
		
		System.out.println("Assuming pi is 3.14:"); // declares that pi = 3.14 and not 3.1415.....
		System.out.println();
		
		System.out.println("The circle's perimeter: " + String.format("%.2f", (2*pi*r)) + " units"); // calculate and print perimeter
		System.out.println("The circle's area: " + String.format("%.2f", (pi*(r*r))) + " units squared"); // calculate and print area of circle
		System.out.println();
		
		System.out.println("The cylinder's surface area: " + String.format("%.2f", (2*pi*(r*r)) * (2*pi*r*h)) + " units squared"); // calculate and print surface area
		System.out.println("The cylinder's volume: " + String.format("%.2f", (pi*(r*r))) + " units cubed"); // calculate and print perimeter
		System.out.println();
		
		System.out.println("The sphere's surface area: " + String.format("%.2f", (4*pi*(r*r))) + " units squared"); // calculate and print surface area
		System.out.println("The sphere's volume: " + String.format("%.2f", ((4.0/3.0)*pi*(r*r*r))) + " units cubed"); // calculate and print volume
	}
	
}
