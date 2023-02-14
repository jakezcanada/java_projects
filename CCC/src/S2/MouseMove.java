package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MouseMove {

	public static int checkBounds(int max, int n) {
		if(n < 0) {
			return 0;
		}
		if(n > max) {
			return max;
		}
		return n;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] max = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] pos = {0, 0};
		while(true) {
			int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if(in[0] == 0 && in[1] == 0) {
				break;
			}
			pos[0] += in[0];
			pos[1] += in[1];
			pos[0] = checkBounds(max[0], pos[0]);
			pos[1] = checkBounds(max[1], pos[1]);
			System.out.println(pos[0] + " " + pos[1]);
		}

		
	}

}
