import java.util.*;

public class ChanceOfWinning {
	public static int WinChecker(int teamNumber, List<Integer> roundResults){
		int b = 1;
		int num1 = roundResults.get(0);
		int num2 = roundResults.get(1);
		int num3 = roundResults.get(2);
		int num4 = roundResults.get(3);
		if(teamNumber == num1){
			if(num3 > num4){
				b = 1;
			}else if(num3==num4){
				b = 2;
			}else{
				b = 3;
			}
		}else if(teamNumber == num2){
			if(num3 < num4){
				b = 1;
			}else if(num3 == num4){
				b = 2;
			}else{
				b = 3;
			}
		}
		roundResults.remove(num1);
		roundResults.remove(num2);
		roundResults.remove(num3);
		roundResults.remove(num4);
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int votedTeam = 3;//sc.nextInt();
		int gamesPlayed = 3;//sc.nextInt();
		int teamPoints = 0;
		int[] scores = new int[3];
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> mainList = new ArrayList<Integer>();
		/*for(int i = 0; i<4*gamesPlayed; i++){
			int a = sc.nextInt();
			myList.add(a);
			mainList.add(a);
		}*/
			myList.add(1);
			myList.add(3);
			myList.add(7);
			myList.add(5);
			myList.add(3);
			myList.add(4);
			myList.add(0);
			myList.add(8);
			myList.add(2);
			myList.add(4);
			myList.add(2);
			myList.add(2);
		for(int i = 1; i<=4;i++){
			while(!myList.isEmpty()){
				int a = WinChecker(i,myList);
				if( a==1){
					teamPoints = teamPoints+3;
				}else if(a==2){
					teamPoints++;
				}
			}
			scores[i] = teamPoints;
			myList = mainList;
		}
		int team = scores[votedTeam-1];
	}

}
