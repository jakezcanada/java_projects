package J2;
import java.util.Scanner;

public class AmeriCandian {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			if(str.equals("quit!")){
				break;
			}else{
				if(str.length()>4){
					String checkConsonant = str.substring(str.length()-3, str.length()-2);
					if(checkConsonant.equals("a") || checkConsonant.equals("e") || checkConsonant.equals("i") || checkConsonant.equals("o") || checkConsonant.equals("u") || checkConsonant.equals("y")){
						//3rd last letter is a consonant, don't change it
						System.out.println(str);
					}else{
						//3rd last letter is consonant, proccess it into Canadian spelling
						if(str.substring(str.length()-2, str.length()).equals("or")) {
							String first = str.substring(0, str.length()-3);
							String completeStr = first+checkConsonant+"our";
							System.out.println(completeStr);
						}else {
							System.out.println(str);
						}
					}
				}else{
					System.out.println(str);
				}
			}
		}
	}
}
