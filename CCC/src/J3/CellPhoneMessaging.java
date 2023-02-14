package J3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CellPhoneMessaging {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean loop = true;
		Map<String, String> phone = new HashMap<String, String>();
		phone.put("a", "2 1");
		phone.put("b", "2 2");
		phone.put("c", "2 3");
		phone.put("d", "3 1");
		phone.put("e", "3 2");
		phone.put("f", "3 3");
		phone.put("g", "4 1");
		phone.put("h", "4 2");
		phone.put("i", "4 3");
		phone.put("j", "5 1");
		phone.put("k", "5 2");
		phone.put("l", "5 3");
		phone.put("m", "6 1");
		phone.put("n", "6 2");
		phone.put("o", "6 3");
		phone.put("p", "7 1");
		phone.put("q", "7 2");
		phone.put("r", "7 3");
		phone.put("s", "7 4");
		phone.put("t", "8 1");
		phone.put("u", "8 2");
		phone.put("v", "8 3");
		phone.put("w", "9 1");
		phone.put("x", "9 2");
		phone.put("y", "9 3");
		phone.put("z", "9 4");
		while(loop) {
			String in = sc.next();
			if(in.equals("halt")) {
				break;
			}
			String[] str = in.split("");
			int time = 0;
			int prev = 1;
			for (int i = 0; i < str.length; i++) {
				if(Integer.parseInt(phone.get(str[i]).split(" ")[0]) == prev) {
					time+=2;
				}
				prev = Integer.parseInt(phone.get(str[i]).split(" ")[0]);
				time+=Integer.parseInt(phone.get(str[i]).split(" ")[1]);
			}
			System.out.println(time);
		}
	}

}
