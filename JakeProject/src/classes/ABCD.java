package classes;

import java.util.Scanner;

public class ABCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt();
		boolean looper = true;
		for(int A = 0; A<10; A++) {
			for(int B = 0; B<10; B++) {
				for(int C = 0; C<10; C++) {
					for(int D = 0; D<10; D++) {
						int num1 = A*1000+B*100+C*10+D;
						int num2 = A*100+B*10+C;
						int num3 = A*10+B;
						int num4 = A;
						if(num1+num2+num3+num4 == sum) {
							System.out.println("Working Combo:");
							System.out.println("A = " + A);
							System.out.println("B = " + B);
							System.out.println("C = " + C);
							System.out.println("D = " + D);
							looper = false;
							break;
						}
					}
					if(!looper) {
						break;
					}
				}
				if(!looper) {
					break;
				}
			}
			if(!looper) {
				break;
			}
		}
	}

}
