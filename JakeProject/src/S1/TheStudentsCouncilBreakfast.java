package S1;

import java.util.Scanner;

public class TheStudentsCouncilBreakfast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] costs = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int raised = sc.nextInt();
		int combos = 0;
		int minTickets = Integer.MAX_VALUE;
		for(double i = 0; i<=raised/costs[0]; i++) {
			//pink loop
			for(double j = 0; j<=raised/costs[1]; j++) {
				//green loop
				for(double k = 0; k<=raised/costs[2]; k++) {
					//red loop
					for(double l = 0; l<=raised/costs[3]; l++) {
						//orange loop
						double totalCost = (i * costs[0]) + (j * costs[1]) + (k * costs[2]) + (l * costs[3]);
						if(totalCost==raised) {
							System.out.println("# of PINK is " + (int) i + " # of GREEN is " + (int) j + " # of RED is " + (int) k + " # of ORANGE is " + (int) l);
							if(i+j+k+l < minTickets) {
								minTickets = (int) (i+j+k+l);
							}
							combos++;
						}
					}
				}
			}
		}
		System.out.println("Total combinations is " + combos + ".");
		System.out.println("Minimum number of tickets to print is " + minTickets + ".");
	}

}
