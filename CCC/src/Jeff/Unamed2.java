package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Unamed2 {
	static class Node{
		private int id;
		private int value;
		
		public Node(int id, int value){
			this.id = id;
			this.value = value;
		}
		
		public int getId() {
			return id;
		}
		public int getValue() {
			return value;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setValue(int value) {
			this.value = value;
		}		
	}
	
	public static int sumOfNodes(Node node, Map<Integer, ArrayList<Node>> adjList, ArrayList<Node> nodes) {
		int sum = node.getValue();
		for(int i = 0; i < adjList.get(node.getId()).size(); i++) {
			sum += sumOfNodes(adjList.get(node.getId()).get(i), adjList, nodes);
		}
		return sum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int root = in1[1];
		int fromBranch = in1[2];
		int[][] connections = new int[in1[0]-1][2];
		for(int i = 0; i < in1[0]-1; i++) {
			connections[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
		int[] values = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		ArrayList<Node> nodes = new ArrayList<Node>();
		for(int i = 0; i < in1[0]; i++) {
			nodes.add(new Node(i, values[i]));
		}
		Map<Integer, ArrayList<Node>> adjList = new HashMap<Integer, ArrayList<Node>>();
		for(int i = 0; i < in1[0]; i++) {
			adjList.put(i, new ArrayList<Node>());
		}
		for(int i = 0; i < connections.length; i++) {
			int parent = connections[i][0]-1;
			int child = connections[i][1]-1;
			System.out.println(parent + " " + child);
			adjList.get(parent).add(nodes.get(child));
		}
		System.out.print(sumOfNodes(nodes.get(fromBranch-1), adjList, nodes));
	}
}
