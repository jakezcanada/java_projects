import java.util.Scanner;

public class winOrLose {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int checker = 0;
		for(int i = 0; i<6; i++){
			String a = sc.next();
			if(a.equals("W")){
				counter++;	
			}else{
				checker++;
			}
		}
		if(checker == 6){
			System.out.println("-1");
		}else if(counter >= 5){
			System.out.println("1");
		}else if(counter >= 3){
			System.out.println("2");
		}else{
			System.out.println("3");
		}
	}
}
