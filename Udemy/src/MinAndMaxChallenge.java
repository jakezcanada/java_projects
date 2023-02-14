import java.util.Scanner;

public class MinAndMaxChallenge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int count = 0;
		while(true){
			System.out.println("Enter Number : ");
			boolean check = sc.hasNextInt();
			if(check){
				int num = sc.nextInt();
				if(count == 0){
					min = num;
					max = num;
					count++;
				}else{
					if(num>max){
						max = num;
					}
					if(num<min){
						min = num;
					}
				}
			}else{
				break;
			}
		}
		System.out.println("Minimum = " + min);
		System.out.println("Maximum = " + max);

	}

}
