package J4;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		a = a.replaceAll(" ", "");
		b = b.replaceAll(" ", "");
		String[] str1 = a.split("");
		String[] str2 = b.split("");
		Arrays.sort(str1);
		Arrays.sort(str2);
		if(str1.length != str2.length){
			System.out.println("Is not an anagram.");
		}else{
			boolean toggle = false;
			for(int i = 0; i<str1.length; i++){
				if(!str1[i].equals(str2[i])){
					toggle = true;
					break;
				}
			}
			if(toggle){
				System.out.println("Is not an anagram.");
			}else{
				System.out.println("Is an anagram.");
			}
		}
	}

}
