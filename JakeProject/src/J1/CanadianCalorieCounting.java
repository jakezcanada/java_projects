package J1;
import java.util.Scanner;

public class CanadianCalorieCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int burger = sc.nextInt();
		int side = sc.nextInt();
		int drink = sc.nextInt();
		int dessert = sc.nextInt();
		if(burger==1){
			count = count +461;
		}else if(burger==2){
			count = count +431;
		}else if(burger==3){
			count = count +420;
		}
		if(side==1){
			count = count +100;
		}else if(side==2){
			count = count +57;
		}else if(side==3){
			count = count +70;
		}
		if(drink==1){
			count = count +130;
		}else if(drink==2){
			count = count +160;
		}else if(drink==3){
			count = count +118;
		}
		if(dessert==1){
			count = count +167;
		}else if(dessert==2){
			count = count +266;
		}else if(dessert==3){
			count = count +75;
		}
		System.out.println("Your total Calorie count is " + count + ".");
	}

}