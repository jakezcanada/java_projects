package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Unamed1 {
	private static Set<Integer> lowest = new HashSet<Integer>();
	public static void find(int row, int col, int[][] board, Set<Integer> colors) {
		boolean changed = false;
		if(!colors.contains(board[row][col])) {
			colors.add(board[row][col]);
			changed = true;
		}
		if(row == board.length-1 && col == board[0].length-1) {
			if(colors.size() < lowest.size()) {
				lowest = new HashSet<Integer>(colors);
			}
		}
		if(row < board.length-1) {
			find(row+1, col, board, colors);
		}
		if(col < board[0].length-1) {
			find(row, col+1, board, colors);
		}
		if(changed) {
			colors.remove(board[row][col]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int M = 3;
		int N = 3;
		int[][] board = new int[M][N];
		for(int i = 0; i < M; i++) {
			board[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		for(int i = 0; i < 18; i++) {
			lowest.add(i);
		}
		find(0, 0, board, new HashSet<Integer>());
		for(int n : lowest) {
			System.out.println(n);
		}
	}
}
