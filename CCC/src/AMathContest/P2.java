package AMathContest;

import java.util.Scanner;
import java.math.BigInteger;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cuck = sc.nextInt();
		long num = 0;
		for(int i = 0; i < cuck; i++)
			num += sc.nextLong();
		BigInteger a = new BigInteger("2");
		System.out.println(a.pow(cuck-1).multiply(BigInteger.valueOf(num)).mod(BigInteger.valueOf(1000000007)).toString());
	}
}
