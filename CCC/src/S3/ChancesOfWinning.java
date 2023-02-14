package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ChancesOfWinning {
	
	public static Set<String> v = new HashSet<String>();
	
	public static int favWon(Set<String> matchesLeft, List<Integer> scores, int favTeam, int matchesWon) {
		if(matchesLeft.size() == 0) {
			if(v.contains((scores.get(0) + " " + scores. get(1) + " " + scores.get(2) + " " +  scores.get(3)))) {
				return matchesWon;
			}
			int favTeamScore = scores.get(favTeam);
			for(int i = 0; i < scores.size(); i++) {
				if(i!=favTeam) {
					if(favTeamScore<=scores.get(i)) {
						return matchesWon;
					}
				}
			}
//			for (int i = 0; i < scores.size(); i++) {
//				System.out.println((i+1) + ": " + scores.get(i));
//			}
			v.add((scores.get(0) + " " + scores. get(1) + " " + scores.get(2) + " " +  scores.get(3)));
			return matchesWon+1;
		}
		Set<String> matchesLeftCopy = new HashSet<String>(matchesLeft);
		for(String match : matchesLeftCopy) {
			matchesLeft.remove(match);
			int t1 = Integer.parseInt(match.split(" ")[0]);
			int t2 = Integer.parseInt(match.split(" ")[1]);	
			//in case of a tie
			scores.set(t1-1, scores.get(t1-1)+1);
			scores.set(t2-1, scores.get(t2-1)+1);
			matchesWon = favWon(matchesLeft, scores, favTeam, matchesWon);
			scores.set(t1-1, scores.get(t1-1)-1);
			scores.set(t2-1, scores.get(t2-1)-1);
			//in case of a t1 win
			scores.set(t1-1, scores.get(t1-1)+3);
			matchesWon = favWon(matchesLeft, scores, favTeam, matchesWon);
			scores.set(t1-1, scores.get(t1-1)-3);
			//in case of a t2 win
			scores.set(t2-1, scores.get(t2-1)+3);
			matchesWon = favWon(matchesLeft, scores, favTeam, matchesWon);
			scores.set(t2-1, scores.get(t2-1)-3);
			matchesLeft.add(match);
		}
		return matchesWon;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int favTeam = Integer.parseInt(br.readLine())-1; // 0 index based
		int gamesPlayed = Integer.parseInt(br.readLine());
		List<Integer> scores = new ArrayList<Integer>();
		scores.add(0);
		scores.add(0);
		scores.add(0);
		scores.add(0);
		Set<String> matches = new HashSet<String>();
		for(int i = 1; i < 5; i++) {
			for(int j = i+1; j < 5; j++) {
				matches.add(i + " " + j);
			}
		}
		for(int i = 0; i < gamesPlayed; i++) {
			int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			matches.remove(in[0] + " " + in[1]);
			int ts1 = in[2];
			int ts2 = in[3];
			if(ts1==ts2) {
				scores.set(in[0]-1, scores.get(in[0]-1)+1);
				scores.set(in[1]-1, scores.get(in[1]-1)+1);
			}else if(ts1>ts2) {
				scores.set(in[0]-1, scores.get(in[0]-1)+3);
			}else {
				scores.set(in[1]-1, scores.get(in[1]-1)+3);
			}
		}
		System.out.println(favWon(matches, scores, favTeam, 0));
	}
}
