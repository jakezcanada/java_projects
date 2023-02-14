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

public class Firehose {
	
	static class Hydrant {
		int leftBound;
		int rightBound;
		
		public Hydrant(int leftBound, int rightBound) {
			this.leftBound = leftBound;
			if(rightBound<leftBound) {
				this.rightBound = 1000000 + rightBound;
			}else {
				this.rightBound = rightBound;
			}
		}
		
		public double getPosition() {
			double a = this.leftBound;
			double b = this.rightBound;
			double pos = a + ((a-b)/2.0);
			if(pos > 1000000) {
				return pos - 1000000;
			}
			return pos;
		}
		
		public int getLeftBound() {
			return leftBound;
		}

		public int getRightBound() {
			return rightBound;
		}
		
		public void setLeftBound(int leftBound) {
			this.leftBound = leftBound;
		}

		public void setRightBound(int rightBound) {
			if(rightBound<leftBound) {
				this.rightBound = 1000000 + rightBound;
			}else {
				this.rightBound = rightBound;
			}
		} 
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int H = Integer.parseInt(br.readLine());
		List<Hydrant> hydrants = new ArrayList<Hydrant>();
		for (int i = 0; i < H; i++) {
			int in = Integer.parseInt(br.readLine());
			hydrants.add(new Hydrant(in, in));
		}
		int k = Integer.parseInt(br.readLine());
		if(k > H) {
			System.out.println(0);
			return;
		}
		Collections.sort(hydrants, new Comparator<Hydrant>() {
			public int compare(Hydrant arg0, Hydrant arg1) {
				return arg0.getLeftBound()-arg1.getLeftBound();
			}
		});
		
		while(hydrants.size() != k) {
			if(hydrants.size() == k) {
				break;
			}
			double smallestDist = 1000000 - Math.abs(hydrants.get(0).getPosition()-hydrants.get(hydrants.size()-1).getPosition());
			int smallestDistIndex = -1;
			//find the smallest Dist so you can change hydrant pos
			for (int i = 0; i < hydrants.size()-1; i++) {
				if(smallestDist > hydrants.get(i+1).getPosition() - hydrants.get(i).getPosition()) {
					smallestDist = hydrants.get(i+1).getPosition() - hydrants.get(i).getPosition();
					smallestDistIndex = i;
				}
			}
			//delete a hydrant
			if(smallestDistIndex == -1) {
				hydrants.get(hydrants.size()-1).setRightBound(hydrants.get(0).getRightBound());
				hydrants.remove(0);
			}else {
				hydrants.get(smallestDistIndex).setRightBound(hydrants.get(smallestDistIndex+1).getRightBound());
				hydrants.remove(smallestDistIndex+1);
			}
		}
		double longestHose = Integer.MIN_VALUE;
		for (Hydrant h : hydrants) {
			double hDist = Math.abs(h.getPosition()-h.getLeftBound());
			if(hDist>longestHose) {
				longestHose = hDist;
			}
		}
		System.out.println((int) (longestHose+0.5));
	}
}
