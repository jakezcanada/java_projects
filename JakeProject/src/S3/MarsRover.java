package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MarsRover {
	
	public static int turnRight(int dir) {
		return dir+1 > 4 ? 1 : dir+1;
	}
	
	public static int turnLeft(int dir) {
		return dir-1 < 1 ? 4 : dir-1;
	}
	
	public static int turn(String dir, int curDir) {
		int times = Integer.parseInt(dir.split(" ")[1]);
		dir = dir.split(" ")[0];
		if(dir.equals("r")) {
			for (int i = 0; i < times; i++) {
				curDir = turnRight(curDir);
				System.out.println(2);
			}
			return curDir;
		}
		for (int i = 0; i < times; i++) {
			curDir = turnLeft(curDir);
			System.out.println(3);
		}
		return curDir;
	}
	
	public static String findBestTurn(int curDir, int wantDir) {
		if(curDir == wantDir) {
			return "l 0";
		}
		if(turnRight(turnRight(curDir)) == wantDir) {
			return "r 2";
		}
		if(turnRight(curDir) == wantDir) {
			return "r 1";
		}
		return "l 1";
	}
	
	// North is 1, East is 2, South is 3, West is 4
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int excursions = Integer.parseInt(br.readLine());
		int dir = 1;
		for (int i = 0; i < excursions; i++) {
			int x = 0;
			int y = 0;
			int in = Integer.parseInt(br.readLine());
			while (in != 0) {
				if(in == 1) {
					if(dir == 1) {
						y += Integer.parseInt(br.readLine());
					}else if(dir == 2) {
						x += Integer.parseInt(br.readLine());
					}else if(dir == 3) {
						y -= Integer.parseInt(br.readLine());
					}else if(dir == 4) {
						x -= Integer.parseInt(br.readLine());
					}
				}else if(in == 2) {
					dir = turnRight(dir);
				}else if(in == 3) {
					dir = turnLeft(dir);
				}
				in = Integer.parseInt(br.readLine());
			}
			// North is 1, East is 2, South is 3, West is 4
			int totalDist = Math.abs(x) + Math.abs(y);
			int dir1 = (x<0) ? 2 : (x>0) ? 4 : -1;
			int dir2 = (y<0) ? 1 : (y>0) ? 3 : -1;
			System.out.println("Distance is " + totalDist);
			if(dir1 > 0 || dir2 > 0) {
				String turn1 = findBestTurn(dir, dir1);
				String turn2 = findBestTurn(dir, dir2);
				int a = Integer.parseInt(turn1.split(" ")[1]);
				int b = Integer.parseInt(turn2.split(" ")[1]);
				if(a > b) {
					dir = turn(turn2, dir);
					System.out.println(1);
					System.out.println(Math.abs(y));
					turn1 = findBestTurn(dir, dir1);
					dir = turn(turn1, dir);
					System.out.println(1);
					System.out.print(Math.abs(x));
				}else {
					dir = turn(turn1, dir);
					System.out.println(1);
					System.out.println(Math.abs(x));
					turn2 = findBestTurn(dir, dir2);
					dir = turn(turn2, dir);
					System.out.println(1);
					System.out.print(Math.abs(y));
				}
			}
			if(i != excursions-1)
				System.out.println();
		}
		// pain
	}
}
