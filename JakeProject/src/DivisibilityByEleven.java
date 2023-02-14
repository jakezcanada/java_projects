import java.util.*;

public class DivisibilityByEleven {
	private final static long LONG_MASK = 0xffffffffL;
	
	public static int[] minus(int[] big, int[] little) {
		int bigIndex = big.length;
		int result[] = new int[bigIndex];
		int littleIndex = little.length;
		long difference = 0;

		// Subtract common parts of both numbers
		while (littleIndex > 0) {
			difference = (big[--bigIndex] & LONG_MASK) - (little[--littleIndex] & LONG_MASK) + (difference >> 32);
			result[bigIndex] = (int) difference;
		}

		// Subtract remainder of longer number while borrow propagates
		boolean borrow = (difference >> 32 != 0);
		while (bigIndex > 0 && borrow)
			borrow = ((result[--bigIndex] = big[bigIndex] - 1) == -1);

		// Copy remainder of longer number
		while (bigIndex > 0)
			result[--bigIndex] = big[bigIndex];

		return result;
	}

	public static String subtract(String bigNumber, String LittleNumber) {
		String output = "";
		int[] big = new int[bigNumber.length()];
		int[] little = new int[LittleNumber.length()];
		for (int i = 0; i < bigNumber.length(); i++) {
			big[i] = Integer.parseInt(bigNumber.charAt(i) + "");
		}

		for (int i = 0; i < LittleNumber.length(); i++) {
			little[i] = Integer.parseInt(LittleNumber.charAt(i) + "");
		}
		int[] result = minus(big, little);

		for (int i = 0; i < result.length; i++) {
			int orgResult = result[i];
			if (orgResult < 0) {

				if (big[i] == 0) {
					result[i] = 10 + orgResult;
				} else {

					//result[i] = big[i] + orgResult;
					if (result[i] < 0) {
						result[i] = 10 + orgResult;
					}
				}
			}
			output = output + result[i];
		}

		return output.replaceFirst("^0+(?!$)", "");
	}
	public static void checkDivisibleBy11(String input, String origInput){

			int intInput = Integer.parseInt(input);
			if (intInput%11==0) {
				System.out.println("The number " + origInput + " is divisible by 11.");
			} else {
				System.out.println("The number " + origInput + " is not divisible by 11.");
			}
		
	}
	public static void calc(String input){
		String substituteInput = input;
		String part1;
		String part2;
		String part3;
		int num1 = 0;
		System.out.println(input);
		
		if(input.length()==2){
			checkDivisibleBy11(input,input);
		}
		else{
		
		
			for (int i = 0; i < input.length(); i++) {
				part2 = substituteInput.substring(substituteInput.length() - 1, substituteInput.length());
				part3 = substituteInput.substring(0, substituteInput.length() - 1);
	
					part1 = subtract(part3, part2);
					substituteInput = part1;			
						
				
				if (part1.length() <= 2) {
					System.out.println(part1 + "");
					checkDivisibleBy11(part1,input);
					break;
				} else {
					System.out.println(part1 + "");
					substituteInput = part1;
				}
			}
		}
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long numOfLines = sc.nextLong();
		List<String> inputs = new ArrayList<String> ();

		for(int i = 0; i < numOfLines; i++){
			String input = sc.next();
			inputs.add(input);
		}
		
		
		for(String i : inputs){
			calc(i);
		}
	}
}
