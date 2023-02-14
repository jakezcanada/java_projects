package J1;
import java.util.Scanner;

public class Calender {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int days = sc.nextInt();
		System.out.println("Sun Mon Tue Wed Thr Fri Sat");
		int spaces = ((start-1)*3)+start-1;
		for(int i = 0; i<spaces; i++){
			System.out.print(" ");
		}
		int count = 0;
		for(int i = 0; i<days; i++){
			count++;
			if(count>=10){
				System.out.print(" " + count);
			}else{
				System.out.print("  " + count);
			}
			if((count+(start-1))%7==0){
				System.out.println();
			}else if(i != days-1){
				System.out.print(" ");
			}else {
				System.out.println();
			}
		}
	}
}
