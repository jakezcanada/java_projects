package J2;
import java.util.Scanner;

public class RotatingLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(str.matches("^[IOSHZXN]+$")){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}

}
