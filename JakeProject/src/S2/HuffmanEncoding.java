package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HuffmanEncoding {
	
	public static String findNextLetter(String answerString, String binary, Map<String, String> binMap, int minLength) {
		if(binary.length() == 0) {
			return answerString;
		}else if(binary.length() < minLength) {
			return "";
		}
		String tester = "";
		boolean valid = false;
		for(Entry<String, String> entry : binMap.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			if(binary.indexOf(key) == 0) {
				binary = binary.replaceFirst(key, "");
				answerString += value;
				tester = findNextLetter(answerString, binary, binMap, minLength);
				if(tester != "") {
					valid = true;
					break;
				}
				binary = key + binary;
			}
		}
		if(!valid) {
			return "";
		}
		return tester;
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		Map<String, String> table = new HashMap<String, String>();
		int minLength = Integer.MAX_VALUE;
		for (int i = 0; i < k; i++) {
			String[] tarr = br.readLine().split(" ");
			if(tarr[1].length() < minLength) {
				minLength = tarr[1].length();
			}
			table.put(tarr[1], tarr[0]);
		}
		String in = br.readLine();
		String result = findNextLetter("", in, table, minLength);
		System.out.println(result);
	}

}
