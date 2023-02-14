package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Champions2 {

	public static class Pair implements Comparable<Pair>{
		int pw, index;
		public int compareTo(Pair other) {
			if(pw > other.pw) {
				return 1;
			}
			if(pw == other.pw && index > other.index) {
				return 1;
			}
			return -1;
		}
		public Pair(int x, int y) {
			pw = x;
			index = y;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp1 = br.readLine().split("");
		
	}

}
