package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BridgeTransport {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int maxWeight = Integer.parseInt(br.readLine());
		int cars = Integer.parseInt(br.readLine());
		List<Integer> l = new ArrayList<Integer>();
		int passedC = 0;
		for (int i = 0; i < cars; i++) {
			int car = Integer.parseInt(br.readLine());
			l.add(car);
			if(l.size() > 4) {
				l.remove(0);
			}
			if(l.stream().mapToDouble(a -> a).sum()>maxWeight) {
				break;
			}
			passedC++;
		}
		System.out.println(passedC);
	}
}
