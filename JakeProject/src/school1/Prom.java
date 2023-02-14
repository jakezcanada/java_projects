package school1;

import java.util.Scanner;

public class Prom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // declare scanner for input
		
		double totalCost = 100; // 100 flat for misc costs
		
		System.out.println("Enter food cost:"); // prompt for input
		totalCost += sc.nextInt(); // add to total cost
		
		System.out.println("Enter DJ cost:"); // prompt for input
		totalCost += sc.nextInt(); // add to total cost
		
		System.out.println("Enter hall cost:"); // prompt for input
		totalCost += sc.nextInt(); // add to total cost
		
		System.out.println("Enter decoration cost:"); // prompt for input
		totalCost += sc.nextInt(); // add to total cost
		
		System.out.println("Enter staff cost:"); // prompt for input
		totalCost += sc.nextInt(); // add to total cost
		
		int ticketsNeeded = (int) (((double) ((int) (totalCost/65.0))<totalCost/65.0) ? (totalCost/65.0)+1 : totalCost/65.0); // calculate tickets needed
		
		System.out.println("You will need at least " + ticketsNeeded + " ticket sales to break even."); // print tickets needed
		
	}

}
