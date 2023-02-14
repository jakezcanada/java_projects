package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AbsolutelyAcidic {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> readings = new ArrayList<Integer>(Collections.nCopies(1000, 0));
		for(int i = 0; i<n; i++){
			int in = Integer.parseInt(br.readLine());
			readings.set(in-1, readings.get(in-1)+1);
		}
		int lowest = Integer.MAX_VALUE;
		int highest = 0;
		int highestValue = Collections.max(readings);
		int temp = 0;
		//Map<Integer, Integer> values = new HashMap<Integer, Integer>();
		while(readings.contains(highestValue)){
			int highestValueIndex = readings.indexOf(highestValue);
			readings.set(highestValueIndex, 0);
			if(lowest > highestValueIndex){
				lowest = highestValueIndex;
			}
			if(highest < highestValueIndex){
				highest = highestValueIndex;
			}
			//values.put(highestValueIndex, highestValue);
			temp++;
		}
		if(temp<2){
			int lowest2 = Integer.MAX_VALUE;
			int highest2 = 0;
			highestValue = Collections.max(readings);
			while(readings.contains(highestValue)){
				int highestValueIndex = readings.indexOf(highestValue);
				readings.set(highestValueIndex, 0);
				if(lowest2 > highestValueIndex){
					lowest2 = highestValueIndex;
				}
				if(highest2 < highestValueIndex){
					highest2 = highestValueIndex;
				}
				//values.put(highestValueIndex, highestValue);
			}
			int highestOutcome = (Math.abs(highest-lowest2) > Math.abs(highest-highest2)) ? Math.abs(highest-lowest2) : Math.abs(highest-highest2);
			System.out.println(highestOutcome);
		}else{
			System.out.print(Math.abs(highest-lowest));
		}
	}

}