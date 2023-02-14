package S1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CrazyFencing {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] heights = Arrays.stream(br.readLine().split(" ")).mapToDouble(Integer::parseInt).toArray();
		double totalA = 0;
		double[] w = Arrays.stream(br.readLine().split(" ")).mapToDouble(Integer::parseInt).toArray();
		for(int i = 0; i<n; i++) {
			double tallerSide = heights[i] > heights[i+1] ? heights[i] : heights[i+1];
			double shorterSide = heights[i] < heights[i+1] ? heights[i] : heights[i+1];
			double triangle = ((tallerSide-shorterSide)*w[i])/2;
			double area = triangle + (shorterSide * w[i]);
			totalA += area;
		}
		System.out.println(totalA);
	}

}
