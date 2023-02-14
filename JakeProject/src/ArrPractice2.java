import java.util.*;

public class ArrPractice2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> myList = new ArrayList<String>();
		int looper = sc.nextInt();
		for(int i = 0; i<looper; i++){
			String num = sc.next();
			myList.add(num);
		}
		String num = sc.next();
		int counter = 0;
		for(String i : myList){
			if(i.equals(num)){
				counter = counter + 1;
			}
		}
		System.out.println(counter);
	}

}
