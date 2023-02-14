package S1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ragaman {

	public static HashMap<String, Integer> makeMap(String[] input){
		HashMap<String, Integer> str1 = new HashMap<String, Integer>();
		str1.put("*", 0);
		for(int i = 0; i<input.length; i++) {
			if(str1.containsKey(input[i])) {
				str1.put(input[i], str1.get(input[i])+1);
			}else {
				str1.put(input[i], 1);
			}
		}
		return str1;
	}
	
	// assuming that map1 has less astericks
	public static boolean compareMap(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
		for(Map.Entry<String, Integer> entry : map1.entrySet()) {
			String s1 = entry.getKey();
			if(s1.equals("*")) {
				continue;
			}
			Integer i1 = entry.getValue();
			if(!map2.containsKey(s1)) {
				return false;
			}
			
			if(map2.get(s1) < i1) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    
    // let's say the first input string is length n
    // and the second is length m
    
		String[] in1 = sc.next().split(""); // O(n) since we have read in every character
		String[] in2 = sc.next().split(""); // O(m)
		if(in1.length != in2.length) { // O(1) simple comparisons are generally O(1)
			System.out.println("N");
			return;
		}
		HashMap<String, Integer> map1 = makeMap(in1); // O(n)
		HashMap<String, Integer> map2 = makeMap(in2); // O(m)
		boolean a = false;
		if(map2.get("*") < map1.get("*")) {
			a = compareMap(map1, map2); // O(n)
		}else {
			a = compareMap(map2, map1); // O(m)
		}
		if(a) {
			System.out.println("A");
		}else {
			System.out.println("N");
		}
	}
}
// renaming variables
// moving lines up and down
// duplicating cursor selection/editing multiple lines
// the overall time complexity is 3O(n) + 3O(m) = O(m + n)
// try again by sorting the string