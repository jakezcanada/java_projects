package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class TudorAndThePusheens {
	
//	public static int bfs(int depth, Set<Integer> nodes, Map<Integer, List<Integer>> adjList, Set<Integer> visited, int target) {
//		if(nodes.contains(target)) {
//			return depth;
//		}
//		Set<Integer> temp = new HashSet<Integer>();
//		for(int n : nodes) {
//			if(!visited.contains(n)) {
//				for(int n2 : adjList.get(n)) {
//					if(!visited.contains(n2)) {
//						temp.add(n2);
//						visited.add(n2);
//					}
//				}
//			}
//		}
//		depth++;
//		return bfs(depth, temp, adjList, visited, target);
//	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
		for(int i = 1; i <= in1[0]; i++) {
			adjList.put(i, new ArrayList<Integer>());
		}
		int connections = in1[1];
		for(int i = 0; i < in1[1]; i++) {
			int[] in2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			adjList.get(in2[0]).add(in2[1]);
			adjList.get(in2[1]).add(in2[0]);
		}
		int[] in3 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		Set<Integer> nodes = new HashSet<Integer>();
//		nodes.add(in3[0]);
		
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(in3[0]);
		boolean found = false;
		boolean[] visited = new boolean[in1[0]+1];
		Arrays.fill(visited, false);
		visited[in3[0]] = true;
		if(in3[0] == in3[1]) {
			System.out.println(0);
			return;
		}
		int sum = 0;
		while(!q.isEmpty()) {
			int size = q.size();
			sum++;
			for(int i = 0; i < size; i++) {
				int cur = q.poll();
				List<Integer> kids = adjList.get(cur);
				for(int kid : kids) {
					if(kid == in3[1]) {
						found = true;
						break;
					}
					if(!visited[kid]) {
						visited[kid] = true;
						q.add(kid);
					}
				}
				if(found) {
					break;
				}
			}
			if (found) {
				break;
			}
		}
		
		
		System.out.println(connections - sum);
	}
}
