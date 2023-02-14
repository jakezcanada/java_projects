package S1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class SurmisingASprintersSpeed {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Double, Double> treMap = new TreeMap<Double, Double>();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			String[] in = br.readLine().split(" ");
			treMap.put((double) Integer.parseInt(in[0]), (double) Integer.parseInt(in[1]));
		}
		double prevTime = 0;
		double prevDist = 0;
		double largestAvg = 0;
		for(Map.Entry<Double, Double> entry : treMap.entrySet()) {
			if(prevTime == 0 && prevDist == 0 && largestAvg == 0) {
				prevTime = entry.getKey();
				prevDist = entry.getValue();
			}else {
				double avg = Math.abs(entry.getValue() - prevDist) / Math.abs(entry.getKey() - prevTime);
				if(avg > largestAvg) {
					largestAvg = avg;
				}
				prevTime = entry.getKey();
				prevDist = entry.getValue();
			}
		}
		System.out.println(largestAvg);
		
	}

}
