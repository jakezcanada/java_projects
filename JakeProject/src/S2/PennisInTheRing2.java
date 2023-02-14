package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PennisInTheRing2 {
	
	public static boolean isInCircle(int x, int y, int r) {
		return Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(r, 2);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in = -1;
		while(in != 0) {
			in = Integer.parseInt(br.readLine());
			if(in == 0) {
				break;
			}
			int sum = 0;
			int start = in-1;
			for (int i = 1; i < in; i++) {
				for (int j = start; j > 0; j--) {
					if(isInCircle(i, j, in)) {
						start = j;
						sum += in-(in-j);
						break;
					}
				}
			}
			System.out.println(((sum*4)+(in*4)+1));
		}
	}

}
