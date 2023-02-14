package J3;
import java.util.*;

public class DoubleDice {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int antoniaScore = 100;
		int davidScore = 100;
		int numOfRounds = sc.nextInt();
		for(int i = 0; i<numOfRounds; i++){
			int antoniaRoll = sc.nextInt();
			int davidRoll = sc.nextInt();
			if(antoniaRoll > davidRoll){
				davidScore = davidScore - antoniaRoll;
			}else if(antoniaRoll < davidRoll){
				antoniaScore = antoniaScore - davidRoll;
			}
		}
		System.out.println(antoniaScore);
		System.out.println(davidScore);
	}
}
