package J1;
import java.util.*;

public class RockPaperScissors {
	private static int WinCheck(List<String> p1, List<String> p2){
		String str1 = p1.get(0);
		String str2 = p2.get(0);
		p1.remove(0);
		p2.remove(0);
		if(str1.equals(str2)){
			return 0;
		}else if((str1.equals("rock") && str2.equals("scissors")) || (str1.equals("paper") && str2.equals("rock")) || (str1.equals("scissors") && str2.equals("paper"))){
			return 1;
		}else if((str1.equals("rock") && str2.equals("paper")) || (str1.equals("scissors") && str2.equals("rock")) || (str1.equals("paper") && str2.equals("scissors"))){
			return -1;
		}
		return 0;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int looper = sc.nextInt();
		int aliceScore = 0;
		int bobScore = 0;
		List<String> Alice = new ArrayList<String>();
		List<String> Bob = new ArrayList<String>();
		for(int i = 0; i<looper; i++){
			String input = sc.next();
			Alice.add(input);
		}
		for(int i = 0; i<looper; i++){
			String input = sc.next();
			Bob.add(input);
		}
		for(int i = 0; i<looper; i++){
			int a = WinCheck(Alice,Bob);
			if(a == 1){
				aliceScore++;
			}else if(a == -1){
				bobScore++;
			}
		}
		System.out.println(aliceScore + " " + bobScore);
	}
}
