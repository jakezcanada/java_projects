package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//https://dmoj.ca/problem/acc5p3

public class CuttingCheeseCosts {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		List<Integer> discounts = new ArrayList<Integer>();
		long total = 0;
		for(int i = 0; i < in[0]; i++) {
			int[] in1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			total += in1[0];
			discounts.add(in1[0]-in1[1]);
		}
		Collections.sort(discounts);
		for(int i = 0; i < in[1]; i++) {
			total -= discounts.get(discounts.size()-1-i);
		}
		System.out.println(total);
	}
}
