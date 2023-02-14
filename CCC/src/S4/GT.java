package S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GT {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Map<Integer, Integer> weight = new HashMap<Integer, Integer>();
		List<Integer> points = new ArrayList<Integer>();
		List<Integer> pointIn = new ArrayList<Integer>(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
				.boxed().collect(Collectors.toList()));
		for(int n : pointIn) {
			if(!weight.containsKey(n)) {
				weight.put(n, 0);
			}
			weight.put(n, weight.get(n)+1);
			if(!points.contains(n)) {
				points.add(n);
			}
		}
		Collections.sort(points);
		List<String> visited = new ArrayList<String>();
		if(in[1] == 3 && points.size() == 3) {
			System.out.println(weight.get(points.get(0)) * weight.get(points.get(1)) * weight.get(points.get(2)));
			return;
		}
		int sum = 0;
		for(int i = 0; i < points.size(); i++) {
			if(points.get(i) >= (in[1]%2==0? in[1]/2 : in[1]/2 + 1)) {
				break;
			}
			for(int j = i+1; j < points.size(); j++) {
				if(points.get(j) >= points.get(i) + (in[1]%2==0? in[1]/2 : in[1]/2 + 1)) {
					break;
				}
				for(int k = j+1; k < points.size(); k++) {
					if(points.get(k) >= points.get(j) + (in[1]%2==0? in[1]/2 : in[1]/2 + 1)) {
						break;
					}
					if(points.get(k) > points.get(i) + in[1]/2) {
						sum += weight.get(points.get(i)) * weight.get(points.get(j)) * weight.get(points.get(k));
					}
				}
			}
		}
		System.out.println(sum);
	}
}
