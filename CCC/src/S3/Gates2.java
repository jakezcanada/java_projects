package S3;

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
		int looper = p > g ? g : p;
		for (int i = 0; i < looper; i++) {
			// for every plane
			int plane = planes.get(i);
			boolean gatefound = false;
			if(plane<gates.size() && !gates.get(plane)){
				//put plane at highest possible gate
				gatefound = true;
				gates.set(plane, true);
				if(nextDown.indexOf(plane) != -1){
					nextDown.remove(nextDown.indexOf(plane));
				}
				if(plane-1 > -1 && !gates.get(plane-1)){
					nextDown.add(plane-1);
				}
				total++;
				
			}else{
				//put plane at next down?
				if(nextDown.size()>0){
					Collections.sort(nextDown);
					int lastInd = -1;
					for(int n : nextDown) {
						if(n < plane) {
							lastInd = nextDown.indexOf(n);
						}else {
							break;
						}
					}
					if(lastInd != -1) {
						gates.set(nextDown.get(lastInd), true);
						if(nextDown.get(lastInd)-1 > -1 && !gates.get(nextDown.get(lastInd)-1)){
							nextDown.add(nextDown.get(lastInd)-1);
						}
						nextDown.remove(lastInd);
						gatefound = true;
						total++;
					}
					
//					Collections.sort(nextDown);
//					if(nextDown.get(0)>plane){
//						break;
//					}
//					if(nextDown.size() == 1) {
//						if(nextDown.get(0) < plane){
//							gates.set(nextDown.get(0), true);
//							nextDown.remove(0);
//							gatefound = true;
//							total++;
//						}
//					}
//					for (int j = 1; j < nextDown.size(); j++) {
//						if(nextDown.size()-1 == j) {
//							if(nextDown.get(j) < plane){
//								gates.set(nextDown.get(j), true);
//								nextDown.remove(j);
//								gatefound = true;
//								total++;
//								break;
//							}
//						}
//						if(nextDown.get(j) > plane){
//							gates.set(nextDown.get(j-1), true);
//							nextDown.remove(j-1);
//							gatefound = true;
//							total++;
//							break;
//						}
//					}
				}
			}
			
			if(!gatefound){
				break;
			}
		}
		System.out.println(total);
	}
}
