package J1;

import java.util.Scanner;

public class DogTreats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		for(int i = 1; i<=3; i++) {
			result += i*sc.nextInt();
		}
		sc.close();
		if(result<10) {
			System.out.println("sad");
		}else {
			System.out.println("happy");
		}
	}

}
