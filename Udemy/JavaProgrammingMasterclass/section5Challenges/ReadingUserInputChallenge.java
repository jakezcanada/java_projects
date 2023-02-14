package section5Challenges;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		while(true) {
			System.out.println("Enter number #" + count + ": ");
			if(sc.hasNextInt()) {
				sum += sc.nextInt();
				count++;
				if(count==11) {
					break;
				}
			}else {
				System.out.println("Invalid Number");
			}
			sc.nextLine();
		}
		sc.close();
		
		System.out.println(sum);
	}

}
