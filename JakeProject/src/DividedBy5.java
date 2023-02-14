import java.util.*;

public class DividedBy5 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int remainder = num%5;
		if(remainder == 0){
			System.out.println("ZERO");
		}
		if(remainder == 1){
			System.out.println("ONE");
		}
		if(remainder == 2){
			System.out.println("TWO");
		}
		if(remainder == 3){
			System.out.println("THREE");
		}
		if(remainder == 4){
			System.out.println("FOUR");
		}
	}
}
