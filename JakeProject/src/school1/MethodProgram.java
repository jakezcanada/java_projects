package school1;

import java.util.Scanner;

public class MethodProgram {

	public static int product(int x, int y) {
		// line below returns the product
		return x * y;
	}

	public static double toFahrenheit(int c) {
		// line below returns the celcius converted to fahrenheit
		return ((double) c) * (9.0 / 5.0) + 32.0;
	}

	public static double toCelsius(int f) {
		// line below returns the fahrenheit converted to celcius
		return ((double) (f - 32)) * (5.0 / 9.0);
	}

	public static double bacteria(int i, int t) {
		// line below returns the population of the bacteria after t hours
		return i * Math.pow(2, t);
	}

	public static int coins(int amount) {
		int q = (int) (amount / 25); // number of quarters
		int d = (int) ((amount - (q * 25)) / 10); // number of dimes
		int n = (int) ((amount - (q * 25) - (d * 10)) / 5); // number of nickels
		int p = amount - (q * 25) - (d * 10) - (n * 5); // number of pennies
		// print
		System.out.println("Quarters: " + q);
		System.out.println("Dimes: " + d);
		System.out.println("Nickels: " + n);
		System.out.println("Pennies: " + p);
		// line below returns the least amount of coins needed total
		return q + d + n + p;
	}

	public static int cookie(int num) {
		int c = (int) (num / 72); // number of cartons
		int b = (int) ((num - (c * 72)) / 12); // number of boxes
		int s = num - (c * 72) - (b * 12); // number of singlular cookies
		// print
		System.out.println("Num Of Cartons: " + c);
		System.out.println("Num Of Boxes: " + b);
		System.out.println("Num Of Singlular Cookies: " + s);
		// line below returns the cost of the cookies in cents
		return (c * 864) + (b * 180) + (s * 25);
	}

	public static double distance(int x1, int y1, int x2, int y2) {
		// line below returns the distance between 2 points using the pythagorean theorem
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

	public static int dayOfWeek(int m, int d, int y) {
		// calculates the day of the week
		int y0 = y - (14 - m) / 12;
		int x = (int) (y0 + (y0 / 4) - (y0 / 100) + (y0 / 400));
		int m0 = m + (12 * ((14 - m) / 12)) - 2;
		int d0 = (int) (d + x + ((31 * m0) / 12));
		return d0 % 7;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean looper = true;
		while (looper) {
			// give the user a list of methods
			System.out.println("Choose from the following list of methods (type the number):");
			System.out.println("	1: product");
			System.out.println("	2: toFahrenheit");
			System.out.println("	3: toCelsius");
			System.out.println("	4: bacteria");
			System.out.println("	5: coins");
			System.out.println("	6: cookie");
			System.out.println("	7: distance");
			System.out.println("	8: dayOfWeek");
			System.out.println("	Other: exit program");
			int input;
			// check if user entered an int or other
			if (sc.hasNextInt()) {
				input = sc.nextInt();
			} else {
				System.out.println("Option chosen: exit");
				break;
			}
			// switch case depending on user input
			switch (input) {
			case 1:
				System.out.println("Option chosen: product");
				// explain
				System.out.println("Method input: int a, int b");
				System.out.println("Method output: the product of a and b");
				// prompt for input
				System.out.println("Input the first number");
				int a = sc.nextInt();
				System.out.println("Input the second number");
				int b = sc.nextInt();
				// print
				System.out.println("Your product is " + product(a, b));
				break;

			case 2:
				System.out.println("Option chosen: toFahrenheit");
				// explain
				System.out.println("Method input: int celcius");
				System.out.println("Method output: celcius converted to fahrenheit");
				// prompt for input
				System.out.println("Input the temperature in celcius");
				// print
				System.out.println("In fahrenheit, that is " + toFahrenheit(sc.nextInt()));
				break;

			case 3:
				System.out.println("Option chosen: toCelcius");
				// explain
				System.out.println("Method input: int fahrenheit");
				System.out.println("Method output: fahrenheit converted to celcius");
				// prompt for input
				System.out.println("Input the temperature in celcius");
				// print
				System.out.println("In celcius, that is " + toCelsius(sc.nextInt()));
				break;

			case 4:
				System.out.println("Option chosen: bacteria");
				// explain
				System.out.println("Method input: int i, int t");
				System.out.println("Method output: the amount of bacteria, initially i, after t hours");
				System.out.println("(bacteria doubles every hour)");
				// prompt for input
				System.out.println("Input the inital amount of bacteria");
				int i = sc.nextInt();
				System.out.println("Input the time in hours");
				int t = sc.nextInt();
				// print
				System.out.println("There will be " + bacteria(i, t) + " bacteria after " + t + " hours");
				break;

			case 5:
				System.out.println("Option chosen: coins");
				// explain
				System.out.println("Method input: int c");
				System.out.println("Method output: the least amount of quarters, dimes, nickels and pennies needed to make c");
				// prompt for input
				System.out.println("Input your amount in cents");
				// print
				System.out.println("Least amount of coins to make that amount: " + coins(sc.nextInt()));
				break;

			case 6:
				System.out.println("Option chosen: cookie");
				// explain
				System.out.println("Method input: int c");
				System.out.println("Method output: the cost of c cookies");
				System.out.println("A single cookie costs 25 cents.");
				System.out.println("A box of 12 cookies costs 180 cents.");
				System.out.println("A carton of 6 boxes of cookies (72 cookies) costs 864 cents.");
				// prompt for input
				System.out.println("Input your number of cookies");
				// print
				System.out.println("It is going to cost " + cookie(sc.nextInt()) + " cents");
				break;

			case 7:
				System.out.println("Option chosen: distance");
				// explain
				System.out.println("Method input: int x1, int y1, int x2, int y2");
				System.out.println("Method output: the distance between (x1, y1) and (x2, y2)");
				// prompt for input
				System.out.println("Input x1");
				int x1 = sc.nextInt();
				System.out.println("Input y1");
				int y1 = sc.nextInt();
				System.out.println("Input x2");
				int x2 = sc.nextInt();
				System.out.println("Input y2");
				int y2 = sc.nextInt();
				// print
				System.out.println("The distance is " + distance(x1, y1, x2, y2) + " units");
				break;

			case 8:
				System.out.println("Option chosen: dayOfWeek");
				// explain
				System.out.println("Method input: int month, int day, int year");
				System.out.println("Method output: the day of the week ");
				// prompt for input
				System.out.println("Input the month");
				int m = sc.nextInt();
				System.out.println("Input the day");
				int d = sc.nextInt();
				System.out.println("Input the year");
				int y = sc.nextInt();
				// print
				int day = dayOfWeek(m, d, y);
				String dayStr = "";
				switch (day) {
				case 0:
					dayStr = "Sunday";
					break;
				case 1:
					dayStr = "Monday";
					break;
				case 2:
					dayStr = "Tuesday";
					break;
				case 3:
					dayStr = "Wednesday";
					break;
				case 4:
					dayStr = "Thursday";
					break;
				case 5:
					dayStr = "Friday";
					break;
				case 6:
					dayStr = "Saturday";
					break;
				}
				// print
				System.out.println("It is a " + dayStr + " that day");
				break;

			default:
				System.out.println("Option chosen: exit");
				// exit loop by setting looper to false
				looper = false;
				break;

			}
		}
	}

}
