import java.util.Scanner;

public class Spiral {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int small = sc.nextInt();
		int big = sc.nextInt();
		if (small == big) {
			System.out.println(small);
		} else {
			int[][] board = new int[11][11];
			for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 11; j++) {
					board[i][j] = 0;
				}
			}
			int direction = 1;// 1 = down; 2 = right; 3 = up; 4 = left;
			int col = 5;
			int row = 5;
			board[row][col] = small;
			row++;
			small++;
			boolean toggle = false;
			while (!toggle) {
				board[row][col] = small;
				small = small + 1;
				if (direction == 1) {
					if (board[row][col + 1] == 0) {
						direction = 2;
						small--;
					} else {
						row++;
					}
				} else if (direction == 2) {
					if (board[row - 1][col] == 0) {
						direction = 3;
						small--;
					} else {
						col++;
					}
				} else if (direction == 3) {
					if (board[row][col - 1] == 0) {
						direction = 4;
						small--;
					} else {
						row--;
					}
				} else {// if (direction == 4) {
					if (board[row + 1][col] == 0) {
						direction = 1;
						small--;
					} else {
						col--;
					}
				}
				if (small == big + 1) {
					toggle = true;
				}
			}
			for (int i = 0; i < 11; i++) {
				for (int j = 0; j < 11; j++) {
					if (board[i][j] == 0) {
						// 1 = down; 2 = right; 3 = up; 4 = left;
						if (i != 0 && i != 10 && j != 0 && j != 10) {
							if (direction == 1) {
								if (board[i][j + 1] != 0) {
									System.out.print("   ");
									continue;
								} else {
									System.out.print(" ");
									continue;
								}
							} else if (direction == 2) {
								if (board[i - 1][j] != 0) {
									System.out.print("   ");
									continue;
								} else {
									continue;
								}
							} else if (direction == 3) {
								if (board[i][j - 1] != 0) {
									System.out.print(" ");
									continue;
								} else {
									continue;
								}
							} else { // if(direction == 4){
								if (board[i + 1][j] != 0) {
									System.out.print("   ");
									continue;
								} else {
									System.out.print("");
									continue;
								}
							}
						} else {
							System.out.print("");
							continue;
						}
					}
					if (board[i][j] == -1) {
						System.out.print("");
						continue;
					}
					if (board[i][j] < 10)
						System.out.print(" " + board[i][j] + " ");
					else
						System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
