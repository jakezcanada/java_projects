package S1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnglishOrFrench {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int t = 0;
		int s = 0;
		for(int i = 0; i<rows; i++) {
			String str = br.readLine();
			t += str.replaceAll("[tT]", "").length();
			s += str.replaceAll("[sS]", "").length();
		}
		if(t<s) {
			System.out.print("English");
		}else {
			System.out.print("French");
		}
	}

}
