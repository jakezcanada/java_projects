package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sunflowers {
//	public static int[][] rotate(int[][] arr) {
//		int[][] temp = new int[arr.length][arr[0].length];
//		for(int i = 0; i<arr.length; i++) {
//			for(int j = 0; j<arr[0].length; i++) {
//				temp[i][j] = arr[j][arr.length-1-i];
//			}
//		}
//		return temp;
//	}
	
	public static int[][] rotate(int[][] matrix) {
		 int size = matrix.length;
		 int[][] ret = new int[size][size];

		 for (int i = 0; i < size; ++i) 
		  for (int j = 0; j < size; ++j) 
		   ret[i][j] = matrix[size - j - 1][i]; //***

		 return ret;
	}
	
	public static List<Integer> getRow(int[][] arr){
		return Arrays.stream(arr[0]).boxed().collect(Collectors.toList());
	}
	
	public static List<Integer> getCol(int[][] arr){
		List<Integer> temp = new ArrayList<Integer>();
		for(int[] t : arr) {
			temp.add(t[0]);
		}
		return temp;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		for (int i = 0; i < n; i++) {
			arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		for (int i = 0; i < 4; i++) {
			List<Integer> row = getRow(arr);
			List<Integer> col = getCol(arr);
			List<Integer> row2 = getRow(arr);
			List<Integer> col2 = getCol(arr);
			Collections.sort(row);
			Collections.sort(col);
			if(row.equals(row2)) {
				if(col.equals(col2)) {
					break;
				}
			}
			arr = rotate(arr);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]).replaceAll("[\\[\\]\\,]", ""));
		}
	}

}
