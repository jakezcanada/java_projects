
import java.util.Scanner;

public class Main {
	public static boolean[][] v;
	public static int calc(int r, int c, int[][] arr) {
		if(v[r][c]) return 0;
		v[r][c] = true;
		int sum = 0;
		//right
		if(c < arr[0].length - 1 ? arr[r][c+1] == 1 : false) {
			sum += calc(r, c+1, arr);
		}else {
			sum += 1;
		}
		//down and up
		if(r == 0 && arr[r+1][c] == 1 && c % 2 == 0) {
			sum += calc(r+1, c, arr);
		}else if(r == 1 && arr[r-1][c] == 1 && c % 2 == 0) {
			sum += calc(r-1, c, arr);
		}else{
			sum += 1;
		}
		//left
		if(c > 0 ? arr[r][c-1] == 1 : false) {
			sum += calc(r, c-1, arr);
		}else {
			sum += 1;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[][] arr = new int[2][in];
		v = new boolean[2][in];
		for(int i = 0; i < in; i++) {
			arr[0][i] = sc.nextInt();
		}
		for(int i = 0; i < in; i++) {
			arr[1][i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < in; j++) {
				if(arr[i][j] == 1) sum += calc(i, j, arr);
			}
		}
		System.out.println(sum);
	}
}
