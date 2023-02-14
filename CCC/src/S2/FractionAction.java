package S2;

import java.math.BigInteger;
import java.util.Scanner;

public class FractionAction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean toggle = false;
		String numerator = sc.nextInt() + " ";
		String denominator = sc.nextInt() + " ";
		double result = Double.parseDouble(numerator)/Double.parseDouble(denominator);
		String strRes = result + "";
		int withoutDecimal = (int) result;
		String decimal = "0." + strRes.substring(strRes.indexOf(".") + 1, strRes.length());
		if((double) withoutDecimal == Double.parseDouble(strRes)) {
			toggle = true;
		}
		if(toggle == true) {
			System.out.println(withoutDecimal);
		}else {
			if(withoutDecimal == 0) {
				System.out.println(convertype(Double.parseDouble(decimal)));
			}else {
				System.out.println(withoutDecimal + " " + convertype(Double.parseDouble(decimal)));
			}
		}
	}
	public static String convertype(double decimal){
	      int digitsAfterPoint = String.valueOf(decimal).length() - String.valueOf(decimal).indexOf('.')+1; // get the count of digits after the point // for example 0.75 has two digits
	      BigInteger numerator  = BigInteger.valueOf((long)(decimal*Math.pow(10, digitsAfterPoint))); // multiply 0.75 with 10^2 to get 75
	      BigInteger denominator = BigInteger.valueOf((long)(Math.pow(10, digitsAfterPoint)));       // 10^2 is your denominator
	      int gcd = numerator.gcd(denominator).intValue();                                           // calculate the greatest common divisor of numerator  and denominator
	      if (gcd > 1 ){                                                                             // gcd(75,100) = 25
	        return String.valueOf(numerator.intValue()/gcd) +"/"  + String.valueOf(denominator.intValue()/gcd);  // return 75/25 / 100/25 = 3/4
	      }
	      else{
	        return String.valueOf(numerator) +"/"  + String.valueOf(denominator);              // if gcd = 1 which means nothing to simplify just return numerator / denominator  
	      }      
	    }

}
