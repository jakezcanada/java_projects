package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Boxes {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int boxes = Integer.parseInt(br.readLine());
		List<List<Integer>> boxSizes = new ArrayList<List<Integer>>();
		for (int i = 0; i < boxes; i++) {
			List<Integer> temp = new ArrayList<Integer>(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList()));
			Collections.sort(temp);
			temp.add(temp.get(0)*temp.get(1)*temp.get(2));
			boxSizes.add(temp);
		}
		Collections.sort(boxSizes, new Comparator<List<Integer>>() {
			@Override
			public int compare(List<Integer> arg0, List<Integer> arg1) {
				return arg0.get(3)-arg1.get(3);
			}
		});
		int numOfItems = Integer.parseInt(br.readLine());
		for (int i = 0; i < numOfItems; i++) {
			List<Integer> item = new ArrayList<Integer>(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt)
					.boxed().collect(Collectors.toList()));
			Collections.sort(item);
			boolean boxed = false;
			for (int j = 0; j < boxSizes.size(); j++) {
				List<Integer> box = boxSizes.get(j);
				boolean fits = true;
				for (int k = 0; k < 3; k++) {
					if(item.get(k) > box.get(k)) {
						fits = false;
						break;
					}
				}
				if(fits) {
					//if it fits, print box and break
					System.out.println(box.get(3));
					boxed = true;
					break;
				}
			}
			if(!boxed) {
				System.out.println("Item does not fit.");
			}
		}
	}

}
