package CCC2023;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class SymmetricMountains {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		int[] mounts = new int[in];
		for (int i = 0; i < in; i++) {
			mounts[i] = sc.nextInt();
		}
		int[] bestSyms = new int[in];
		Arrays.fill(bestSyms, Integer.MAX_VALUE);
		bestSyms[0] = 0;
		for (int i = 0; i < mounts.length; i++) {
			int tempSym = 0;
			for (int j = 1; j < mounts.length; j++) {
				if(i-j > -1 && i+j < mounts.length) { 
					tempSym += Math.abs(mounts[i-j] - mounts[i+j]);
				}else{
					break;
				}
				if(tempSym < bestSyms[j*2]) {
					bestSyms[j*2] = tempSym;
				}
			}
		}
		// even
		for (int i = 0; i < mounts.length; i++) {
			int tempSym = 0;
			for (int j = 0; j < mounts.length; j++) {
				if(i-j > -1 && i+j+1 < mounts.length) {
					tempSym += Math.abs(mounts[i-j] - mounts[i+j+1]);
				}else{
					break;
				}
				if(tempSym < bestSyms[(j+1)*2-1]) {
					bestSyms[(j+1)*2-1] = tempSym;
				}
			}
		}
		System.out.println(Arrays.toString(bestSyms).replaceAll("[\\[\\]\\,]", ""));
	}
}
