package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MaximumSum {
	public static Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
	public static int dfs(int[] arr, int index, int curSum) {
		if(memo.containsKey(index)) return memo.get(index);
		if(index >= arr.length) return curSum;
		curSum += arr[index];
		int a = dfs(arr, index+2, curSum);
		int b = dfs(arr, index+3, curSum);
		memo.put(index, (a>b) ? a : b);
		return (a>b) ? a : b;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int a = dfs(arr, 0, 0);
		int b = dfs(arr, 1, 0);
		System.out.println(((a>b) ? a : b));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N];
        dp[0] = Integer.parseInt(br.readLine());
        dp[1] = Integer.parseInt(br.readLine());
        dp[1] = Math.max(dp[1],dp[0]);
        for(int i = 2; i < N; i++){
            int m = Integer.parseInt(br.readLine());
            dp[i] = Math.max(dp[i-1],dp[i-2]+m);
        }
        System.out.println(dp[N-1]);
	}
}
