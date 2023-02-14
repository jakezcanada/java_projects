package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Jerseys {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int jerseys = Integer.parseInt(br.readLine());
		int athletes = Integer.parseInt(br.readLine());
		Map<String, Integer> sizeMap = new HashMap<String, Integer>();
		sizeMap.put("L",3);
		sizeMap.put("M",2);
		sizeMap.put("S",1);
		List<String> j = new ArrayList<String>();
		for (int i = 0; i < jerseys; i++) {
			j.add(br.readLine());
		}
		Map<Integer, String> a = new HashMap<Integer, String>();
		for (int i = 0; i < athletes; i++) {
			String[] str = br.readLine().split(" ");
			String size = str[0];
			int number = Integer.parseInt(str[1]);
			if(a.containsKey(number)) {
				if(sizeMap.get(a.get(number)) > sizeMap.get(size)) {
					a.put(number, size);
				}
			}else {
				a.put(number, size);
			}
		}
		int sum = 0;
		for(int i = 0; i < jerseys; i++) {
			if(sizeMap.containsKey(a.get(i+1))) {
				if(sizeMap.get(a.get(i+1)) <= sizeMap.get(j.get(i))) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
