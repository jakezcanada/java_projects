import java.util.*;

public class Punchy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0;
		int B = 0;
		int calculation = 0;
		while(true){
			int num = sc.nextInt();
			if(num == 2){
				String letter = sc.next();
				if(letter.equals("A")){
					System.out.println(A);
				}else{
					System.out.println(B);
				}
			}else{
				if(num == 1){
					String letter = sc.next();
					int n = sc.nextInt();
					if(letter.equals("A")){
						A = n;
					}else{
						B = n;
					}
				}else if(num == 3){
					String x = sc.next();
					String y = sc.next();
					calculation = A+B;
					if(x.equals("A")){
						A = calculation;
					}else{
						B = calculation;
					}
					calculation = 0;
				}else if(num == 4){
					String x = sc.next();
					String y = sc.next();
					calculation = A*B;
					if(x.equals("A")){
						A = calculation;
					}else{
						B = calculation;
					}
					calculation = 0;
				}else if(num == 5){
					String x = sc.next();
					String y = sc.next();
					calculation = A-B;
					if(x.equals("A")){
						A = calculation;
					}else{
						B = calculation;
					}
					calculation = 0;
				}else if(num == 6){
					String x = sc.next();
					String y = sc.next();
					calculation = A/B;
					if(x.equals("A")){
						A = calculation;
					}else{
						B = calculation;
					}
					calculation = 0;
				}else if(num == 7){
					break;
				}
			}
		}
	}

}
