import java.util.Scanner;

public class GoodTimes {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a + " in Ottawa");
		System.out.println((a-300) + " in Victoria");
		System.out.println((a-200) + " in  Edmonton");
		System.out.println((a-100) + " in Winnipeg");
		System.out.println(a + " in Toronto");
		System.out.println((a+100) + " in Halifax");
		System.out.println((a+130) + " in St. John's");
	}
}
