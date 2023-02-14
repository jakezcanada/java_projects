package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Silver {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[str.length()];
		int sum = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i) == 'G') {
				sum++;
			}
			arr[i] = sum;
		}
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			String[] temp = br.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b = Integer.parseInt(temp[1]);
			if(a>0) {
				System.out.println(arr[b]-arr[a-1]);
			}else {
				System.out.println(arr[b]);
			}
			
		}
	}

}
