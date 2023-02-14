package J2;
import java.util.*;

public class VoteCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrSize = 6;
		String str = "ABBABA";
		List<String> votes = new ArrayList<String>(Arrays.asList(str.split("")));
		int numOfA = 0;
		int numOfB = 0;
		while (!votes.isEmpty()) {
			if (votes.get(0).equals("A")) {
				numOfA++;
			} else {
				numOfB++;
			}
			votes.remove(0);
		}
		if(numOfA == numOfB){
			System.out.println("Tie");
		}else if(numOfA > numOfB){
			System.out.println("A");
		}else{
			System.out.println("B");
		}
	}

}
