package S3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

//attempt with breadth first search
//bfs to closest node -> repeat

//attempt again with Floyd-Warshall later

public class PhonomenalReviews2 {
	
	public static int findClosestRestaurant2(int startingNode, HashMap<Integer, Set<Integer>> adjList, Set<Integer> restaurantsToVisit, int thePathLength){
		//return condition: if we have no more restaurants to visit
		restaurantsToVisit.remove(startingNode);
		if(restaurantsToVisit.isEmpty()) {
			restaurantsToVisit.add(startingNode);
			return thePathLength;
		}
		//if we don't return, bfs to closest point(s)
		Map<Integer, Integer> validClosestNodes = new HashMap<>();
		ArrayDeque<Integer> dq = new ArrayDeque<Integer>(100000); 
		dq.add(startingNode);
		boolean[] visitedNodes = new boolean[adjList.size()];
		boolean foundValidNode = false;
		while(dq.size() != 0) {//loop until you break out essentially
			thePathLength++;//you go down a layer each loop
			ArrayDeque<Integer> dqClone = dq.clone();
			for(int node : dqClone) {//for each node in the deque...
				for(int n : adjList.get(node)) {//find adjacent nodes...
					if(visitedNodes[n] == false) {//if we have not visited them...
						dq.add(n);//add them to your deque...
						visitedNodes[n] = true;//and tell your code you've been here before!
						if(restaurantsToVisit.contains(n)) {//if this current node is a restaurant...
							//System.out.println("Node " + node + " to " + n);
							validClosestNodes.put(n,thePathLength);//then add it to validClosestNodes..
							//System.out.println("asd " + n);
							foundValidNode = true;//and tell your code that you have found a valid node
						}
					}
				}
			}
			if(foundValidNode) {//if you've found valid node(s)...
				break;//exit the loop
			}
		}
		
		//to deal with multiple nodes of the same distance away, we then bfs from each of those nodes and see which has the shortest path (supposedly)
		int currentPath = Integer.MAX_VALUE;
		for(Map.Entry<Integer, Integer> entry : validClosestNodes.entrySet()) {
			int node = entry.getKey();
			int pathLength = entry.getValue();
			int potentialPath = findClosestRestaurant2(node, adjList, restaurantsToVisit, thePathLength);
			//if currentPath is greater than potentialPath
			if(currentPath > potentialPath) {
				//change our currentPath to the potentialPath
				currentPath = potentialPath;
			}
		}
		//System.out.println(currentPath + " " + thePathLength);
		restaurantsToVisit.add(startingNode);
		return currentPath;
	}
	
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
		Set<Integer> startingRestaurants = new HashSet<Integer>();
		//there may be multiple valid start nodes so we store it in a Set
		for(Integer restaurant : phoR) {
			if(adjList.get(restaurant).size() < nodeConnections) {
				nodeConnections = adjList.get(restaurant).size();
				startNode = restaurant;
				startingRestaurants.clear();
				startingRestaurants.add(startNode);
			}
			if(adjList.get(restaurant).size() == nodeConnections) {
				startingRestaurants.add(startNode);
			}
		}

		int currentPath = Integer.MAX_VALUE;
		Set<Integer> tempPho = new HashSet<>(phoR);
		for(int validNode : tempPho) {
			int potentialPath = findClosestRestaurant2(validNode, adjList, phoR, 0);
			//if currentPath is greater than potentialPath
			if(currentPath > potentialPath) {
				//change our currentPath to the potentialPath
				currentPath = potentialPath;
			}
		}
		
		System.out.println(currentPath);
	}

}
