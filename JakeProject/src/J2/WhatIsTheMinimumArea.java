package J2;

import java.util.Scanner;

public class WhatIsTheMinimumArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] coords = new int[n][2];
		for(int i = 0; i<n; i++) {
			coords[i][0] = sc.nextInt();
			coords[i][1] = sc.nextInt();
		}
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i<coords.length-1; i++) {
			for(int j = i+1; j<coords.length; j++) {
				int xCalc = Math.abs(coords[i][0] - coords[j][0]);
				int yCalc = Math.abs(coords[i][1] - coords[j][1]);
				int square = xCalc > yCalc ? xCalc : yCalc;
				if(square < smallest) {
					smallest = square;
				}
			}
		}
		System.out.println(smallest*smallest);
	}
}
