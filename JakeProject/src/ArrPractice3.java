import java.util.*;

public class ArrPractice3 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = new ArrayList<Integer>();
		int looper = sc.nextInt();
		for(int i = 0; i<looper; i++){
			int num = sc.nextInt();
			myList.add(num);
		}
		int looper2 = sc.nextInt();
		for(int i = 0; i<looper2; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			Collections.swap(myList, a, b);
		}
		String str = myList.toString().replace(",","").replace("[","").replace("]","").trim();
		System.out.println(str);
	}
}
