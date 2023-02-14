package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AttackOfTheCipherTexts {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> cipher = new HashMap<String, String>();
		for (int i = 'A'; i < 'A'+26; i++) {
			cipher.put(Character.toString((char) i), ".");
		}
		cipher.put(" ", " ");
		String[] str1 = br.readLine().split("");
		String[] str2 = br.readLine().split("");
		for(int i = 0; i < str1.length; i++) {
			cipher.put(str2[i], str1[i]);
		}
		String[] msg = br.readLine().split("");
		for (String str : msg) {
			System.out.print(cipher.get(str));
		}
	}
}
