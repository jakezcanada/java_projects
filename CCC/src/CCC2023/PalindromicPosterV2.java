package CCC2023;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class PalindromicPosterV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int pr = sc.nextInt(); // palindromes in rows
		int pc = sc.nextInt(); // palindromes in columns
		if(pr == 0) {
			for (int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					// unless it is 
					System.out.print("a");
				}
				System.out.println();
			}
		}else if(pc == 0) {
				
		}else if(r == pr) {
			
		}else if(c == pc){
			
		}else {
			for (int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					System.out.print((i < pr || j < pc ? "a" : "b"));
				}
				System.out.println();
			}
		}
	}
}
