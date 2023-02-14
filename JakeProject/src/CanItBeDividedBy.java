import java.util.Scanner;

public class CanItBeDividedBy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String result1 = "";
		String result2 = "";
		String result3 = "";
		if(a%3 == 0){
			result1 = result1 + "3";
		}
		if(a%5 == 0){
			result2 = result2 + "5";
		}
		if(a%7 == 0){
			result3 = result3 + "7";
		}
		if(result1.equals("3")&&result2.equals("5")&&result3.equals("7")){
			System.out.println("(3 5 7)");
		}
		if(result1.equals("3")&&!result2.equals("5")&&!result3.equals("7")){
			System.out.println("(3)");
		}
		if(result1.equals("3")&&result2.equals("5")&&!result3.equals("7")){
			System.out.println("(3 5)");
		}
		if(!result1.equals("3")&&result2.equals("5")&&!result3.equals("7")){
			System.out.println("(5)");
		}
		if(result1.equals("3")&&!result2.equals("5")&&result3.equals("7")){
			System.out.println("(3 7)");
		}
		if(!result1.equals("3")&&!result2.equals("5")&&result3.equals("7")){
			System.out.println("(7)");
		}
		if(!result1.equals("3")&&result2.equals("5")&&result3.equals("7")){
			System.out.println("(5 7)");
		}
		if(!result1.equals("3")&&!result2.equals("5")&&!result3.equals("7")){
			System.out.println("()");
		}
	}

}
