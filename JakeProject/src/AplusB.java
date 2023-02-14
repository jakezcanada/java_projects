import java.util.*;

public class AplusB {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int looper = sc.nextInt();
		for(int i = 0; i < looper; i++){
			long a = sc.nextLong();
			long b = sc.nextLong();
			long sum = a + b;
			System.out.println(sum);
		}
		
	} 
}
