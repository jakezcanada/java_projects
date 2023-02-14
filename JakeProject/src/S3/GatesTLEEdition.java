package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GatesTLEEdition {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int g = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		List<Integer> planes = new ArrayList<Integer>();
		for (int i = 0; i < p; i++) {
			planes.add(Integer.parseInt(br.readLine())-1);
		}
		int lowest = 0;
		List<Boolean> gates =new ArrayList<Boolean>(Arrays.asList(new Boolean[g]));
		Collections.fill(gates, false);
		int total = 0;

		for (int i = 0; i < g; i++) {
			// for every plane
			int plane = planes.get(i);
			boolean found = false;
			for (int j = plane; j > -1; j--) {
				// find next greatest spot
				if(j<gates.size() && !gates.get(j)){
					found = true;
					gates.set(j, true);
					total++;
					break;
				}
			}
			if(!found){
				break;
			}
		}
		System.out.println(total);
	}
}
