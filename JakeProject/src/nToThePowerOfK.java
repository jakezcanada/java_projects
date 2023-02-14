import java.util.*;

public class nToThePowerOfK {
	
	static long power(long num, long k){
		long result = 1;
		for(int i = 0; i<k; i++){
			result *= num; 
		}
		return result;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long looper = sc.nextLong();
		List<Long> myList = new ArrayList<Long>();
		for(long i = 0; i<looper; i++){
			long a = sc.nextInt();
			long b = sc.nextInt();
			long res = power(a,b);
			myList.add(res);
		}
		String lastString = myList.toString().replace(",", "\n").replace("[", "").replace("]", "").replace(" ", "").trim();
		System.out.println(lastString);
	}
}
