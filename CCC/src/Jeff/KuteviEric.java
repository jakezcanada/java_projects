package Jeff;

//Let dp[i] = true if the angle can be made, otherwise false
//dp[0] = true is the base case
//now if we have angles x and y such that dp[x] = true and we can measure y, then dp[(x+y)%360] = true and dp[(x-y)%360] = true
//However, we may need to add or subtract y more than one time
//For each y, we need to get at most, the first 360 multiples
//Since the number of angles is very small, we can do this


import java.util.*;
public class KuteviEric {  
	public static void main(String args[]) { 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		boolean[] possible = new boolean[361];
		possible[0] = true;
		for (int i = 0; i < N; i++) {
			int X = sc.nextInt();
			for (int k = 1; k <= 360; k++) {
				for (int j = 0; j <= 360; j++) {
					if (possible[((j-X*k)%360+360)%360]||possible[(j+X*k)%360]) possible[j] = true;
				}
			}
 
		}
		for (int i = 0; i < K; i++) {
			int X = sc.nextInt();
			System.out.println(possible[X]?"YES":"NO");
		}
	} 
}
