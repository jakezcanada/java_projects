package S1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GFGF {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		if(num == 0) {
			System.out.println(0);
			return;
		}
		int sum = 0;
		int n2 = num/4 + 1;
		for(int i = 0; i<n2; i++) {
			if((num-(i*5))%4==0 && (num-(i*5)) >= 0) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}
