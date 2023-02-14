package J2;
import java.util.Scanner;

public class ShiftySum {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int looper = sc.nextInt();
		int ShiftedNum = num;
		for(int i =0; i<looper; i++){
			num = num*10;
			ShiftedNum += num;
		}
		System.out.println(ShiftedNum);
	}
}
