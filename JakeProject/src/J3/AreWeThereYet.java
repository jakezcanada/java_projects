package J3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AreWeThereYet {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr2 = new int[5];
		arr2[0] = 0;
		for(int i = 0; i<arr.length; i++) {
			arr2[i+1] = arr2[i] + arr[i];
		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				int distance = arr2[j] - arr2[i];
				if(distance<0)
					distance*=-1;
				System.out.print(distance+((j != 4) ? " " : ""));
			}
			System.out.println();
		}
	}
}
