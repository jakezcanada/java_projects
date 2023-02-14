package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TandemBicycle {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean findingMin = br.readLine().equals("1") ? true : false;
		int n = Integer.parseInt(br.readLine());
		List<Integer> dmojistan = new ArrayList<Integer>(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
		List<Integer> pegland = new ArrayList<Integer>(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
		Collections.sort(dmojistan);
		Collections.sort(pegland);
		if(!findingMin) {
			Collections.reverse(pegland);
		}
		long sum = 0;
		for (int i = 0; i < dmojistan.size(); i++) {
			sum += (dmojistan.get(i) > pegland.get(i)) ? dmojistan.get(i) : pegland.get(i);
		}
		System.out.println(sum);
	}

}
