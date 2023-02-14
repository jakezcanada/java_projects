package S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Waterpark {
	private static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
	private static int dfs(int node, int goal, Map<Integer, List<Integer>> adjList){
		if(memo.containsKey(node)) return memo.get(node);
		if(node == goal) return 1;
		int sum = 0;
		for(int n : adjList.get(node)){
			sum += dfs(n, goal, adjList);
		}
		memo.put(node, sum);
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfNodes = Integer.parseInt(br.readLine());
		Map<Integer, List<Integer>> adjList = new HashMap<Integer, List<Integer>>();
		for(int i = 1; i <= numOfNodes; i++){
			adjList.put(i, new ArrayList<Integer>());
		}
		while(true){
			int[] temp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if(temp[0] == 0){
				break;
			}
			adjList.get(temp[0]).add(temp[1]);
		}
		System.out.println(dfs(1,numOfNodes,adjList));
	}
}
