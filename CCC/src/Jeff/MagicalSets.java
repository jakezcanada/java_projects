package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//https://dmoj.ca/problem/mwc15c6p3
public class MagicalSets {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		List<Set<Integer>> listOS = new ArrayList<Set<Integer>>();
		for (int i = 0; i < in[0]; i++) {
			listOS.add(Arrays.stream(br.readLine().split(" ")).skip(1).mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet()));
		}
		for (int i = 0; i < in[1]; i++) {
			int[] inp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			Set<Integer> curr = new HashSet<Integer>();
			for (int j = 0; j < inp[0]; j++) {
				Set<Integer> temp = listOS.get(inp[j+1]-1);
				//add
				for (int n : temp) {
					int ps = curr.size();
					curr.add(n);
					if(ps == curr.size())
						curr.remove(n);
				}
			}
			List<Integer> rep = new ArrayList<Integer>(curr);
			System.out.print(rep.size() + ((rep.size() != 0) ? " " : ""));
			for (int j = 0; j < rep.size(); j++) {
				System.out.print(rep.get(j) + ((j!=rep.size()-1) ? " " : ""));
			}
			System.out.println();
		}
	}
}
