package section5Challenges;

public class DigitSumChallenge {

	public static int sumDigits(int num) {
		if(num >= 10) {
//			int ones = num % 10;
//			int hundreths = num / 100;
//			int tenths = num / 10 - hundreths * 10;
//			return ones + hundreths +tenths;
			int sum = 0;
			
			while(num > 0) {
				int digit = num % 10;
				sum+= digit;
				num /= 10;
			}
			return sum;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(sumDigits(17826287));
	}

}
