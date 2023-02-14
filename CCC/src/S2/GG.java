package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GG {
	public static void putStuff(Map<String, ArrayList<String>> groups, String a, String b, String c) {
		groups.put(a, new ArrayList<String>());
		groups.get(a).add(b);
		groups.get(a).add(c);
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, ArrayList<String>> together = new HashMap<String, ArrayList<String>>();
		int tn = Integer.parseInt(br.readLine());
		for(int i = 0; i<tn; i++) {
			String[] t = br.readLine().split(" ");
			if(!together.containsKey(t[0])) {
				together.put(t[0], new ArrayList<String>());
			}
			together.get(t[0]).add(t[1]);
		}
		Map<String, ArrayList<String>> away = new HashMap<String, ArrayList<String>>();
		int an = Integer.parseInt(br.readLine());
		for(int i = 0; i<an; i++) {
			String[] t = br.readLine().split(" ");
			if(!away.containsKey(t[0])) {
				away.put(t[0], new ArrayList<String>());
			}
			away.get(t[0]).add(t[1]);
		}
		Map<String, ArrayList<String>> groups = new HashMap<String, ArrayList<String>>();
		int gn = Integer.parseInt(br.readLine());
		for(int i = 0; i<gn; i++) {
			String[] t = br.readLine().split(" ");
			putStuff(groups, t[0], t[1], t[2]);
			putStuff(groups, t[1], t[0], t[2]);
			putStuff(groups, t[2], t[1], t[0]);
		}
		int v = 0;
		for(Entry<String, ArrayList<String>> e : together.entrySet()) {
			for(String str : e.getValue()) {
				if(!groups.get(e.getKey()).contains(str)) {
					v++;
				}
			}
		}
		for(Entry<String, ArrayList<String>> e : away.entrySet()) {
			for(String str : e.getValue()) {
				if(groups.get(e.getKey()).contains(str)) {
					v++;
				}
			}
		}
		System.out.println(v);
	}
}
