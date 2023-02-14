package S2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poetry {

	public static String processString(String a) {
		a = a.toLowerCase();
		String[] vowels = {"a","e","i","o","u"};
		a = a.substring(a.lastIndexOf(" ")+1);
		for(int i = 0; i<vowels.length; i++) {
			if(a.indexOf(vowels[i]) != -1) {
				a = vowels[i] + a.substring(a.lastIndexOf(vowels[i])+1);
			}
		}
		return a;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i<n; i++) {
			String a = processString(br.readLine());
			String b = processString(br.readLine());
			String c = processString(br.readLine());
			String d = processString(br.readLine());
			if((a.equals(c) || c.equals(a)) && (b.equals(d) || d.equals(b)) && (b.equals(c) || c.equals(b))) {
				System.out.println("perfect");
			}else if((a.equals(b) || b.equals(a)) && (c.equals(d) || d.equals(c))) {
				System.out.println("even");
			}else if((a.equals(c) || c.equals(a)) && (b.equals(d) || d.equals(b))) {
				System.out.println("cross");
			}else if((a.equals(d) || d.equals(a)) && (b.equals(c) || c.equals(b))){
				System.out.println("shell");
			}else {
				System.out.println("free");
			}
		}
	}
	
}
