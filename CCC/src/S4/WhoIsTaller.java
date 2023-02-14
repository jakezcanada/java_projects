package S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WhoIsTaller {
	//public static Set<Integer> memo = new HashSet<Integer>();
	
	public static boolean dfs(int node, Map<Integer, List<Integer>> adjList, int target, Set<Integer> visited){
		if(visited.contains(node)) return false;
		if(node == target) return true;
		if(adjList.get(node).size() == 0){
			visited.add(node);
			return false;
		}
		for(int n : adjList.get(node)){
			if(dfs(n, adjList, target, visited)){
				return true;
			}
		}
		visited.add(node);
		return false;
	}
//	public static boolean bfs(Set<Integer> nodes, Map<Integer, List<Integer>> adjList, int target){
//		if(nodes.contains(target)){
//			return true;
//		}
//		if(nodes.size() == 0){
//			return false;
//		}
//		Set<Integer> newNodes = new HashSet<Integer>();
//		for(int node : nodes){
//			newNodes.addAll(adjList.get(node));
//		}
//		
//		return bfs(newNodes, adjList, target);
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
		for(int i = 1; i <= in[0]; i++){
			adjList.put(i, new ArrayList<Integer>());
		}
		for(int i = 0; i < in[1]; i++){
			int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			adjList.get(temp[0]).add(temp[1]);
		}
		int[] in2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//		Set<Integer> nodes1 = new HashSet<Integer>();
//		nodes1.add(in2[0]);
//		Set<Integer> nodes2 = new HashSet<Integer>();
//		nodes2.add(in2[1]);
//		if(bfs(nodes1, adjList, in2[1])){
//			System.out.println("yes");
//		}else if(bfs(nodes2, adjList, in2[0])){
//			System.out.println("no");
//		}else{
//			System.out.println("unknown");
//		}
		if(dfs(in2[0], adjList, in2[1], new HashSet<Integer>())){
			System.out.println("yes");
		}else if(dfs(in2[1], adjList, in2[0], new HashSet<Integer>())){
			System.out.println("no");
		}else{
			System.out.println("unknown");
		}
	}
}
