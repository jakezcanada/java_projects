package S5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SheepAndCoyotes1 {
	static class Sheep {
		double x;
		double y;
		double distance;
		public Sheep(double x, double y){
			this.x = x;
			this.y = y;
		}
		public double findDistance(double coyote){
			distance = Math.round(Math.sqrt(Math.pow(x-coyote, 2) + Math.pow(y, 2)) * 1000.0) / 1000.0;
			return distance;
		}
		public String toString() {
			double roundOffx = Math.round(x * 100.0) / 100.0;
			double roundOffy = Math.round(y * 100.0) / 100.0;
			return "The sheep at (" + String.format("%.02f", roundOffx) + ", " + String.format("%.02f", roundOffy) + ") might be eaten.";
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sheeps = Integer.parseInt(br.readLine());
		List<Sheep> s = new ArrayList<Sheep>();
		for(int i = 0; i < sheeps; i++){
			Double x = Double.parseDouble(br.readLine());
			Double y = Double.parseDouble(br.readLine());
			s.add(new Sheep(x, y));
		}
		Set<Sheep> eaten = new HashSet<Sheep>();
		for(int coyote = 0; coyote <= 1000; coyote++){
			List<Sheep> closest = new ArrayList<Sheep>();
			closest.add(s.get(0));
			closest.get(0).findDistance(coyote);
			for(Sheep sheep : s){
				double n = sheep.findDistance(coyote);
				if(n < closest.get(0).distance){
					closest.clear();
					closest.add(sheep);
				}else if(n == closest.get(0).distance){
					closest.add(sheep);
				}
			}
			eaten.addAll(closest);
		}
		for(Sheep sheep : eaten){
			System.out.println(sheep);
		}
	}
}
