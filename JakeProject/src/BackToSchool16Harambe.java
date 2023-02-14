import java.util.*;

public class BackToSchool16Harambe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch;
		int uppercase = 0, lowercase = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			int asciivalue = (int) ch;
			if (asciivalue >= 65 && asciivalue <= 90) {
				uppercase++;
			} else if (asciivalue >= 97 && asciivalue <= 122) {
				lowercase++;
			}
		}
		if(uppercase==lowercase){
			System.out.println(str);
		}else if(uppercase>lowercase){
			System.out.println(str.toUpperCase());
		}else{
			System.out.println(str.toLowerCase());
		}
	}
}
