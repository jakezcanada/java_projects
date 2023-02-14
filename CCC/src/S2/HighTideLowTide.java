package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HighTideLowTide {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> tides = new ArrayList<Integer>(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
				.boxed().collect(Collectors.toList()));
		Collections.sort(tides);
		List<Integer> lowTides;
		List<Integer> highTides;
		int sub = n/2;
		if(n%2 != 0) {
			lowTides = tides.subList(0, sub+1);
			highTides = tides.subList(sub+1, tides.size());
		}else {
			lowTides = tides.subList(0, sub);
			highTides = tides.subList(sub, tides.size());
		}
		
		Collections.reverse(lowTides);
		for (int i = 0; i < sub+1; i++) {
			if(i<lowTides.size())
				System.out.print(lowTides.get(i) + " ");
			if(i<highTides.size())
				System.out.print(highTides.get(i) + " ");
		}
	}
}
