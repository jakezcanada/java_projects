import java.util.*;

public class ecdsce {
	public int test = 0;
	static int findSumOfDigits(int n){
		return n == 0 ? 0 : n % 10 + findSumOfDigits(n/10);
	}
	static public boolean primes(int x)
	{
		int i = x/2;
	    if(i==1)
	        return false;
	    if(x%i==0)
	        return true;
	    else
	        return primes(x);
	}
	static double areaOfTrapezoid(double top, double bottom, double h){
		double area = (top+bottom)*h/2;
		return area;
	}
	static double areaOfTriangle(double top, double bottom){
		double area = (top*bottom)/2;
		return area;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		//int a = sc.nextInt();
		//boolean b = primes(a);
		//double c = sc.nextInt();
		//double d = areaOfTrapezoid(a,b,c);
		System.out.println(nums.length-1);
	}
}
