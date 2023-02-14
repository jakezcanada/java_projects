package J3;

import java.util.Scanner;

public class QueensCantAttackMe {

	public static int[][] markCardinal(int[][] board, int x, int y){
		for(int i = 0; i < board.length; i++) {
			board[x][i] = 1;
			board[i][y] = 1;
		}
		return board;
	}
	
	public static int[][] markDiagonal(int[][] board, int x, int y){	
		int count = 0;
		for(int i = 1; i < board.length; i++) {
			if(x+i<board.length && y+i<board.length) {
				board[x+i][y+i] = 1;
			}else {
				count++;
			}
			if(x-i>-1 && y-i>-1) {
				board[x-i][y-i] = 1;
			}else {
				count++;
			}
			if(x+i<board.length && y-i>-1) {
				board[x+i][y-i] = 1;
			}else {
				count++;
			}
			if(x-i>-1 && y+i<board.length) {
				board[x-i][y+i] = 1;
			}else {
				count++;
			}
			if(count == 4) {
				break;
			}
			count = 0;
		}
		return board;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		int nOfQueens = sc.nextInt();
		// fill board with 0
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				board[i][j] = 0;
			}
		}
		// mark board
		for(int i = 0; i < nOfQueens; i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;
			markCardinal(board, x, y);
			markDiagonal(board, x, y);
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
