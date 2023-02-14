package S3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;	
import java.util.Queue;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Pho {

	//O(1) time
	public static void addToList(HashMap<Integer, Set<Integer>> adjList, int a, int b) {
		if(!adjList.containsKey(a)) {
			adjList.put(a, new HashSet<Integer>());
		}	
		adjList.get(a).add(b);
	}

	//O(n) time
	//O(n) space
	public static List<Integer> getLeafs(HashMap<Integer, Set<Integer>> adjList) {
		return adjList.entrySet()
			.stream()
			// leafs are only connected to one other node
			.filter(entry -> entry.getValue().size() == 1) 
			.map(entry -> entry.getKey())
			.collect(Collectors.toList());
	}

	// finds the furthest node from the starting node
	//O(n) time
	//O(n) space
	public static List<Integer> findFarthest(HashMap<Integer, Set<Integer>> adjList, int start, Set<Integer> visited, int distance) {
		visited.add(start);

	 	List<Integer> defaultAns = new ArrayList();
	 	defaultAns.add(start);
	 	defaultAns.add(distance);

		return adjList.get(start)
			.stream()
			.filter(node -> !visited.contains(node))
			.map(node -> {
				return findFarthest(adjList, node, visited, distance + 1);
			})
			.max((List<Integer> n1, List<Integer> n2) -> n1.get(1) - n2.get(1))
			.orElse(defaultAns);
	}
	
	public static void main(String[] args) {
		// read inupt 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Set<Integer> phoR = new HashSet<Integer>();
		for(int i = 0; i<m; i++) {
			phoR.add(sc.nextInt());
		}

		// build adjacency list
		HashMap<Integer, Set<Integer>> adjList = new HashMap<Integer, Set<Integer>>();
		for(int i = 0; i<n-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			addToList(adjList, a, b);
			addToList(adjList, b, a);
		}

		// System.out.println("adjList: " + adjList);

		// get list of leaf nodes 
		List<Integer> leafs = getLeafs(adjList);
		// System.out.println("leafs: " + leafs);

		// bfs to remove useless leafs
    Queue<Integer> leafQueue = new LinkedList<Integer>(leafs);
   	
   	while(!leafQueue.isEmpty()) {
   		int leaf = leafQueue.remove();
   		int parent = adjList.get(leaf).iterator().next();

   		if (!phoR.contains(leaf)) {
   			adjList.remove(leaf);
   			adjList.get(parent).remove(leaf);

   			// if the parent has now become a leaf add it to the queue
   			if (adjList.get(parent).size() == 1) {
   				leafQueue.add(parent);
   			}
   		}
   	}

   	// System.out.println("adjList: " + adjList);

   	// count the number of edges
   	int edges = adjList.values()
   		.stream()
   		.map(value -> value.size())
   		.reduce(0, Integer::sum);
   	edges /= 2;

   	// System.out.println("edges: " + edges);

   	// get list of leaf nodes 
		leafs = getLeafs(adjList);
		// System.out.println("leafs: " + leafs);
		// System.out.println("leafs[0]: " + leafs.get(0));

		Set<Integer> visited = new HashSet();
		visited.add(leafs.get(0));

		List<Integer> farthestA = findFarthest(adjList, leafs.get(0), visited, 0);
		// System.out.println("farthestA: " + farthestA);

		visited = new HashSet();
		List<Integer> farthestB = findFarthest(adjList, farthestA.get(0), visited, 0);
		// System.out.println("farthestB: " + farthestB);

		int answer = farthestB.get(1) + 2 * (edges - farthestB.get(1));
		// System.out.println("answer: " + answer);
		System.out.println(answer);

	}

}

