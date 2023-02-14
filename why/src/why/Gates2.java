package why;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Gates2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int g = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		List<Integer> planes = new ArrayList<Integer>();
		for (int i = 0; i < p; i++) {
			planes.add(Integer.parseInt(br.readLine())-1);
		}
		int lowest = 0;
		List<Boolean> gates =new ArrayList<Boolean>(Arrays.asList(new Boolean[g]));
		Collections.fill(gates, false);
		int total = 0;
		//idea: for every plane that lands, save the next available slot and if its taken, then don't give a shit and move on
		//if a plane takes a spot in this way, check next. if next is taken, then dont give a shit, else add it to the set
		List<Integer> nextDown = new ArrayList<Integer>();
		nextDown.add(Integer.MAX_VALUE);
		for (int i = 0; i < g; i++) {
			// for every plane
			int plane = planes.get(i);
			boolean found = false;
			if(plane<gates.size() && !gates.get(plane)){
				//put plane at highest possible gate
				found = true;
				gates.set(plane, true);
				if(nextDown.indexOf(plane) != -1){
					nextDown.remove(nextDown.indexOf(plane));
				}
				if(plane-1>-1 && !gates.get(plane-1)){
					nextDown.add(plane-1);
				}
				total++;
			}else{
				//put plane at next down?
				if(nextDown.size()>1){
					Collections.sort(nextDown);
					if(nextDown.get(0)>plane){
						break;
					}
					for (int j = 1; j < nextDown.size(); j++) {
						if(nextDown.get(j) > plane){
							gates.set(j-1, true);
							if(j-2>-1 && !gates.get(j-2)){
								nextDown.add(j-2);
							}
							nextDown.remove(j-1);
							found = true;
							total++;
							break;
						}
					}
				}
			}
			
			if(!found){
				break;
			}
		}
		System.out.println(total);
	}
}