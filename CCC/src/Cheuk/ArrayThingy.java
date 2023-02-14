package Cheuk;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayThingy {
	
	public static void printGay(int[][] arr, int x, int y) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(i == y && j == x) {
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] gayDog = new int[5][5];
		for(int[] arr : gayDog) {
			Arrays.fill(arr, 0);
		}
		gayDog[0][0] = 1;
		String input = "";
		int x = 0;
		int y = 0;
		boolean hit = false;
		printGay(gayDog, x, y);
		while(true) {
			input = sc.next();
			if(input.equals("L") && x > 0) {
				x -= 1;
				hit = true;
			}
			if(input.equals("R") && x < gayDog.length-1) {
				x += 1;
				hit = true;
			}
			if(input.equals("U") && y > 0) {
				y -= 1;
				hit = true;
			}
			if(input.equals("D") && y < gayDog.length-1) {
				y += 1;
				hit = true;
			}
			if(hit) {
				printGay(gayDog, x, y);
				hit = false;
			}else {
				System.out.println("fuck off m8");
				break;
			}
		}
	}
}
