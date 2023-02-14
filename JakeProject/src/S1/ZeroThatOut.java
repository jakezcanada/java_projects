package S1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ZeroThatOut {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i<k; i++) {
			int in = sc.nextInt();
			if(in==0) {
				arr.remove(arr.size()-1);
			}else {
				arr.add(in);
			}
		}
		System.out.println(arr.stream().mapToInt(i -> i).sum());
	}

}
