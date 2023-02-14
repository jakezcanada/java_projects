import java.util.Scanner;

public class ChangeChars {
	static char[][] chArray;
	public static void change(int x, int y, char c){
		
	}
	public static void reverse(int x){
		int len = chArray[x].length;
		for(int i = 0, j=len-1; i<j; i++, j--){
			char temp = chArray[x][i];
			chArray[x][j]=temp;
		}
	}
	public static void changeDiagonal(char c){
		
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		chArray = new char[n][n];
	}
}
