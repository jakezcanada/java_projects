package J5;
import java.util.Arrays;
import java.util.Scanner;

public class PieDay {
	public static int[][][] visited;
	public static int pi(int n, int k, int min){
		if(visited[n][k][min] == 0){
			if(n==k){
				visited[n][k][min] = 1;
			}else if(k==1){
				visited[n][k][min] = 1;
			}else{
				int t = 0;
				for(int i = min; i<(n/k)+1; i++){
					t = t + pi(n-i, k-1, i);
				}
				visited[n][k][min] = t;
			}
		}	
		return visited[n][k][min];
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 	
		int n = sc.nextInt();
		int k = sc.nextInt();
		visited= new int[n+1][k+1][n+1];
	    for (int[][] square : visited) {
	        for (int[] line : square) {
	            Arrays.fill(line, 0);
	        }
	    }
	    System.out.println(pi(n,k,1));
	}

}
