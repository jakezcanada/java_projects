package S3;

import java.util.Scanner;

public class DoubleKnockoutCompetition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfRounds = sc.nextInt();
		for(int i = 0; i<numOfRounds; i++) {
			int round = 0;
			int undefeated = sc.nextInt();
			int oneL = 0;
			int elim = 0;
			System.out.println("Round " + round + ": " + undefeated + " undefeated, " + oneL + " one-loss, " + elim + " eliminated");
			while(undefeated>1 || oneL>1) {
				round++;
				elim += oneL/2;
				oneL = (oneL - (int) (oneL/2)) + undefeated/2;
				undefeated = undefeated - (int) (undefeated/2);
				System.out.println("Round " + round + ": " + undefeated + " undefeated, " + oneL + " one-loss, " + elim + " eliminated");
			}
			round++;
			oneL += 1;
			undefeated -= 1;
			System.out.println("Round " + round + ": " + undefeated + " undefeated, " + oneL + " one-loss, " + elim + " eliminated");
			round++;
			elim += 1;
			oneL -= 1;
			System.out.println("Round " + round + ": " + undefeated + " undefeated, " + oneL + " one-loss, " + elim + " eliminated");
			System.out.println("There are " + round + " rounds.");
		}
		
	}
}
