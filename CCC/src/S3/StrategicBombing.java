package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class StrategicBombing {
	public static boolean canReach(String start, String target, Map<String, Set<String>> adjList) {
		Set<String> v = new HashSet<>();
		Set<String> nodes = new HashSet<>();
		v.add(start);
		nodes.addAll(adjList.get(start));
		while(nodes.size() != 0) {
			String connected = "";
			for(String str : nodes) {
				connected = str;
				break;
			}
			nodes.addAll(adjList.get(connected));
			if(nodes.contains(target)) {
				return true;
			}
			v.add(connected);
			nodes.removeAll(v);
		}
		return false;
	}
	public static void addToList(Map<String, Set<String>> adjList, String n1, String n2) {
		if(!adjList.containsKey(n1)) {
			adjList.put(n1, new HashSet<String>());
		}
		adjList.get(n1).add(n2);
	}
	//a, bfs to b. try to remove every path from a to b.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String in = "";
		Map<String, Set<String>> adjList = new HashMap<String, Set<String>>();
		Map<String, Set<String>> copy = new HashMap<String, Set<String>>();
		while(!in.equals("**")) {
			in = br.readLine();
			if(in.equals("**")) {
				break;
			}
			String n1 = in.split("")[0];
			String n2 = in.split("")[1];
			addToList(adjList, n1, n2);
			addToList(adjList, n2, n1);
			addToList(copy, n1, n2);
			addToList(copy, n2, n1);
		}
		int sum = 0;
		Set<String> v = new HashSet<>();
		for(Entry<String, Set<String>> entry : adjList.entrySet()) {
			Set<String> temp = entry.getValue();
			String k = entry.getKey();
			for(String str : temp) {
				copy.get(k).remove(str);
				copy.get(str).remove(k);
				if(!canReach("A", "B", copy)) {
					if(!v.contains(k+" "+str) && !v.contains(str+" "+k)) {
						System.out.println(str+k);
						v.add(str+" "+k);
						sum++;
					}
				}
				copy.get(k).add(str);
				copy.get(str).add(k);
			}
		}
		System.out.println("There are " + sum + " disconnecting roads.");
	}
}
