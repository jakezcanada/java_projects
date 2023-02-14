package classes;

import java.util.Scanner;

public class Rot {

	public static String[][] rotate90(String[][] arr) {
		int length = arr.length;
		int width = arr[0].length;
		String[][] newArr = new String[width][length];
		for(int i = 0; i<width; i++) {
			for(int j = 0; j<length; j++) {
				newArr[i][j] = arr[length-j-1][i];
			}
		}
		return newArr;
	}
	
	public static void rotate45(String[][] arr) {
		int length = arr.length;
		int width = arr[0].length;
		//String[][] newArr = new String[width][length];
//		for(int i = 0; i<length-1; i++) {
//			for(int spaces = length-i-1; spaces>0; spaces--) {
//				System.out.print(" ");
//			}
//			for(int c = 0; c<=i; c++) {
//				if(c!=0) {
//					System.out.print(" ");
//				}
//				System.out.print(arr[i-c][c]);
//			}
//			System.out.println();
//		}
//		for(int i = 0; i<width-length+1; i++) {
//			for(int spaces = i; spaces>0; spaces--) {
//				System.out.print(" ");
//			}
//			for(int c = 0; c<length; c++) {
//				if(c!=0) {
//					System.out.print(" ");
//				}
//				System.out.print(arr[length-1-c][c+i]);
//			}
//			System.out.println();
//		}
//		for(int i = length-2; i>-1; i--) {
//			for(int spaces = width-i-1; spaces>0; spaces--) {
//				System.out.print(" ");
//			}
//			for(int c = 0; c<=i; c++) {
//				if(c!=0) {
//					System.out.print(" ");
//				}
//				System.out.print(arr[length-1-c][width-1-(length-2)+c+(length-2-i)]);
//			}
//			System.out.println();
//		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String[][] strArr = new String[n1][n2];
		for(int i = 0; i<n1; i++) {
			String temp = sc.next();
			for(int j = 0; j<n2; j++) {
				strArr[i][j] = temp.substring(j,j+1);
				//System.out.print(strArr[i][j]);
			}
		}
		int angle = sc.nextInt();
		int rot90 = (int) angle/90;
		for(int i = 0; i<rot90; i++) {
			strArr = rotate90(strArr);
		}
		if(angle%90!=0) {
			rotate45(strArr);
		}else {
			for(int i = 0; i<strArr.length; i++) {
				for(int j = 0; j<strArr[0].length; j++) {
					System.out.print(strArr[i][j]);
				}
				System.out.println();
			}
		}
		
		
	}

}
