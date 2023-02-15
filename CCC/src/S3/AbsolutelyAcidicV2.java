package S3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class AbsolutelyAcidicV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i = 0; i < in; i++) {
			int temp = sc.nextInt();
			if(!m.containsKey(temp)) {
				m.put(temp, 1);
			}else {
				m.replace(temp, m.get(temp)+1);
			}
		}
		int n1 = 0;
		int f1 = 0;
		int n2 = 0;
		int f2 = 0;
		for(int k : m.keySet()) {
			int freq = m.get(k);
			if(freq > f1 || freq > f2) {
				if(f1 < f2) {
					n1 = k;
					f1 = freq;
				}else {
					n2 = k;
					f2 = freq;
				}
			}else {
				if(freq == f1) {
					int d1 = Math.abs(n1-n2);
					int d3 = Math.abs(k-n2);
					if(d3 > d1) {
						n1 = k;
						f1 = freq;
					}
				}
				if(freq == f2) {
					int d1 = Math.abs(n1-n2);
					int d2 = Math.abs(k-n1);
					if(d2 > d1) {
						n2 = k;
						f2 = freq;
					}
				}
			}
		}
		System.out.println(Math.abs(n2-n1));
	}
}
