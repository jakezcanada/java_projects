package J3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Art {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		for(int i = 0; i<n; i++) {
			String[] temp = sc.next().split(",");
			x.add(Integer.parseInt(temp[0]));
			y.add(Integer.parseInt(temp[1]));
		}
		Collections.sort(x);
		Collections.sort(y);
		System.out.println((x.get(0)-1) + "," + (y.get(0)-1));
		System.out.print((x.get(x.size()-1)+1) + "," + (y.get(y.size()-1)+1));
	}
}
