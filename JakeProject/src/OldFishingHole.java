import java.util.*;

public class OldFishingHole {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int troutPoints = sc.nextInt();
		int pikePoints = sc.nextInt();
		int pickerelPoints = sc.nextInt();
		int totalPointsAllowed = sc.nextInt();
		int pointsAllowed = totalPointsAllowed;
		int counter = 0;
		boolean toggle1 = false;
		boolean toggle2 = false;
		boolean toggle3 = false;
		int numOfWays = 0;
		List<String> myList = new ArrayList<String>();
		if (troutPoints <= pointsAllowed) {
			for (int i = 0; i < pointsAllowed; i++) {
				if (troutPoints <= totalPointsAllowed) {
					totalPointsAllowed -= troutPoints;
					counter++;
					myList.add(counter + "xBrownxTrout|x0xNorthernxPike|x0xYellowxPickerel");
				} else {
					break;
				}
			}
			totalPointsAllowed = pointsAllowed;
			numOfWays += counter;
			counter = 0;
			toggle1 = true;
		}
		if(pikePoints <= pointsAllowed){
			for (int i = 0; i < pointsAllowed; i++) {
				if (pikePoints <= totalPointsAllowed) {
					totalPointsAllowed -= pikePoints;
					counter++;
					myList.add("0xBrownxTrout|x" + counter + "xNorthernxPike|x0xYellowxPickerel");
				} else {
					break;
				}
			}
			totalPointsAllowed = pointsAllowed;
			numOfWays += counter;
			counter = 0;
			toggle2 = true;
		}
		if(pickerelPoints <= pointsAllowed){
			for (int i = 0; i < pointsAllowed; i++) {
				if (pickerelPoints <= totalPointsAllowed) {
					totalPointsAllowed -= pickerelPoints;
					counter++;
					myList.add("0xBrownxTrout|x0xNorthernxPike| " + counter + "xYellowxPickerel");
				} else {
					break;
				}
			}
			totalPointsAllowed = pointsAllowed;
			numOfWays += counter;
			counter = 0;
			toggle2 = true;
		}
		String formattedStr = myList.toString().replace("[", "").replace("]", "").replace(",", "\n").replace("|", ",").replace(" ", "").replace("x", " ").trim();
		System.out.println(formattedStr);
		System.out.print("Number of ways to catch fish: " + numOfWays);
	}
}
