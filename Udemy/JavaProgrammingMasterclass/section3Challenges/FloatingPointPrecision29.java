package section3Challenges;

import java.util.Scanner;

public class FloatingPointPrecision29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of pounds :");
		double a = sc.nextDouble();
		double b = a * 0.45359237;
		System.out.println("That is " + b + " kilograms");
	}

}
