package school1;

import java.util.*;

public class Array {

	public static long sum(int[] arr) {
		long sum = 0;
		Arrays.sort(arr);
		System.out.println("Ascending order: " + Arrays.toString(arr));
		int[] rev = new int[10];
		for(int i = 0; i<10; i++) {
			sum+=arr[i];
			rev[9-i] = arr[i];
		}
		System.out.println("Descending order: " + Arrays.toString(rev));
		return sum;
	}
	
	public static int minDist(int[] arr) {
		int min = Integer.MAX_VALUE;
		int pos = 0;
		for(int i = 0; i<arr.length-1; i++) {
			if(Math.abs(arr[i]-arr[i+1]) < min) {
				pos = i;
				min = Math.abs(arr[i]-arr[i+1]);
			}
		}
		return pos;
	}
	
	public static String reverseCharArr(char[] arr) {
		String result = "";
		for(int i = 0; i<arr.length; i++) {
			result += arr[arr.length-1-i];
		}
		return result;
	}	
	
	public static int[] countLetters(String str) {
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		int[] num = new int[59];
		for(int i = 0; i<str.length(); i++) {
			int a = ((int) str.charAt(i));
			System.out.println(a);
			num[a-65] += 1;
		}
		return num;
	}
	
	public static int[] mergeArr(int[] a, int[] b) {
		int[] c = Arrays.copyOf(a, a.length + b.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		Arrays.sort(c);
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean looper = true;
		while (looper) {
			// give the user a list of methods
			System.out.println("Choose from the following list of methods (type the number):");
			System.out.println("	1: sum");
			System.out.println("	2: minDist");
			System.out.println("	3: reverseCharArr");
			System.out.println("	4: countLetters");
			System.out.println("	5: mergeArr");
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
				System.out.println("Option chosen: sum");
				// explain
				System.out.println("Method input: int[] array of size 10");
				System.out.println("Method output: The array in ascending/descending order and the sum of all the ints");
				// prompt for input
				System.out.println("Enter 10 ints");
				int[] arr = new int[10];
				for(int i = 0; i < 10; i++) {
					System.out.println( (i != 0) ? "Input another number" : "");
					arr[i] = sc.nextInt();
				}
				// print
				System.out.println("Sum: " + sum(arr));
				break;

			case 2:
				System.out.println("Option chosen: minDist");
				// explain
				System.out.println("Method input: int[] arr");
				System.out.println("Method output: Finds two neighbouring numbers in an array with the smallest distance to each other.");
				// prompt for input
				System.out.println("Input the number of ints in the first array");
				int[] arr1 = new int[sc.nextInt()];
				for(int i = 0; i < arr1.length; i++) {
					System.out.println("Input a number");
					arr1[i] = sc.nextInt();
				}
				// print
				System.out.println("The smallest distance is between " + arr1[minDist(arr1)] + " and " + arr1[minDist(arr1)+1]);
				break;

			case 3:
				System.out.println("Option chosen: reverseCharArr");
				// explain
				System.out.println("Method input: char[] arr");
				System.out.println("Method output: Returns a string of the reversed char array");
				// prompt for input
				System.out.println("Input the number of chars in the array");
				char[] charArr = new char[sc.nextInt()];
				for(int i = 0; i < charArr.length; i++) {
					System.out.println("Input a char");
					charArr[i] = sc.next().charAt(0);
				}
				// print
				System.out.println("Reversed array: " + reverseCharArr(charArr));
				break;

			case 4:
				System.out.println("Option chosen: countLetters");
				// explain
				System.out.println("Method input: String phrase");
				System.out.println("Method output: Returns the number of occurences for each letter");
				// prompt for input
				System.out.println("Input the phrase");
				String trash = sc.nextLine();
				String phrase = sc.nextLine();
				// print
				int[] arr2 = countLetters(phrase);
				for(int i = 0; i < 59; i++) {
					char letter = (char) (i+65);
					int occurence = arr2[i];
					if(occurence>0) {
						System.out.print(letter + ":" + occurence + " ");
					}
				}
				break;

			case 5:
				System.out.println("Option chosen: mergeArr");
				// explain
				System.out.println("Method input: int[] a, int[] b");
				System.out.println("Method output: Returns the arrays merged and sorted");
				// prompt for input
				System.out.println("Input the number of ints in the first array");
				int[] numArr1 = new int[sc.nextInt()];
				for(int i = 0; i < numArr1.length; i++) {
					System.out.println("Input a number");
					numArr1[i] = sc.nextInt();
				}
				System.out.println("Input the number of ints in the second array");
				int[] numArr2 = new int[sc.nextInt()];
				for(int i = 0; i < numArr2.length; i++) {
					System.out.println("Input a number");
					numArr2[i] = sc.nextInt();
				}
				// print
				System.out.println("New array: " + Arrays.toString(mergeArr(numArr1, numArr2)));
				break;

			default:
				System.out.println("Option chosen: exit");
				// exit loop by setting looper to false
				looper = false;
				break;

			}
		}
		System.out.println("Goodbye :)");
	}

}
