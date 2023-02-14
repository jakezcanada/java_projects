package J1;
import java.util.Scanner;

public class Trident {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int spaces = sc.nextInt();
		int handle = sc.nextInt();
		int base = spaces * 2 + 3;
		String space = "";
		for(int s = 0; s<spaces; s++) {	
			space += " ";
		}
		for(int h = 0; h<height; h++) {
			for(int t = 0; t<3; t++) {
				System.out.print("*");
				if(t == 2) {
					System.out.println();
				}else {
					System.out.print(space);
				}
			}
		}
		for(int i = 0; i<base; i++) {
			System.out.print("*");
		}
		System.out.println();
		String handleSpace = "";
		for(int s = 0; s<=spaces; s++) {	
			handleSpace += " ";
		}
		for(int l = 0; l<handle; l++) {
			System.out.println(handleSpace + "*");
		}
	}
}
