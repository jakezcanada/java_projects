package J2;
import java.util.Scanner;

public class MagicSquares {
	public static void main(String args[]){
		int[][] num = new int[4][4];
		Scanner sc = new Scanner(System.in);
		int org = 0;
		for(int row = 0; row<4; row = row+1){
			int sum = 0;
			for(int col = 0; col<4; col = col+1){
				num[row][col] = sc.nextInt();
				sum = sum + num[row][col];
			}
			if(row==0 ){
				org = sum;
			}else{
				if(sum != org){
					System.out.println("not magic");
					return;
				}
			}
		}
		
		for(int col=0; col<4; col = col+1){
			int sum = 0;
			for(int row = 0; row<4; row = row+1){
				sum = sum + num[row][col];
			}
			if(sum != org){
				System.out.println("not magic");
				return;	
			}
		}
		System.out.println("magic");
		
	}
}
