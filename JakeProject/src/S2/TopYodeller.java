package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class TopYodeller {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Map<Integer, Integer> worstRank = new HashMap<Integer, Integer>();
		List<Integer> totalScores = new ArrayList<Integer>();
		for(int i = 0; i<in[1]; i++) {
			//input
			int[] round = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			for(int k = 0; k<in[0]; k++) {
				//add scores
				if(i == 0) {
					totalScores.add(round[k]);
				}else {
					totalScores.set(k, totalScores.get(k) + round[k]);
				}
			}
			
			Map<Integer, Integer> roundRanking = new HashMap<Integer, Integer>();
			int lastNumber = -10000;
			int lost = 0;
			int rank = 0;
			int person = 0;
			
			List<Integer> totalScoresCopy = new ArrayList<Integer>(totalScores);
			
			List<Integer> totalScoresCopy2 = new ArrayList<Integer>(totalScores);
			
			//List<Integer> totalScoresCopy = new ArrayList<Integer>(totalScores);
			Collections.sort(totalScoresCopy, new Comparator<Integer>() {
				@Override
				public int compare(Integer arg0, Integer arg1) {
					// TODO Auto-generated method stub
					return arg1.intValue()-arg0.intValue();
				}
			});
			
			//get round ranking
			for(int n : totalScoresCopy) {
				if(lastNumber == n) {
					rank--;
					lost++;
				}else {
					rank += lost;
					lost = 0;
				}
				rank++;
				lastNumber = n;
				roundRanking.put(totalScoresCopy2.indexOf(n)+1,rank);
				totalScoresCopy2.set(totalScoresCopy2.indexOf(n), -10000);
			}
			//replace ranks
			for(int k = 1; k<=in[0]; k++) {
				if(worstRank.containsKey(k)) {
					if(roundRanking.get(k).intValue() > worstRank.get(k).intValue()) {
						worstRank.put(k, roundRanking.get(k));
					}
				} else {
					worstRank.put(k, roundRanking.get(k));
				}
			}
			if(worstRank.get(1) != 10) {
				System.out.println();
			}
		}
		
		List<Integer> totalScoresCopy = new ArrayList<Integer>(totalScores);
		
		//List<Integer> totalScoresCopy = new ArrayList<Integer>(totalScores);
		Collections.sort(totalScoresCopy, new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0.intValue()-arg1.intValue();
			}
		});
		int bestScore = totalScoresCopy.get(totalScoresCopy.size()-1);
		for(int i = 0; i<totalScores.size(); i++) {
			int score = totalScores.get(i);
			if(bestScore == score) {
				int yodeller = i+1;
				int rank = worstRank.get(yodeller);
				System.out.println("Yodeller "+yodeller+" is the TopYodeller: score "+score+", worst rank "+rank);
			}
		}

	}

}


