package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SymmetricalCross {
	public static int check(int y, int x, int[][] matrix) {
		int s = 2;
		while(true){
			if(s+x < matrix[0].length && x-s > -1 && s+y < matrix.length && y-s > -1){
				if(matrix[y-s][x] == matrix[y+s][x] &&
						matrix[y-s][x] == matrix[y][x+s] &&
						matrix[y-s][x] == matrix[y][x-s]){
					s++;
				}else{
					break;
				}
			}else{
				break;
			}
		}
		return s-1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] matrix = new int[in[0]][in[1]];
		for (int i = 0; i < matrix.length; i++) {
			matrix[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		int x = 0;
		int y = 0;
		int crossLen = 0;
		for(int i = 1; i < matrix.length-1; i++){
			//extra time saver, if the cross len is bigger than the loops left break;
			for(int j = 1; j < matrix[0].length-1; j++){
				if(matrix[i-1][j] == matrix[i][j-1] &&
						matrix[i-1][j] == matrix[i][j+1] &&
						matrix[i-1][j] == matrix[i+1][j]){
					int crossLenTemp = check(i, j, matrix);
					if(crossLenTemp>crossLen){
						crossLen = crossLenTemp;
						y = i;
						x = j;
					}
				}
			}
		}
		System.out.println(crossLen + " " + (y+1) + " " + (x+1));
	}
}
