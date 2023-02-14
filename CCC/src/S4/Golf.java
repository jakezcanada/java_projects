package S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Golf {
	public static int findCombo(int dist, List<Integer> clubs, int index, int clubsUsed){
		if(dist == 0) return clubsUsed;
		for(int i = index; i < clubs.size(); i++) {
			if(dist - clubs.get(i) > -1) {
				int sol = findCombo(dist - clubs.get(i), clubs, i, clubsUsed+1);
				if(sol > 0) return sol;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int distance = Integer.parseInt(br.readLine());
		int numOfClubs = Integer.parseInt(br.readLine());
		List<Integer> clubs = new ArrayList<Integer>();
		for(int i = 0; i < numOfClubs; i++) {
			clubs.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(clubs);
		Collections.reverse(clubs);
		int strokes = findCombo(distance, clubs, 0, 0);
		if(strokes > 0) {
			System.out.println("Roberta wins in " + strokes + " strokes.");
		}else {
			System.out.println("Roberta acknowledges defeat.");
		}
	}
}

