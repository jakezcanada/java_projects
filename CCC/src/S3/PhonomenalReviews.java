package S3;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PhonomenalReviews {

	public static Integer findShortestPathing(Set<Integer> visited, Set<Integer> toVisit, int currentNode, HashMap<Integer, Set<Integer>> adjList, int depth) {
		toVisit.remove(currentNode);
		if(toVisit.isEmpty()) {
			return depth;
		}
		visited.add(currentNode);
		
		int pathlenght = 0;
		for(Integer node : adjList.get(currentNode)) {
			if(!visited.contains(node)) {
				int toVisSize = toVisit.size();
				System.out.println("e: " + node);
				int shortest = findShortestPathing(visited, toVisit, node, adjList, depth+1);
				System.out.println(shortest);
				int toVisSize2 = toVisit.size();
				if(toVisSize2 < toVisSize) {
					pathlenght+=shortest;
				}
			}
		}
		
		return depth+pathlenght;
	}
		//list of visited
		//where we are
		//list that we need to visit
		//adjList
		//how far we've traveled from the og point
		
	
	
	public static void addToList(HashMap<Integer, Set<Integer>> adjList, int a, int b) {
		if(!adjList.containsKey(a)) {
			adjList.put(a, new HashSet<Integer>());
		}	
		adjList.get(a).add(b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<Integer> phoR = new HashSet<Integer>();
		for(int i = 0; i<m; i++) {
			phoR.add(sc.nextInt());
		}
		HashMap<Integer, Set<Integer>> adjList = new HashMap<Integer, Set<Integer>>();
		for(int i = 0; i<n-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			addToList(adjList, a, b);
			addToList(adjList, b, a);
		}
		
		int startNode = Integer.MAX_VALUE;
		int nodeConnections = Integer.MAX_VALUE;
		
		for(Integer restaurant : phoR) {
			if(adjList.get(restaurant).size() < nodeConnections) {
				nodeConnections = adjList.get(restaurant).size();
				startNode = restaurant;
			}
		}
		System.out.println(startNode);
		System.out.println(findShortestPathing(new HashSet<Integer>(), phoR, startNode, adjList, 0));
		
		
				
	}

}
