package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EscapeRoom2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int columns = Integer.parseInt(br.readLine());
		int[][] room = new int[rows][columns];
		for(int i = 0; i<rows; i++) {
			room[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		Map<Integer, Set<Integer>> roomMap = new HashMap<Integer, Set<Integer>>();
		int find = room[0][0];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if(!roomMap.containsKey(room[i][j])) {
					roomMap.put(room[i][j], new HashSet<Integer>());
				}
				roomMap.get(room[i][j]).add((i+1)*(j+1));
			}
		}
		//List<Integer> q = new ArrayList<>();
		Set<Integer> q = new HashSet<Integer>();
		//q.add(room[rows-1][columns-1]);
		q.add(rows*columns);
		while(q.size()>0) {
			int n = 0;
			Set<Integer> copy = new HashSet<Integer>(q);
			Iterator<Integer> it = copy.iterator();
			while(it.hasNext()) {
				n = it.next();
				if(roomMap.containsKey(n)) {
					q.addAll(roomMap.get(n)); // get the related
					roomMap.remove(n); // remove from map since visited
					if(q.contains(find)) {
						System.out.println("yes");
						return;
					}
				}
				q.remove(n);
			}
		}
		System.out.println("no");	
	}

}
