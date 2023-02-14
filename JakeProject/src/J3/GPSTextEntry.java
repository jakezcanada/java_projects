package J3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GPSTextEntry {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] strArr = {{"A","B","C","D","E","F"},
							 {"G","H","I","J","K","L"},
							 {"M","N","O","P","Q","R"},
							 {"S","T","U","V","W","X"},
							 {"Y","Z"," ","-",".","enter"}};
		String[] str = br.readLine().split("");
		int x = 0;
		int y = 0;
		int moves = 0;
		for (int i = 0; i < str.length; i++) {
			String in = str[i];
			int nx = 0;
			int ny = 0;
			for (int j = 0; j < strArr.length; j++) {
				for (int j2 = 0; j2 < strArr[0].length; j2++) {
					if(strArr[j][j2].equals(in)){
						nx = j;
						ny = j2;
					}
				}
			}
			moves += Math.abs(x-nx) + Math.abs(y-ny);
			x = nx;
			y = ny;
		}
		int nx = 0;
		int ny = 0;
		for (int j = 0; j < strArr.length; j++) {
			for (int j2 = 0; j2 < strArr[0].length; j2++) {
				if(strArr[j][j2].equals("enter")){
					nx = j;
					ny = j2;
				}
			}
		}
		moves += Math.abs(x-nx) + Math.abs(y-ny);
		System.out.println(moves);
		
	}
}
