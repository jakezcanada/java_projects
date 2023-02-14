package J5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ModernArt {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rows = Integer.parseInt(br.readLine());
		int cols = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[rows][cols];
		for(int i = 0; i<rows; i++) {
			for(int j = 0; j<cols; j++) {
				arr[i][j] = "";
			}
		}
//		for(int i = 0; i<n; i++) {
//			String t1 = sc.next();
//			int t2 = sc.nextInt();
//			if(t1.equals("R")) {
//				for(int j = 0; j<cols; j++) {
//					if(arr[t2-1][j]=="G") {
//						arr[t2-1][j]="";
//					}else {
//						arr[t2-1][j]="G";
//					}
//				}
//			}else {
//				for(int j = 0; j<rows; j++) {
//					if(arr[j][t2-1]=="G") {
//						arr[j][t2-1]="";
//					}else {
//						arr[j][t2-1]="G";
//					}
//				}
//			}
//		}
//		String result = "";
//		for(String[] tempo : arr) {
//			result += String.join("", tempo).replaceAll("null", "");
//		}
//		System.out.println(result.length());
		
		
		
		
		
//		Set<String> ins = new HashSet<String>();
//		for(int i = 0; i<n; i++) {
//			String in = br.readLine();
//			if(ins.contains(in)) {
//				ins.remove(in);
//			}else {
//				ins.add(in);
//			}
//			
//		}
//		for(String s : ins) {
//			String t1 = s.split(" ")[0];
//			int t2 = Integer.parseInt(s.split(" ")[1]);
//			if(t1.equals("R")) {
//				for(int j = 0; j<cols; j++) {
//					if(arr[t2-1][j]=="G") {
//						arr[t2-1][j]="";
//					}else {
//						arr[t2-1][j]="G";
//					}
//				}
//			}else {
//				for(int j = 0; j<rows; j++) {
//					if(arr[j][t2-1]=="G") {
//						arr[j][t2-1]="";
//					}else {
//						arr[j][t2-1]="G";
//					}
//				}
//			}
//		}
//		String result = "";
//		for(String[] tempo : arr) {
//			result += String.join("", tempo);
//		}
//		System.out.println(result.length());
		
		
		
		Set<String> ins = new HashSet<String>();
		for(int i = 0; i<n; i++) {
			String in = br.readLine();
			if(ins.contains(in)) {
				ins.remove(in);
			}else {
				ins.add(in);
			}
			
		}
		int R = 0;
		int C = 0;
		for(String s : ins) {
			String t1 = s.split(" ")[0];
			int t2 = Integer.parseInt(s.split(" ")[1]);
			if(t1.equals("R")) {
				R++;
			}else {
				C++;
			}
		}
		int newR = (R*cols)-(C*R);
		int newC = (C*rows)-(C*R);
		int result = newC+newR;
		System.out.println(result);
	}
}
