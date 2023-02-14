package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FloorPlan {
	
	public static boolean check(int x, int y, String[][] map, Set<String> coords){
		if(x >= map.length || x < 0){
			return false;
		}
		if(y >= map[0].length || y < 0){
			return false;
		}
		if(map[x][y].equals(".")){
			map[x][y] = "I";
			coords.add(x + " " + y);
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int flooring = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		String[][] map = new String[r][c];
		for(int i = 0; i<r; i++){
			map[i] = br.readLine().split("");
		}
		boolean roomChecked = false;
		List<Integer> roomAreas = new ArrayList<Integer>();
		for(int i = 0; i<r; i++){
			for(int j = 0; j<c; j++){
				if(map[i][j].equals(".")){
//					map[i][j] = "I";
					int roomArea = 0;
					Set<String> coords = new HashSet<String>();
					coords.add(i + " " + j);
					while(coords.size() != 0){
						String[] coord = new String[2];
						for(String xy : coords){
							coord = xy.split(" ");
							break;
						}
						int x = Integer.parseInt(coord[0]);
						int y = Integer.parseInt(coord[1]);
						
						//check cardinal directions
						if(check(x+1, y, map, coords)){
							roomArea++;
						}
						if(check(x-1, y, map, coords)){
							roomArea++;
						}
						if(check(x, y+1, map, coords)){
							roomArea++;
						}
						if(check(x, y-1, map, coords)){
							roomArea++;
						}
						coords.remove(x+" "+y);
					}
					roomAreas.add(roomArea);
				}
			}
		}
		Collections.sort(roomAreas);
		int totalRooms = 0;
		for(int i = roomAreas.size()-1; i>-1; i--){
			if(flooring - roomAreas.get(i) >= 0){
				flooring -= roomAreas.get(i);
				totalRooms += 1;
			}else{
				break;
			}
		}
		String s = (totalRooms == 1) ? "" : "s";
		System.out.println(totalRooms + " room" + s + ", " + flooring + " square metre(s) left over");
	}
}
