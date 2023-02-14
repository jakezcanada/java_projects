package S4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BloodDistribution {
	
	public static Map<String, Integer> availableBlood = new HashMap<String, Integer>();
	public static Map<String, Integer> patients = new HashMap<String, Integer>();
	public static String[] bloodTypes = {"O-", "O+", "A-", "A+", "B-", "B+", "AB-", "AB+"};
	
	public static int calc(String type, String c){
		int aB = availableBlood.get(c);
		int p = patients.get(type);
		availableBlood.put(c, ((aB > p) ? aB - p : 0));
		patients.put(type, ((aB > p) ? 0 : p - aB));
		return p - patients.get(type);
	}
	
	public static int giveBlood(String type, String c){
		int bloodGiven = 0;
		int temp = 0;
		int aB;
		int p;
		switch(c){
		case "O-":
			return calc(type, c);
		case "O+":
			bloodGiven += calc(type, c);
			bloodGiven += calc(type, "O-");
			return bloodGiven;
		case "A-":
			bloodGiven += calc(type, c);
			bloodGiven += calc(type, "O-");
			return bloodGiven;
		case "A+":
			bloodGiven += calc(type, c);
			bloodGiven += calc(type, "A-");
			bloodGiven += giveBlood(type, "O+");
			return bloodGiven;
		case "B-":
			bloodGiven += calc(type, c);
			bloodGiven += calc(type, "O-");
			return bloodGiven;
		case "B+":
			bloodGiven += calc(type, c);
			bloodGiven += calc(type, "B-");
			bloodGiven += giveBlood(type, "O+");
			return bloodGiven;
		case "AB-":
			bloodGiven += calc(type, c);
			bloodGiven += calc(type, "A-");
			bloodGiven += calc(type, "B-");
			bloodGiven += calc(type, "O-");
			return bloodGiven;
		case "AB+":
			bloodGiven += calc(type, c);
			bloodGiven += giveBlood(type, "AB-");
			bloodGiven += calc(type, "A+");
			bloodGiven += calc(type, "B+");
			bloodGiven += calc(type, "O+");
			return bloodGiven;
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] in1 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] in2 = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		for(int i = 0; i < 8; i++){
			availableBlood.put(bloodTypes[i], in1[i]);
			patients.put(bloodTypes[i], in2[i]);
		}
		int totalPatients = 0;
		for(String str : bloodTypes){
			totalPatients += giveBlood(str, str);
		}
		System.out.println(totalPatients);
	}
}
