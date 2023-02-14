package S1;

import java.util.Arrays;
import java.util.Scanner;

public class Maternity {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p1 = sc.next();
		String p2 = sc.next();
		
		String possibleGenes = "";
		
		for(int i = 0; i<5; i++) {
			String t1 = p1.substring(i*2, i*2+2);
			String t2 = p2.substring(i*2, i*2+2);
			String letter = p1.substring(i*2, i*2+1).toUpperCase();
			if(t1.contains(letter) || t2.contains(letter)) {
				possibleGenes+=letter;
			}
			if(t1.contains(letter.toLowerCase()) && t2.contains(letter.toLowerCase())) {
				possibleGenes+=letter.toLowerCase();
			}
		}
		
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			String[] child = sc.next().split("");
			boolean isChild = true;
			for(int j = 0; j<child.length; j++) {
				if(!possibleGenes.contains(child[j])) {
					isChild = false;
					break;
				}
			}
			if(isChild) {
				System.out.println("Possible baby.");
			}else {
				System.out.println("Not their baby!");
			}
		}
	}

}
