import java.util.Scanner;

public class BigBangSecrets {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String str = sc.next();
		String str2 = "";
		for(int i =0; i<str.length(); i++){
			char letter = str.charAt(i);
			int ascii = (int) letter;
			int position = i+1;
			int shiftAmount = num * position + num;
			ascii = ascii - shiftAmount;
			if(ascii<65){
				int temp = 65-ascii;
				ascii = 91-temp;
			}
			letter = (char) ascii;
			str2 = str2 + letter;
		}
		System.out.println(str2);
	}
}
