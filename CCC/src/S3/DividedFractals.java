package S3;

import java.util.Arrays;
import java.util.Scanner;

public class DividedFractals {
	
	public static void fract(boolean[][] fractal, int curSize, int yMin, int xMin, int yMax, int xMax) {
		if(curSize==1) {
			return;
		}
		for(int i = yMin+(curSize/3); i<yMin+((curSize/3)*2); i++) {
			for(int j = xMin+(curSize/3); j<xMin+((curSize/3)*2); j++) {
				fractal[i][j] = true;
			}
		}
		for (int i = yMin; i < yMin+curSize; i+=curSize/3) {
			for (int j = xMin; j < xMin+curSize; j+=curSize/3) {
				fract(fractal, curSize/3, i, j, i+curSize/3, j+curSize/3);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfTests = sc.nextInt();
		for(int i = 0; i<numOfTests; i++) {
			int iterations = sc.nextInt();
			int fracSize = (int) Math.pow(3, iterations);
			boolean[][] fractal = new boolean[fracSize][fracSize];
			fract(fractal, fractal.length, 0, 0, fractal.length, fractal.length);
			int yMax = fractal.length-sc.nextInt()+1;
			int yMin = fractal.length-sc.nextInt();
			int xMin = sc.nextInt()-1;
			int xMax = sc.nextInt();
			for (int j = yMin; j < yMax; j++) {
				for (int j2 = xMin; j2 < xMax; j2++) {
					if(fractal[j][j2]) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
					if(j2!=xMax-1)
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}
