package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;



public class TopYodeller2 {

	static class Yodeller {
		int id;
		int worstRank = -1;
		int score;
		
		public Yodeller(int id, int score) {
			this.id = id;
			this.score = score;
		}
		
		public int getId() {
			return id;
		}

		public int getScore() {
			return score;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setScore(int score) {
			this.score += score;
		}
		
		public int getWorstRank() {
			return worstRank;
		}

		public void setWorstRank(int newRank) {
			if(newRank>this.worstRank) {
				this.worstRank = newRank;
			}
		}

		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		List<Yodeller> totalScores = new ArrayList<Yodeller>();
		for(int i = 0; i<in[1]; i++) {
			//input
			int[] round = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int k = 0; k<in[0]; k++) {
				//add scores
				if(i == 0) {
					Yodeller test = new Yodeller(k+1, round[k]);
					totalScores.add(test);
				}else {
					int t = k+1;
					totalScores.stream().filter((yodeller) -> ((t) == yodeller.getId())).findAny().orElse(null).setScore(round[k]);
				}
			}
			Collections.sort(totalScores, new Comparator<Yodeller>() {
				@Override
				public int compare(Yodeller arg0, Yodeller arg1) {
					// TODO Auto-generated method stub
					return arg1.getScore()-arg0.getScore();
				}
			});
			
			//get round ranking
			int lastNumber = -10000;
			int lost = 0;
			int rank = 0;
			//get round ranking
			for(Yodeller n : totalScores) {
				if(lastNumber == n.getScore()) {
					rank--;
					lost++;
				}else {
					rank += lost;
					lost = 0;
				}
				rank++;
				lastNumber = n.getScore();
				n.setWorstRank(rank);
			}
		}
		
		int bestScore = totalScores.get(0).getScore();
		
		Collections.sort(totalScores, new Comparator<Yodeller>() {
			@Override
			public int compare(Yodeller arg0, Yodeller arg1) {
				// TODO Auto-generated method stub
				return arg0.getId()-arg1.getId();
			}
		});

		for(int i = 0; i<totalScores.size(); i++) {
			int score = totalScores.get(i).getScore();
			if(bestScore == score) {
				int yodeller = totalScores.get(i).getId();
				int rank = totalScores.get(i).getWorstRank();
				System.out.println("Yodeller "+yodeller+" is the TopYodeller: score "+score+", worst rank "+rank);
			}
		}
	}

}


