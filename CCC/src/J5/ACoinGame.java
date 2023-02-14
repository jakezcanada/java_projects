package J5;

import java.util.*;

public class ACoinGame {

	public static boolean findSolution(LinkedList<List<Integer>> board) {
		for(int i = 0; i<board.size(); i++) {
			
		}
		return false;
	}
	//failure
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		while(loop) {
			int coinCount = sc.nextInt();
			if(coinCount == 0) {
				break;
			}
			LinkedList<List<Integer>> board = new LinkedList< 	>();
			List<Integer> temp = new ArrayList<Integer>();
			for(int i = 0; i<coinCount; i++) {
				temp.add(i);
			}
			board.add(temp);
			int moves = 0;
			if(findSolution(board)) {
				System.out.println(moves);
			}else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}

}
