package S3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Spreadsheet {
	
	public static String[][] sheet;
	public static int[][] finalSheet;
	public static Set<String> v = new HashSet<String>();
	
	public static int calc(String in){
		if(isNumeric(in)){
			return Integer.parseInt(in);
		}else if(in.contains("+")){
			String[] arr = in.split("\\+");
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				String[] temp = arr[i].split("");
				int k = strToInt(temp[0]);
				int j = Integer.parseInt(temp[1])-1;
				if(finalSheet[k][j] != -1){
					if(finalSheet[k][j] == -2)
						return -2;
					sum += finalSheet[k][j];
					continue;
				}
				v.add(k + " " + j);
				finalSheet[k][j] = calc(sheet[k][j]);
				if(finalSheet[k][j] == -2)
					return -2;
				sum += finalSheet[k][j];
			}
			return sum;
		}else{
			//just a single call
			String[] temp = in.split("");
			int i = strToInt(temp[0]);
			int j = Integer.parseInt(temp[1])-1;
			if(finalSheet[i][j] != -1){
				if(finalSheet[i][j] == -2)
					return -2;
				return finalSheet[i][j];
			}
			if(v.contains(i + " " + j))
				return -2;
			v.add(i + " " + j);
			return calc(sheet[i][j]);
		}
	}
	
	public static int strToInt(String in){
		switch (in) {
		case "A":
			return 0;
		case "B":
			return 1;
		case "C":
			return 2;
		case "D":
			return 3;
		case "E":
			return 4;
		case "F":
			return 5;
		case "G":
			return 6;
		case "H":
			return 7;
		case "I":
			return 8;
		case "J":
			return 9;
		default:
			return 0;
		}
	}
	
	public static boolean isNumeric(String str) { 
		try {  
			Double.parseDouble(str);  
			return true;
		} catch(NumberFormatException e){  
			return false;  
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sheet = new String[10][9];
		finalSheet = new int[10][9];
		for (int i = 0; i < sheet.length; i++) {
			sheet[i] = br.readLine().split(" ");
		}
		for(int[] arr : finalSheet){
			Arrays.fill(arr, -1);
		}
		for (int i = 0; i < sheet.length; i++) {
			for (int j = 0; j < sheet[0].length; j++) {
				String curr = sheet[i][j];
				if(finalSheet[i][j] == -1){
					finalSheet[i][j] = calc(curr);
					v.add(i + " " + j);
				}
				if(finalSheet[i][j] == -2){
					System.out.print("* ");
				}else if(finalSheet[i][j] == 0){
					System.out.print("0 ");
				}else{
					System.out.print(finalSheet[i][j]+" ");
				}
			}
			System.out.println();
		}
	}
}
