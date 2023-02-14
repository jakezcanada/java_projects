package S1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;
import java.util.stream.Collectors;

public class FindingNumberOfPairs {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int m = a[1];
		List<Integer> in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		
		long numOfPairs = 0;
		//int start = -1;
		for (int i = 1; i < in.size(); i++) {
			List<Integer> sub = in.subList(0, i);
			Collections.sort(sub);
			int num = in.get(i);
			if(num<=m){
				if(num<=(m/2)){
					numOfPairs+=i;
				}else{
//					if(start == -1){
//						start = i;
//					}
					for (int j = i-1; j > -1; j--) {
						if(num+sub.get(j) <= m){
							numOfPairs+=j+1;
							//start = j+1;
							break;
						}
					}
				}
			}else{
				break;
			}
		}
		if(m>(Math.pow(10, 9)+7)){
			numOfPairs = (long) (numOfPairs%(Math.pow(10, 9)+7));
		}
		System.out.println(numOfPairs);
	}

}
