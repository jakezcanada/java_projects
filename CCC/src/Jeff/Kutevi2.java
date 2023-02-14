package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Kutevi2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] mirko = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] slavko = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(Arrays.stream(mirko).boxed().collect(Collectors.toSet()));
//		for(int i = 0; i<360; i++) {
//			for(int n : s) {
//				s.add();
//			}
//		}
	}
}
