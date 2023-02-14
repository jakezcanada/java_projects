package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PresentChecking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Set<String> mySet = new HashSet<String>(Arrays.asList(br.readLine().split(" ")));
		System.out.println((mySet.size()<n)?"NO":"YES");
	}

}
