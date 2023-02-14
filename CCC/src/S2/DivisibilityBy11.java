package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DivisibilityBy11 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		for(int i = 0; i<n; i++) {
			String ogNum = br.readLine();
			List<Integer> num = Arrays.asList(ogNum.split("")).stream().map(Integer::parseInt).collect(Collectors.toList());
			for(int j = ogNum.length()-1; j>-1; j--) {
				if(num.size() < 3) {
					break;
				}
				
				int digit = num.get(j);
				num.remove(num.size()-1);
				if(digit > num.get(num.size()-1)) {
					//normal subtract
					//set the number
					num.set(num.size()-1, num.get(num.size()-1)-digit);
					
				}else {
					//if the next number is smaller,
					int nextNum = (num.get(num.size()-1)+10)-digit; // get num+10 and subtract the digit
					if(num.get(num.size()-2) == 0) {
						for(int k = 0; k<num.size(); k++) {
							//track 0's until next number, next number -1 and all 0's = 9
							if(num.get(num.size()-2-k)==0) {
								
							}
						}
					}else {
						
					}
					
				}
				
				System.out.println(num.stream().map(String::valueOf).collect(Collectors.joining(",")));
			}
			System.out.println(num);
			if(num.equals("11")) {
				System.out.println("The number " + ogNum + " is divisible by 11.");
			}else {
				System.out.println("The number " + ogNum + " is not divisible by 11.");
			}
		}
	}

}
