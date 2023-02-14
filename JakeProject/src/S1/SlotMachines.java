package S1;
import java.util.Scanner;

public class SlotMachines {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int machine1 = sc.nextInt();
		int machine2 = sc.nextInt();
		int machine3 = sc.nextInt();
		int num1 = machine1;
		int num2 = machine2;
		int num3 = machine3;
		int counter = 0;
		boolean toggle = false;
		while(!toggle){
			if(q>0){
				num1 += 1;
				q = q-1;
				counter++;
				if(num1 >= 35){
					q = q+30;
					num1 = num1 - 35;
				}
			}else{
				toggle = true;
			}
			if(q>0){
				num2 += 1;
				q = q-1;
				counter += 1;
				if(num2 >= 100){
					q = q+60;
					num2 -= 100;
				}
			}else{
				toggle = true;
			}
			if(q>0){
				num3 += 1;
				q = q-1;
				counter += 1;
				if(num3 >= 10){
					q = q+9;
					num3 -= 10;
				}
			}else{
				toggle = true;
			}
		}
		System.out.println("Martha plays " + counter + " times before going broke.");
	}
}