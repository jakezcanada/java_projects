package classes;

import java.util.Scanner;

public class gettingInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name.");
	    String name = sc.nextLine();
	    System.out.println("Enter next");
	    String str1 = sc.nextLine();
	    System.out.println("Enter next");
	    String str2 = sc.nextLine();
	    System.out.println("Enter next");
	    String str3 = sc.nextLine();
	    
	    System.out.println(name);
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);
	    
	}

}
