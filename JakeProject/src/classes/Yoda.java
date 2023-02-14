package classes;

import java.util.Scanner;

public class Yoda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//input and stuff
		String[] a = sc.next().split("");
		String[] b = sc.next().split("");
		int higherLength;
		int lowerLength;
		//determine longer/shorter array and longer/shorter number
		if(a.length > b.length) {
			higherLength = a.length;
			lowerLength = b.length;
		}else {
			higherLength = b.length;
			lowerLength = a.length;
		}
		
		//collide strings
		for(int i = 0; i<lowerLength; i++) {
			if(Integer.parseInt(a[a.length-1-i])>Integer.parseInt(b[b.length-1-i])) {
				b[b.length-1-i] = "";
			}else if(Integer.parseInt(a[a.length-1-i])<Integer.parseInt(b[b.length-1-i])) {
				a[a.length-1-i] = "";
			}
		}
		
		//check for YODA and output
		if(String.join("", a).equals("")) {
			System.out.println("YODA");
		}else {
			System.out.println(Integer.parseInt(String.join("", a)));
		}
		if(String.join("", b).equals("")) {
			System.out.println("YODA");
		}else {
			System.out.println(Integer.parseInt(String.join("", b)));
		}
	}

}
