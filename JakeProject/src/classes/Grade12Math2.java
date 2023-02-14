package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Grade12Math2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in1 = br.readLine().split(" ");
		int N = Integer.parseInt(in1[0]);
		int Q = Integer.parseInt(in1[1]);
		List<Integer> cOpinions = new ArrayList<>(Arrays.asList(new Integer[N]));
		Collections.fill(cOpinions, 0);
		for (int i = 0; i < Q; i++) {
			String[] in = br.readLine().split(" ");
			int query = Integer.parseInt(in[0]);
			if(query == 1) {
				int x = Integer.parseInt(in[1]);
				cOpinions.set(x-1, cOpinions.get(x-1)+1);
			}else if(query == 2) {
				int x = Integer.parseInt(in[1]);
				cOpinions.set(x-1, cOpinions.get(x-1)-1);
			}else {
				int l = Integer.parseInt(in[1]);
				int r = Integer.parseInt(in[2]);
				int c = Integer.parseInt(in[3]);
				List<Integer> subList = cOpinions.subList(l-1, r);
				System.out.println(Collections.frequency(cOpinions.subList(l-1, r), c));
			}
		}
		int adshjrflasdh = 0;
	}
}
