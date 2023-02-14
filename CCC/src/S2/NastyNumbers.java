package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NastyNumbers {
	
	private static boolean isNasty(int in) {
		
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for (int i = 1; i <= Math.sqrt(in); i++) {
			if (in % i == 0) {
				for(Entry<Integer, Integer> entry : m.entrySet()) {
					if(entry.getKey() - entry.getValue() == (in/i) + i) {
						return true;
					}else if(entry.getKey() + entry.getValue() == (in/i) - i) {
						return true;
					}
				}
				m.put(in/i, i);
			}
		}
		return false;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int in = Integer.parseInt(br.readLine());
			if(isNasty(in)) {
				System.out.println(in + " is nasty");
			}else {
				System.out.println(in + " is not nasty");
			}
		}
		
		
	}
	
}
