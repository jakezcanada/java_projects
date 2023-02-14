package S3;
// auto input
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Surfing {
	
	public static Set<String> findingChildren(Map<String, Set<String>> linkedLinks, Set<String> visited, String link) {
		Set<String> children = new HashSet<String>();
		Set<String> currentLinks = linkedLinks.get(link);
		if(currentLinks==null) {
			return children;
		}
		for(String str : currentLinks) {
			if(!visited.contains(str)) {
				visited.add(str);
				children.add(str);
				Set<String> temp = findingChildren(linkedLinks, visited, str);
				children.addAll(temp);
			}
		}
		return children;
	}
 
	public static void main(String[] args) {
		// find html blocks
		// find links
		// repeat
		Scanner sc = new Scanner(System.in);
		int numberOfLinks = sc.nextInt();
		//ArrayList<String> Links = new ArrayList<String>();
		Map<String, Set<String>> linkedLinks = new HashMap<String, Set<String>>();
		for(int i = 0; i<numberOfLinks; i++) {
			String link = sc.next();
			String line = "";
			boolean exit = false;
			while(!exit) {
				line = sc.nextLine();
				if(line.indexOf("</HTML>") != -1) {
					exit = true;
				}
				while(line.indexOf("<A HREF=") != -1) {
					line = line.substring(line.indexOf("<A HREF=\""));
					String subLink = line.substring(9,line.indexOf("\">"));
					if(!linkedLinks.containsKey(link)) {
						linkedLinks.put(link, new HashSet<String>());
					}
					System.out.println("Link from " + link + " to " +  subLink);
					linkedLinks.get(link).add(subLink);
					line = line.substring(line.indexOf("\">")+2);
				}
			}
		}
		
		for(Map.Entry<String, Set<String>> entry : linkedLinks.entrySet()) {
			String key = entry.getKey();
			Set<String> visitedSet = new HashSet<String>();
			visitedSet.add(key);
			linkedLinks.get(key).addAll(findingChildren(linkedLinks, visitedSet, key));
		}

		while(true) {
			String in1 = sc.next();
			String in2 = sc.next();
			if(!(in1+" "+in2).equals("The End")) {
				if(linkedLinks.containsKey(in1)) {
					if(linkedLinks.get(in1).contains(in2)) {
						System.out.println("Can surf from " + in1 + " to " + in2 + ".");
						//Can surf from http://ccc.uwaterloo.ca to http://www.www.www.com.
					}else {
						System.out.println("Can't surf from " + in1 + " to " + in2 + ".");
					}
				}else {
					System.out.println("Can't surf from " + in1 + " to " + in2 + ".");
				}
			}else {
				break;
			}
		}
	}
}
