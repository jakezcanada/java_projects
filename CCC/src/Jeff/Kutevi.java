package Jeff;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
//https://dmoj.ca/problem/coci09c2p3
public class Kutevi {
	
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] mirko = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] slavko = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(Arrays.stream(mirko).boxed().collect(Collectors.toSet()));
		for(int n : mirko)
			s.add(360%n);
		s.remove(0);
		int diff = Integer.MAX_VALUE;
		List<Integer> l = new ArrayList<Integer>(s);
		List<Integer> primes = new ArrayList<Integer>(s);
        for (int i = 0; i<l.size()-1; i++)
            for (int j=i+1; j<l.size(); j++) {
            	int changeFactor1 = Math.abs((360%l.get(i)) - ((360-(360%l.get(i)))%l.get(i)));
    			if(isPrime(Math.abs((l.get(i) - l.get(j))))) {
    				primes.add(Math.abs((l.get(i) - l.get(j))));
    			}
                if (Math.abs((l.get(i) - l.get(j))) < diff) {
                    diff = Math.abs((l.get(i) - l.get(j)));
                }
                if(l.get(i) != 0) {
        			if(isPrime(l.get(i))) {
        				primes.add(l.get(i));
        			}
        			if(l.get(i) < diff) {
                    	diff = l.get(i);
                    }
                }
                if(changeFactor1 != 0) {
        			if(isPrime(changeFactor1)) {
        				primes.add(changeFactor1);
        			}
        			if(changeFactor1 < diff) {
                    	diff = changeFactor1;
                    }
                }
            }
        for(int n : slavko) {
        	boolean found = false;
        	if(n%diff==0) {
        		System.out.println("YES");
        		found = true;
        	}else {
        		for(int k : primes) {
        			if(n%k == 0) {
        				System.out.println("YES");
                		found = true;
                		break;
        			}
        		}
        	}
        	if(!found) {
        		System.out.println("NO");
        	}
        }
	}
}
