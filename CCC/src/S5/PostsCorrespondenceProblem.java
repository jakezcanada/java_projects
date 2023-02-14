package S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PostsCorrespondenceProblem {
	public static String[] A;
	public static Map<String, Boolean> memo = new HashMap<String, Boolean>();
	public static String[] B;
	public static String answer = "";
	public static int limit;
	public static boolean dfs(String strA, String strB, int depth) {
		if(memo.containsValue(A)) return memo.get(A);
		if(memo.containsValue(B)) return memo.get(B);
		if(depth >= limit) return false;
		if(strA.equals(strB) && !strA.equals("")) {
			System.out.println(depth);
			return true;
		}
		if((strA.length() > strB.length()) ? !strA.substring(0, strB.length()).equals(strB) : !strB.substring(0, strA.length()).equals(strA)) {
			memo.put(strA, false);
			memo.put(strB, false);
			return false;
		}
		for(int i = 0; i < A.length; i++) {
			if(dfs(strA + A[i], strB + B[i], depth + 1)) {
				answer += i+1;
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		limit = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		A = new String[n];
		B = new String[n];
		for(int i = 0; i < n; i++) {
			A[i] = br.readLine();
		}
		for(int i = 0; i < n; i++) {
			B[i] = br.readLine();
		}
		if(dfs("", "", 0)) {
			for (int i = answer.length()-1; i > -1; i--) {
			    System.out.println(answer.charAt(i));
			}
		}else {
			System.out.println("No solution.");
		}
	}
}
