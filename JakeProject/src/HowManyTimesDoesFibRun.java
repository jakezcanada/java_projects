import java.util.Scanner;

public class HowManyTimesDoesFibRun {

	static int target;
	static int c;
	 public static long fib(int n) {
	        if (n == target){
	        	c++;
	        }
	        	return fib(n-1) + fib(n-2);
	    }

	    public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int num1 = 4;
	        target = sc.nextInt();
	        fib(num1);
	        System.out.println(c);
	    }

}
