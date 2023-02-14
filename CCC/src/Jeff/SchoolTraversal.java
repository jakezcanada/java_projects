package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolTraversal {
	
	static class Hallway{
		int destination;
		int length;
		public Hallway(int destination, int length) {
			this.destination = destination;
			this.length = length;
		}
		public int getDestination() {
			return destination;
		}
		public int getLength() {
			return length;
		}
		public void setDestination(int destination) {
			this.destination = destination;
		}
		public void setLength(int length) {
			this.length = length;
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in1 = Integer.parseInt(br.readLine());
		Map<Integer, List<Hallway>> adjList = new HashMap<Integer, List<Hallway>>();
		for(int i = 0; i < in1; i++) {
			int[] in2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if(!adjList.containsKey(in2[0])) adjList.put(in2[0], new ArrayList<Hallway>());
			adjList.get(in2[0]).add(new Hallway(in2[1], in2[2]));
		}
		
	}
}
