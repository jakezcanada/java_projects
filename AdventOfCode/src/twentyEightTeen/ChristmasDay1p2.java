package twentyEightTeen;

import java.util.*;

public class ChristmasDay1p2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(result);
		boolean toggle = false;
		while(true){
			String num = sc.next();
			if(num.equals("end")){break;}
			if(num.contains("+")){
				result = result + Integer.parseInt(num.substring(1,num.length()));
			}else{
				result = result - Integer.parseInt(num.substring(1,num.length()));
			}
			for(int i = 0; i<arr.size(); i++){
				if(arr.get(i) == result){
					toggle = true;
				}
			}
			arr.add(result);
			Collections.sort(arr);
			if(toggle){
				break;
			}
		}
		System.out.println(result);

	}

}
