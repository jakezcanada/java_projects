package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EscapeRoom {
	
	public static Set<String> beenHereBefore = new HashSet<String>();
	
	public static boolean escapable(int[][] room, int x, int y) {
		if(x==1 && y==1) {
			return true;
		}
		beenHereBefore.add(x+" "+y);
		for(int i = 0; i<room.length; i++) {
			for(int j = 0; j<room[0].length; j++) {
				if(room[i][j] == x*y && !beenHereBefore.contains((i+1) + " " + (j+1))) {
					if(escapable(room, i+1, j+1)) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int columns = Integer.parseInt(br.readLine());
		int[][] room = new int[rows][columns];
		for(int i = 0; i<rows; i++) {
//			String[] temp = br.readLine().split(" ");
//			int[] temp2 = new int[columns];
//			for(int j = 0; j<temp.length; j++) {
//				room[i][j] = Integer.parseInt(temp[j]);
//			}
			room[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		if(escapable(room, rows, columns)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
