/*import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		boolean toggle = false;
		boolean validOrNot = false;
		int[][] board = new int[rows][cols];
		int numOfInputs = sc.nextInt();
		for(int row = 0; row<rows; row++){
			for(int col = 0; col<cols; col++){
				board[row][col] = 2;
			}
		}
		if(rows < 4 && cols < 4){
			validOrNot = true;
		}
		while(!toggle && numOfInputs != 0 && !validOrNot){
			int row = sc.nextInt()-1;
			int col = sc.nextInt()-1;
			int player = sc.nextInt();
			if(row != 0){
				if(board[row-1][col] == 2){
					validOrNot = true;
				}
			}
			if(row >= 3){
				if(){
					
				}
			}
			if(){
				
			}
			numOfInputs--;
		}
		if(validOrNot){
			System.out.println("INVALID U IDIOT");
		}else if(toggle){
			System.out.println("SOMEONE WON :D");
			
		}
		
	}

}
*/