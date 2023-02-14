package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PennisInTheRing {
	
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
			int sumEqual = 0;
			for (int i = 1; i <= in; i++) {
				for (int j = 1; j <= i; j++) {
					if(isInCircle(j, i, in)) {
						if(j == i){
							sumEqual++;
						}else {
							sum++;
						}
					}else {
						break;
					}
				}
			}
			System.out.println(((sum*8)+(in*4)+(sumEqual*4)+1));
		}
	}

}
