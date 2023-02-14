import java.util.Scanner;

public class Multiply {
		 public static void main(String args[]){
			 Scanner sc = new Scanner(System.in);
			 int n = sc.nextInt();
			 int sum = 0;
			 int product = 1;
			 for(int i = 1; i<=n; i++){
				 product *= i;
				 sum += product;
			 }
			 System.out.println(sum);
		 }

}
