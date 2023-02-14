import java.util.*;

public class GlobalWarming {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> endList = new ArrayList<Integer>();
		int counter = 0;
		while (true) {
			int num = sc.nextInt();
			if (num == 0) {
				break;
			} else {
				for (int i = 0; i < num; i++) {
					int n = sc.nextInt();
					myList.add(n);
				}
				int a = myList.get(0);
				int b = myList.get(1);
				int c = a - b;
				boolean toggle = false;
				for (int i = 1; i < num - 1; i++) {
					int num1 = myList.get(i);
					int num2 = myList.get(i + 1);
					int num3 = num1 - num2;
					if (c == num3) {
						counter++;
						endList.add(counter);
						toggle = true;
					} else {
						counter++;
					}
				}
				if(!toggle){
					endList.add(num-1);
				}
				toggle = false;
			}
		}
		String lastStr = endList.toString().replace("[", "").replace("]", "").replace(",", "").trim();
		System.out.println(lastStr);
	}
}
