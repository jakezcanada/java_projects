package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AssigningPartners {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		Map<String, String> m = new HashMap<String, String>();
		for (int i = 0; i < n; i++) {
			if(m.containsKey(arr1[i])) {
				if(!m.get(arr1[i]).equals(arr2[i])) {
					//if old partner isn't equal to new partner
					System.out.println("bad");
					return;
				}
			}else if(arr1[i].equals(arr2[i])){
				System.out.println("bad");
				return;
			}else {
				m.put(arr2[i], arr1[i]);
			}
		}
		System.out.println("good");
	}
}
