package Jeff;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//https://dmoj.ca/problem/dwite12c5p5

public class PatternLock {
	
	public static int bfs(boolean[][] map, int row, int col, int stepsLeft) {
		if(stepsLeft == 0) {
			return 1;
		}
		int sum = 0;
		return sum;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		Map<Integer, List<String>> adjList = new HashMap<Integer, List<String>>();
		while(sc.hasNextLine()){ 
			int in1 = sc.nextInt();
			bfs(new boolean[3][3], 0, 0, in1);
		}
	}
}
