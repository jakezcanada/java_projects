package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BabblingBrooks {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ss = Integer.parseInt(br.readLine());
		List<Double> arrL = new ArrayList<Double>();
		for(int i = 0; i<ss; i++) {
			arrL.add(Double.parseDouble(br.readLine()));
		}
		int in = 0;
		while(in!=77) {
			in = Integer.parseInt(br.readLine());
			if(in == 77) {
				//77 break
				break;
			}else if(in == 99) {
				//99 or split
				int stream = Integer.parseInt(br.readLine());
				double percentOfLeft = Double.parseDouble(br.readLine())/100;
				arrL.add(stream, arrL.get(stream-1)*(1.0-percentOfLeft));
				arrL.set(stream-1, arrL.get(stream-1)*percentOfLeft);
			}else {
				//88 or join
				int stream = Integer.parseInt(br.readLine());
				if(stream == arrL.size()) {
					arrL.set(stream-1, arrL.get(stream-1) + arrL.get(0));
					arrL.remove(0);
				}else {
					arrL.set(stream, arrL.get(stream-1) + arrL.get(stream));
					arrL.remove(stream-1);
				}
			}
		}
		System.out.println(Arrays.toString(arrL.stream().mapToInt(i -> Integer.valueOf((int) Math.round(i))).toArray()).replaceAll("[\\[\\]\\,]", ""));
	}

}
