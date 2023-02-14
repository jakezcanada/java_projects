package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Firehose2 {
	public static List<Integer> listOfHouses;
	public static int noOfHydrants(int length_of_the_hose) {
      	int actualLength = length_of_the_hose * 2;
      	int optimal = listOfHouses.size();
      	int count = 1;
        int maxCur = listOfHouses.get(0) + actualLength;
      	int i = 1;
      	while(i < listOfHouses.size()) {
        	if(listOfHouses.get(i)>maxCur){
              	count++;
              	maxCur = listOfHouses.get(i) + actualLength;
            }
          	i++;
        }
      	
      
		return optimal > count ? count : optimal;
    }
	
    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H = Integer.parseInt(br.readLine());
		listOfHouses = new ArrayList<>();
		for (int i = 0; i < H; i++) {
			int in = Integer.parseInt(br.readLine());
			listOfHouses.add(in);
		}
		int k = Integer.parseInt(br.readLine());
		if(k >= H) {
			System.out.println(0);
			return;
		}
		Collections.sort(listOfHouses);
		
        int min = -1;
        int max = 1000000;  
		while(max > min+1) {
			int mid = (int) (( min + max ) / 2 + 0.5);
			if ( noOfHydrants(mid) > k ) {
            	min = mid;
            } else {
            	max = mid;
            }
        }
		System.out.println(max);
	}
}
