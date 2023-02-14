package J3;
import java.util.Scanner;

public class IconScaling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++){
			for(int j = 0; j <  num; j++){
				System.out.print("*");
			}
			for(int j = 0; j <  num; j++){
				System.out.print("x");
			}
			for(int j = 1; j <  num; j++){
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		
		
		for(int i = 0; i < num; i++){
			for(int j = 0; j <  num; j++){
				System.out.print(" ");
			}
			for(int j = 0; j <  num; j++){
				System.out.print("x");
			}
			for(int j = 1; j <  num; j++){
				System.out.print("x");
			}
			System.out.println("x");
		}
		
		
		
		for(int i = 0; i < num; i++){
			for(int j = 0; j <  num; j++){
				System.out.print("*");
			}
			for(int j = 0; j <  num; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <  num; j++){
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
}
