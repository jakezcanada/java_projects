package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Blindfold {
	
	static String[][] grid;
	static String[] m;
	
	public static void check(int x, int y){
		for(int d = 0; d<360; d+=90){
			boolean b = false;
			int dir = d;
			int cX = x;
			int cY = y;
			if(grid[cY][cX].equals("X")){
				b = true;
				break;
			}
			for (int i = 0; i < m.length; i++) {
				String str = m[i];
				switch(str){
				case "F":
					if(dir == 0){
						cY--;
					}else if(dir == 90){
						cX++;
					}else if(dir == 180){
						cY++;
					}else{
						cX--;
					}
					if(cY == 1){
						int asdjfl = 0;
					}
					if(cX >= grid[0].length || cY >= grid.length || cX < 0 || cY < 0){
						b = true;
						break;
					}else if(grid[cY][cX].equals("X")){
						b = true;
						break;
					}
					break;
				case "L":
					dir -= 90;
					dir = (dir < 0) ? 270 : dir;
					break;
				case "R":
					dir += 90;
					dir %= 360;
					break;
				}
				if(b){
					break;
				}
			}
			if(!b){
				grid[cY][cX] = "*";
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int r = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		grid = new String[r][c];
		for (int i = 0; i < r; i++) {
			grid[i] = br.readLine().split("");
		}
		m = new String[Integer.parseInt(br.readLine())];
		for (int i = 0; i < m.length; i++) {
			m[i] = br.readLine();
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				check(j, i);
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		
	}
}
