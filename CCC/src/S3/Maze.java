package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Maze {
	public static boolean check(String[][] map, int row, int col) {
		if(row > -1 && row < map.length && col > -1 && col < map[0].length && !map[row][col].equals("*")) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int r = Integer.parseInt(br.readLine());
			int c = Integer.parseInt(br.readLine());
			String[][] map = new String[r][c];
			for(int j = 0; j < map.length; j++) {
				map[j] = br.readLine().split("");
			}
			if(map[r-1][c-1].equals("*")) {
				System.out.println("-1");
				continue;
			}
			Set<String> visited = new HashSet<String>();
			List<int[]> nextPositions = new ArrayList<int[]>();
			int[] base = {0, 0};
			nextPositions.add(base);
			int[] find = {r-1, c-1};
			int moves = 1;
			boolean found = false;
			while (nextPositions.size() > 0) {
				if(nextPositions.stream().anyMatch(a -> Arrays.equals(a, find))) {
					found = true;
					break;
				}
				List<int[]> nextPositionsClone = new ArrayList<int[]>();
				int size = nextPositions.size();
				for (int j = 0; j < size; j++)
					nextPositionsClone.add(nextPositions.remove(0));

				for(int[] pos : nextPositionsClone) {
					if(!visited.contains(pos[0] + " " + pos[1])) {
						visited.add(pos[0] + " " + pos[1]);
						//System.out.println(pos[0] + " " + pos[1]);
						switch (map[pos[0]][pos[1]]) {
						case "+":
							if(check(map, pos[0]-1, pos[1])) {
								int[] temp = {pos[0]-1, pos[1]};
								nextPositions.add(temp);
							}
							if(check(map, pos[0]+1, pos[1])) {
								int[] temp = {pos[0]+1, pos[1]};
								nextPositions.add(temp);
							}
							if(check(map, pos[0], pos[1]-1)) {
								int[] temp = {pos[0], pos[1]-1};
								nextPositions.add(temp);
							}
							if(check(map, pos[0], pos[1]+1)) {
								int[] temp = {pos[0], pos[1]+1};
								nextPositions.add(temp);
							}
							break;
						case "|":
							if(check(map, pos[0]+1, pos[1])) {
								int[] temp = {pos[0]+1, pos[1]};
								nextPositions.add(temp);
							}
							if(check(map, pos[0]-1, pos[1])) {
								int[] temp = {pos[0]-1, pos[1]};
								nextPositions.add(temp);
							}
							break;
						case "-":
							if(check(map, pos[0], pos[1]+1)) {
								int[] temp = {pos[0], pos[1]+1};
								nextPositions.add(temp);
							}
							if(check(map, pos[0], pos[1]-1)) {
								int[] temp = {pos[0], pos[1]-1};
								nextPositions.add(temp);
							}
						default:
							break;
						}
					}
				}
				//System.out.println("break");
				moves++;
			}
			if(!found) {
				System.out.println("-1");
			}else {
				System.out.println(moves);
			}
		}
	}
}
