import java.util.Scanner;

public class DontPassMeTheBall {
	public static long numOfWays(long num){
		if(num < 4){
			return 0;
		}else{
			long count = 0;
			for(long i = num-1; i>2; i--){
				for(long j = i-1; j>1; j--){
					for(long k = j-1; k>0; k--){
						count++;
					}
				}
			}
			return count;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		System.out.println(numOfWays(num));
	}
}
