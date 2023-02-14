package S3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuantumOperations {
	
	public static int[][] mergeArrays(int[][] a, int[][] b){
		int[][] arr = new int[a.length*b.length][a[0].length*b[0].length];
		for(int k = 0; k < a.length; k++){
			for(int l = 0; l < a[0].length; l++){
				// for each block in a
				int yOff = b.length*k;
				int xOff = b[0].length*l;
				for(int i = 0; i < b.length; i++){
					for(int j = 0; j < b[0].length; j++){
						// for each block in b
						arr[yOff + i][xOff + j] = a[k][l] * b[i][j];
					}
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
	}
}
