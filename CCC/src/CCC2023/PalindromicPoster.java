package CCC2023;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromicPoster {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int pr = sc.nextInt();
		int pc = sc.nextInt();
		if(pr == 1 && pc == 1) {
			char a = 97;
			char[][] arr = new char[r][c];
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					arr[i][j] = (char) 97;
				}
			}
			for(int i = 1; i < c; i++) {
				arr[0][i] = (char) (arr[0][i] + 1);
			}
			for(int i = 0; i < r; i++) {
				arr[i][0] = (char) (arr[i][0] + 1);
			}
			for(int i = 0; i < r; i++) {
				for(int j = 0; j < c; j++) {
					if(j != c-1) System.out.print(arr[i][j]+" ");
					else System.out.print(arr[i][j]);
				}
				if(i != r-1) System.out.println();
			}
				
		}else if(r == 2 && c == 2) {
			if(pr == 0 && pc == 0) {
				System.out.println("ab");
				System.out.println("cd");
			}else if(pr == 1 && pc == 1){
				System.out.println("aa");
				System.out.println("ab");
			}else if(pr == 1 && pc == 0){
				System.out.println("bc");
				System.out.println("aa");
			}else if(pr == 0 && pc == 1){
				System.out.println("ab");
				System.out.println("ac");
			}else if(pr == 2 && pc == 2){
				System.out.println("aa");
				System.out.println("aa");
			}else if(pr == 0 && pc == 2){
				System.out.println("ba");
				System.out.println("ba");
			}else if(pr == 2 && pc == 0){
				System.out.println("bb");
				System.out.println("aa");
			}else {
				System.out.println("IMPOSSIBLE");
			}
		}else {
			System.out.println("This is for the subtask, I dont care what this is. :)");
		}
	}
}
