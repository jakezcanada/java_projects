//package S3;
//
//import java.util.ArrayDeque;
//import java.util.ArrayList;
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Set;
//
////attempt with breadth first search
////bfs to closest node -> repeat
//
////attempt again with Floyd-Warshall later
//
//public class PhonomenalReviews3 {
//	
//	public static boolean prune(int startingNode, HashMap<Integer, Set<Integer>> adjList, Set<Integer> restaurantsToVisit) {
////		if() {
////			
////		}
//		
//		return false;
//	}
//	
//	public static void addToList(HashMap<Integer, Set<Integer>> adjList, int a, int b) {
//		if(!adjList.containsKey(a)) {
//			adjList.put(a, new HashSet<Integer>());
//		}	
//		adjList.get(a).add(b);
//	}
//	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		Set<Integer> phoR = new HashSet<Integer>();
//		for(int i = 0; i<m; i++) {
//			phoR.add(sc.nextInt());
//		}
//		HashMap<Integer, Set<Integer>> adjList = new HashMap<Integer, Set<Integer>>();
//		for(int i = 0; i<n-1; i++) {
//			int a = sc.nextInt();
//			int b = sc.nextInt();
//			addToList(adjList, a, b);
//			addToList(adjList, b, a);
//		}
//		
//		int startNode = Integer.MAX_VALUE;
//		int nodeConnections = Integer.MAX_VALUE;
//		Set<Integer> startingRestaurants = new HashSet<Integer>();
//		//there may be multiple valid start nodes so we store it in a Set
//		for(Integer restaurant : phoR) {
//			if(adjList.get(restaurant).size() < nodeConnections) {
//				nodeConnections = adjList.get(restaurant).size();
//				startNode = restaurant;
//				startingRestaurants.clear();
//				startingRestaurants.add(startNode);
//			}
//			if(adjList.get(restaurant).size() == nodeConnections) {
//				startingRestaurants.add(startNode);
//			}
//		}
//
//		adjList = prune(startNode, adjList, phoR);
//
//		//after the pruning, find: furthest 2 nodes + (2 x other nodes)
//
//		System.out.println(currentPath);
//	}
//
//}
