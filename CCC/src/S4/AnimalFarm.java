package S4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AnimalFarm {
	
	public static ArrayList<ArrayList<HashMap<Integer, Integer>>> fences;
	
	public static void addEdge(int u, int v, int weight)
    {
        fences.get(u).add(new HashMap<>());
        fences.get(u).get(fences.get(u).size() - 1).put(v, weight);
 
        fences.get(v).add(new HashMap<>());
        fences.get(v).get(fences.get(v).size() - 1).put(u, weight);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		fences = new ArrayList<ArrayList<HashMap<Integer, Integer>>>();
		for(int i = 0; i < in; i++) {
			int numOfsides = sc.nextInt();
			int[] sides = new int[numOfsides];
			int[] vals = new int[numOfsides];
			for (int j = 0; j < numOfsides; j++) {
				sides[i] = sc.nextInt();
			}
			for (int j = 0; j < numOfsides; j++) {
				vals[i] = sc.nextInt();
			}
			for (int j = 0; j < sides.length; j++) {
				addEdge(sides[i], sides[i+1], vals[i]);
			}
			addEdge(sides[sides.length-1], sides[0], vals[sides.length-1]);
		}
		
	}
}
