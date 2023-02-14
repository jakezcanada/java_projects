import java.util.*;

public class NumberSystem {
	public int decimalToBinary(int dec){
		List<Integer> myList = new ArrayList<Integer>();
		while(dec>0){
			int rem = dec%2;
			myList.add(rem);
			dec = dec/2;
		}
		Collections.reverse(myList);
		String binary = myList.toString().replace("[","").replace("]", "").replace(",", "").replace(" ", "");
		int result = Integer.parseInt(binary);
		return result;
	}
	public int BinaryToDecimal(int bin){
		String str = bin+"";
		int result = Integer.parseInt(str, 2);
		return result;
	}
	public void outputAgain(){
		System.out.println("abcdefghijklmnopqrstuvwxyz");
		System.out.println("ZYXWVUTSRQPONMLKJIHGFEDCBA");
	}
	public void outputThree( char begin, char end ){
		while(begin!=end+1){
			String str = begin+"";
			begin = (char) (begin+1);
		}
	}
	public void outputFour( char begin){
		char end = (char) (begin-1);
		while(begin != end){
			
		}
	}
	public char convert(char ch){ 
		String converted = ch+"";
		String result = converted.toLowerCase();
		if(converted.equals(result)){
			result = converted.toUpperCase();
		}
		return result.charAt(0);
	}
	public static void main(String[] args) {
		NumberSystem ns = new NumberSystem();
		int numBasedTwo = ns.decimalToBinary(97);
		int num1 = ns.BinaryToDecimal(111011);
		System.out.println(num1 + "    " + numBasedTwo);
	}

}
