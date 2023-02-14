package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleChoice {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			String a = br.readLine();
			if(arr[i].equals(a))
				sum++;
		}
		System.out.println(sum);
	}

}
