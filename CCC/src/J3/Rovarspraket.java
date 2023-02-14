package J3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Rovarspraket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> vowels = new ArrayList<>();
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		List<String> alphabet = new ArrayList<String>(Arrays.stream(("abcdefghijklmnopqrstuvwxyz").split("")).collect(Collectors.toList()));
		String[] in = sc.next().split("");
		for(String str : in) {
			if(vowels.contains(str)) {
				System.out.print(str);
				continue;
			}
			int t = alphabet.indexOf(str);
			//find consonant
			String consonant = "";
			if(str.equals("z")) {
				consonant = "z";
			}else {
				for (int i = 1; i < alphabet.size(); i++) {
					if(!vowels.contains(alphabet.get(t+i))) {
						consonant = alphabet.get(t+i);
						break;
					}
				}
			}
			String vowel = "";
			//find vowel
			for (int i = 1; i < alphabet.size(); i++) {
				if(t+i >= 0) {
					if(vowels.contains(alphabet.get(t-i))) {
						vowel = alphabet.get(t-i);
						break;
					}
				}
				if(t+i < alphabet.size()) {
					if(vowels.contains(alphabet.get(t+i))) {
						vowel = alphabet.get(t+i);
						break;
					}
				}

			}
			System.out.print(str + vowel + consonant);
		}
		//every letter -> find nearest vowel and next consonant
		//find consonant
		
		
	}
}
