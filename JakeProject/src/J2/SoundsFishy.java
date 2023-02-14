package J2;
import java.util.Scanner;

public class SoundsFishy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		if(num4 > num3 && num3 > num2 && num2 > num1){
			System.out.println("Fish Rising");
		}else if(num4 == num3 && num3 == num2 && num2 == num1){
			System.out.println("Fish At Constant Depth");
		}else if(num4 < num3 && num3 < num2 && num2 < num1){
			System.out.println("Fish Diving");
		}else{
			System.out.println("No Fish");
		}
	}

}
