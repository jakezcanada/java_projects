import java.util.*;

public class work {
	private static boolean isPalindrome(String str) {    
	    int n = str.length();
	    for( int i = 0; i < n/2; i++ )
	        if (str.charAt(i) != str.charAt(n-i-1)) return false;
	    return true;    
	}
	private static String longestName(List<String> names){
		String longestName = "";
		String s = names.get(0);
		int previousSize = s.length();
		longestName = s;
		for(int i = 0; i<names.size(); i++){
			String str = names.get(i);
			int currentSize = str.length();
			if(previousSize < currentSize){
				longestName = str;
			}
		}
		return longestName;
	}
	private static String palindrome(List<String> names){
			String palindrome = "";
			List<String> myList = new ArrayList<String>();
			for(int i = 0; i<names.size(); i++){
				String str = names.get(i);
				if(isPalindrome(str)){
					myList.add(str);
				}
			}
			String str = Arrays.toString(myList.toArray()).replace("[", "").replace("]", "").replace(",", "\n").replace(" ", "");
			return str;
		}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<String> names = new ArrayList<String>();
		names.add("tommy");
		names.add("charlie");
		names.add("joey");
		names.add("bob");
		names.add("andna");
		String str = palindrome(names);
		System.out.println(str);
	}
}