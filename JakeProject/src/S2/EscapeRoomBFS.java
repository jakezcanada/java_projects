package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EscapeRoomBFS {
	
	public static Set<String> beenHereBefore = new HashSet<String>();
	
	public static boolean escapable(int[][] room, int x, int y) {
		return false;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int columns = Integer.parseInt(br.readLine());
		int[][] room = new int[rows][columns];
		for(int i = 0; i<rows; i++) {
			String[] temp = br.readLine().split(" ");
			int[] temp2 = new int[columns];
			for(int j = 0; j<temp.length; j++) {
				room[i][j] = Integer.parseInt(temp[j]);
			}
		}
		if(escapable(room, rows, columns)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
