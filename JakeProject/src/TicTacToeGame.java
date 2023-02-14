import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean toggle = false;
		int[][] num = new int[3][3];
		for(int row = 0; row<3; row++){
			for(int col = 0; col<3; col++){
				num[row][col] = sc.nextInt();
			}
		}
		if(num[0][0] == num[0][1] && num[0][0] == num[0][2]){
			toggle = true;
		}else if(num[1][0] == num[1][1] && num[1][0] == num[1][2]){
			toggle = true;
		}else if(num[2][0] == num[2][1] && num[2][0] == num[2][2]){
			toggle = true;
		}else if(num[0][0] == num[1][0] && num[0][0] == num[2][0]){
			toggle = true;
		}else if(num[0][1] == num[1][1] && num[0][1] == num[2][1]){
			toggle = true;
		}else if(num[0][2] == num[1][2] && num[0][2] == num[2][2]){
			toggle = true;
		}else if(num[2][2] == num[1][1] && num[2][2] == num[0][0]){
			toggle = true;
		}else if(num[0][2] == num[1][1] && num[0][2] == num[2][0]){
			toggle = true;
		}
		if(toggle){
			System.out.println("yaaaasssss");
		}else{
			System.out.println("u suck at tic tac toe :/");
		}
	}

}
