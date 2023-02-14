package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//https://dmoj.ca/problem/acoinproblem
//Eric's Sol
//https://pastebin.com/z1uXKCNs
//The fourth question is similar to other coin problems, except there are queries that limit then number of coins to use
//We can let dp[i][j] represent the minimum number of coins needed to pay j dollars with the first i coins
//However, this array will take o(n * max(c)) space, which is too much
//To reduce the space, observe that the dp transition dp[i][j] only uses elements from the previous row (dp[i-1][?])
//So we can reduce the space to O(max(c))
//Since we need each row to calculate the different queries, we will sort the queries by l, and build the dp array

public class acoinproblem {
	
//	public static int bfs(List<Integer> coins, int targetTotal) {
//		if(coins.size()==0) {
//			return -1;
//		}
//		Set<Integer> visited = new HashSet<Integer>();
//		while(coins.size()!=0) {
//			List<Integer> copy = new ArrayList<Integer>(coins);
//			coins.clear();
////			for() {
////				
////			}
//		}
//	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] nv = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		List<Integer> coins = new ArrayList<Integer>(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
				.boxed().collect(Collectors.toList()));
		for (int i = 0; i < nv[1]; i++) {
			int[] dc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			List<Integer> subCoins = coins.subList(0, dc[1]-1);
			//System.out.println(bfs(subCoins, dc[0]));
		}
	}
}
