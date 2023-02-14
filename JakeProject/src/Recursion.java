
public class Recursion {
	public static int findSum(int n){
		if(n==1) return 1;
		return findSum(n-1) + n;
	}
	public static void main(String[] args) {
		int result = findSum(5);
		System.out.println(result);
	}

}
