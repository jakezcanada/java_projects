package S2;

import java.util.Scanner;

public class FractionAction2 {

	public static long gcd(long a, long b)
    {
        if (a == 0)
            return b;
         
        return gcd(b%a, a);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		if(a == 0 || b == 0) {
			System.out.println(0);
			return;
		}
		long gcd = gcd(a, b);
		a = a/gcd;
		b = b/gcd;
		long first = (long) (a/b);
		if(first == 0) {
			System.out.println(a+"/"+b);
		}else if((a%b) > 0){
			System.out.println(first + " " + (a%b) + "/" + b);
		}else {
			System.out.println(first);
		}
	}

}
