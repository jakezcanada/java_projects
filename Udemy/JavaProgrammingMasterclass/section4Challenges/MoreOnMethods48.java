package section4Challenges;

public class MoreOnMethods48 {
	
	public static void displayHighScorePosition(String playerName, int position) {
		System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
	}
	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore >= 1000) {
			return 1;
		}else if(playerScore >= 500) {
			return 2;
		}else if(playerScore >= 100) {
			return 3;
		}
		
		return 4;

	}

	public static void main(String[] args) {
		int highScorePosition1 = calculateHighScorePosition(1500);
		displayHighScorePosition("Tim", highScorePosition1);
		int highScorePosition2 = calculateHighScorePosition(1500);
		displayHighScorePosition("Bob", highScorePosition2);
		int highScorePosition3 = calculateHighScorePosition(1500);
		displayHighScorePosition("Percy", highScorePosition3);
		int highScorePosition4 = calculateHighScorePosition(1500);
		displayHighScorePosition("Gilbert", highScorePosition4);
	}

}
