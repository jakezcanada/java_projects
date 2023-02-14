package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AromaticNumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> symbolMap = new HashMap<String, Integer>();
		symbolMap.put("M", 1000);
		symbolMap.put("D", 500);
		symbolMap.put("C", 100);
		symbolMap.put("L", 50);
		symbolMap.put("X", 10);
		symbolMap.put("V", 5);
		symbolMap.put("I", 1);
		String str = br.readLine();
		String[] arr1 = Arrays.stream(str.split("[1234567890]")).filter(value -> value != null && value.length() > 0).toArray(size -> new String[size]);
		int[] arr2 = Arrays.stream(str.split("[MDCLXVI]")).mapToInt(Integer::parseInt).toArray();
		int sum = 0;
		for (int i = 0; i < arr1.length; i++) {
			if(i > 0) {
				if(symbolMap.get(arr1[i-1]) < symbolMap.get(arr1[i])) {
					sum -= 2*(symbolMap.get(arr1[i-1])*arr2[i-1]);
				}
			}
			sum+= symbolMap.get(arr1[i])*arr2[i];
		}
		System.out.println(sum);
	}
}
