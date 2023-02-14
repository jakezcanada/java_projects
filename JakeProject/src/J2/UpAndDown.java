package J2;
import java.util.Scanner;

public class UpAndDown {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
		int nikky = (a-b)*((s-(s%(a+b)))/(a+b));
		if(s%(a+b)>a) {
			nikky-=(s%(a+b))-a;
		}else {
			nikky+=s%(a+b);
		}
		int byron = (c-d)*((s-(s%(c+d)))/(c+d));
		if(s%(c+d)>c) {
			byron-=(s%(c+d))-c;
		}else {
			byron+=s%(c+d);
		}
		if(byron > nikky){
			System.out.println("Byron");
		}else if(nikky > byron){
			System.out.println("Nikky");
		}else{
			System.out.println("Tied");
		}
	}
}