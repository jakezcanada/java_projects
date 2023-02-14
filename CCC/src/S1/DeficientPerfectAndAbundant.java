package S1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DeficientPerfectAndAbundant {

	public static void dpa(int num) {
		Set<Integer> factors = new HashSet<Integer>();
		
		for(int i = 1; i<Math.sqrt(num)+1; i++) {
			if(num%i==0) {
				factors.add(i);
				factors.add(num/i);
			}
		}
		factors.remove(num);
		//1 for def, 2 for perf, 3 for abun
		int sum = factors.stream().mapToInt(Integer::intValue).sum();
		if(sum<num) {
			System.out.println(num + " is a deficient number.");
		}else if(sum==num) {
			System.out.println(num + " is a perfect number.");
		}else {
			System.out.println(num + " is an abundant number.");
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			dpa(Integer.parseInt(br.readLine()));
		}
		
	}

}
