package J1;
import java.util.Scanner;

public class SpeedFinesAreNotFine {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the speed limit:");
		int num1 = sc.nextInt();
		System.out.print("Enter the recorded speed of the car:");
		int num2 = sc.nextInt();
		int dif = num2 - num1;
		if(num1 >= num2){
			System.out.println("Congratulations, you are within the speed limit!");
		}else if(dif >= 31){
			System.out.println("You are speeding and your fine is $500.");
		}else if(dif >= 21){
			System.out.println("You are speeding and your fine is $270.");
		}else{
			System.out.println("You are speeding and your fine is $100.");
		}
	}
}
