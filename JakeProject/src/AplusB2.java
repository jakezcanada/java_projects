import java.util.*;

public class AplusB2 {
	
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
	
	
	
    private static int[] add(int[] x, int[] y) {
        // If x is shorter, swap the two arrays
        if (x.length < y.length) {
            int[] tmp = x;
            x = y;
            y = tmp;
        }

        int xIndex = x.length;
        int yIndex = y.length;
        int result[] = new int[xIndex];
        long sum = 0;

        // Add common parts of both numbers
        while(yIndex > 0) {
            sum = (x[--xIndex] & LONG_MASK) +
                  (y[--yIndex] & LONG_MASK) + (sum >>> 32);
            result[xIndex] = (int)sum;
        }

        // Copy remainder of longer number while carry propagation is required
        boolean carry = (sum >>> 32 != 0);
        while (xIndex > 0 && carry)
            carry = ((result[--xIndex] = x[xIndex] + 1) == 0);

        // Copy remainder of longer number
        while (xIndex > 0)
            result[--xIndex] = x[xIndex];

        // Grow result if necessary
        if (carry) {
            int newLen = result.length + 1;
            int temp[] = new int[newLen];
            for (int i = 1; i<newLen; i++)
                temp[i] = result[i-1];
            temp[0] = 0x01;
            result = temp;
        }
        return result;
    }
    
    
    private static int intArrayCmp(int[] arg1, int[] arg2) {
        if (arg1.length < arg2.length)
            return -1;
        if (arg1.length > arg2.length)
            return 1;

        // Argument lengths are equal; compare the values
        for (int i=0; i<arg1.length; i++) {
            long b1 = arg1[i] & LONG_MASK;
            long b2 = arg2[i] & LONG_MASK;
            if (b1 < b2)
                return -1;
            if (b1 > b2)
                return 1;
        }
        return 0;
    }
	public static String add(String bigNumber, String littleNumber) {
		String output = "";
		String incomingBigNumber = bigNumber;
		String incomingLittleNumber = littleNumber;
		
		
		String incomingBigNumberTemp = bigNumber.replaceAll("-", "");
		String incomingLittleNumberTemp = littleNumber.replaceAll("-", ""); 
		//int bigNumberLen = incomingBigNumber.indexOf("-")!=-1? incomingBigNumber.length()-1:incomingBigNumber.length();
		
		//int littleNumberLen = incomingLittleNumber.indexOf("-")!=-1? incomingLittleNumber.length()-1:incomingLittleNumber.length();

		int[] tempInt1 = new int[incomingBigNumberTemp.length()];
		int[] tempInt2 = new int[incomingLittleNumberTemp.length()];

		for (int i = 0; i < incomingBigNumberTemp.length(); i++) {
			
			tempInt1[i] = Integer.parseInt(incomingBigNumberTemp.charAt(i) + "");
		}

		for (int i = 0; i < incomingLittleNumberTemp.length(); i++) {
			
			tempInt2[i] = Integer.parseInt(incomingLittleNumberTemp.charAt(i) + "");
		}	
		
		
		
		boolean addingNegativeSign = false;
		if (incomingBigNumber.indexOf("-")!=-1 && incomingLittleNumber.indexOf("-")!=-1){
			incomingBigNumber = incomingBigNumber.substring(1,incomingBigNumber.length());
			incomingLittleNumber = incomingLittleNumber.substring(1,incomingLittleNumber.length());
			addingNegativeSign = true;
		}else if(incomingBigNumber.indexOf("-")!=-1 ){
			incomingBigNumber = incomingBigNumber.substring(1,incomingBigNumber.length());

			if(intArrayCmp(tempInt1,tempInt2)==1){
				return "-"+subtract(incomingBigNumber,incomingLittleNumber);
			}else if (intArrayCmp(tempInt1,tempInt2)==-1){
				return subtract(incomingLittleNumber,incomingBigNumber);
			}else{
				return "0";
			}

		}else if(incomingLittleNumber.indexOf("-")!=-1){
			incomingLittleNumber = incomingLittleNumber.substring(1,incomingLittleNumber.length());

			if(intArrayCmp(tempInt1,tempInt2)==1){
				return subtract(incomingBigNumber,incomingLittleNumber);
			}else if (intArrayCmp(tempInt1,tempInt2)==-1){
				return "-"+subtract(incomingLittleNumber,incomingBigNumber);
			}else{
				return "0";
			}
		}
		
		
		
/*		if(incomingLittleNumber.indexOf("-")!=-1){
			
			return subtract(incomingBigNumber,incomingLittleNumber.substring(1, incomingLittleNumber.length()));
		}*/
		int[] big = new int[incomingBigNumber.length()];
		int[] little = new int[incomingLittleNumber.length()];
		for (int i = 0; i < incomingBigNumber.length(); i++) {
			big[i] = Integer.parseInt(incomingBigNumber.charAt(i) + "");
		}

		for (int i = 0; i < incomingLittleNumber.length(); i++) {

			little[i] = Integer.parseInt(incomingLittleNumber.charAt(i) + "");
		}
		int[] result = add(big, little);

		for (int i = result.length-1; i >= 0; i--) {
			int orgResult = result[i];
			if (orgResult >9 &&  i!=0) {
				result[i-1] = result[i-1]+ 1;
				 result[i] =result[i]-10;
			}
			

			output = result[i]+output ;
		}
		if (addingNegativeSign){
			output = "-"+output;
		}
		return output.replaceFirst("^0+(?!$)", "");
	}
    
    
	public static void main(String args[]){
		
		
		//System.out.println(((-9)+(8)));
		String int1="-70068748648089964095366775575439356316939036524425736407521394130211944956423918105067766420951531330507454319289613902205995445741634154512459247091739188890605552643800641020980364988738729";
		String int2="-222905685435433566779232281256154059675086043605133936653188091842837695042588711300521532129209213172790306904754454472694841754265133256250030927646658595431057780131573601741531457297004238578934467598226224128480833320412135058755346771161701267171795172997004462796158826271586598640556631263285499";
		String sum = add(int1,int2);
		System.out.println(sum);
/*		int [] int1 ={9,0,0};
		int[] int2 ={1,0,0,9};
		String sum = add("100","-9999");
		System.out.println(sum);
		//String sum = add("-100","800");
		//System.out.println(intArrayCmp(int1,int2));
		//226077045628835347875 -572260769919042128358
		//-803119834418378628674 236083700054616110639
*/		
/*		Scanner sc = new Scanner(System.in);
		long looper = sc.nextInt();
		for(int i = 0; i < looper; i++){
			String a = sc.next();
			String b = sc.next();	
			String sum = add(a,b);
			System.out.println(sum);
		}*/
	}
}
