package J3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Punchy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("A", 0);
		m.put("B", 0);
		
		while(true) {
			int op = sc.nextInt();
			String str;
			if(op != 7) {
				str = sc.next();
			}else {
				break;
			}
			switch(op) {
				case 1:
					m.put(str, sc.nextInt());
					break;
				case 2:
					System.out.println(m.get(str));
					break;
				case 3:
					m.put(str, m.get(str) + m.get(sc.next()));
					break;
				case 4:
					m.put(str, m.get(str) * m.get(sc.next()));
					break;
				case 5:
					m.put(str, m.get(str) - m.get(sc.next()));
					break;
				case 6:
					m.put(str, (int) (m.get(str) / m.get(sc.next())));
					break;
			}
			
		}
	}
}
