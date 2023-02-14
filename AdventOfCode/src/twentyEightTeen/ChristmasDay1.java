package twentyEightTeen;

import java.util.*;

public class ChristmasDay1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		while(sc.hasNextLine()){
			String num = sc.next();
			if(num.equals("end")){break;}
			if(num.contains("+")){
				result = result + Integer.parseInt(num.substring(1,num.length()));
			}else{
				result = result - Integer.parseInt(num.substring(1,num.length()));
			}
		}
		System.out.println(result);
	}

}
