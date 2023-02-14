package J2;
import java.util.Scanner;

public class ModInverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int m = sc.nextInt();
		
		for(int n = 1; n<m; n=n+1){
			if((x*n)%m==1){
				System.out.println(n);
				return;
			}
		}
		System.out.print("No such integer exists.");
	}
}
