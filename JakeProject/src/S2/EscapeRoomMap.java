package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class EscapeRoomMap {
	
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
			room[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		int target = room[0][0];
		Map<Integer, Set<Integer>> roomMap = new HashMap<Integer, Set<Integer>>();
		for(int i = 1; i<=room.length; i++) {
			for(int j = 1; j<=room[0].length; j++) {
				if(!roomMap.containsKey(i*j)) {
					
				}
			}
		}
		if(escapable(room, rows, columns)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
