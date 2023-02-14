package S1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sentences {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cases = Integer.parseInt(br.readLine());
		for(int i = 0; i<cases; i++) {
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			List<String> l1 = new ArrayList<String>();
			List<String> l2 = new ArrayList<String>();
			List<String> l3 = new ArrayList<String>();
			for(int j = 0; j<n1; j++) {
				l1.add(br.readLine());
			}
			for(int j = 0; j<n2; j++) {
				l2.add(br.readLine());
			}
			for(int j = 0; j<n3; j++) {
				l3.add(br.readLine());
			}
			List<String> l4 = new ArrayList<String>();
			for(int j = 0; j<n1; j++) {
				for(int k = 0; k<n2; k++) {
					for(int l = 0; l<n3; l++) {
						l4.add(l1.get(j) + " " + l2.get(k) + " " + l3.get(l) + ".");
					}
				}
			}
			for(int j = 0; j<l4.size(); j++) {
				System.out.println(l4.get(j));
			}
		}
	}

}
