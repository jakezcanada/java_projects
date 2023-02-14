import java.util.*;

public class TwoDimensionArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i<30; i++){
			myList.add(sc.nextInt());
		}
		Collections.sort(myList);
		int a1 = myList.get(0);
		int b1 = myList.get(1);
		int dif = a1-b1;
		
		for(int i = 1; i<28; i++){
			int a = myList.get(i);
			int b = myList.get(i+1);
			if(a-b>dif){
				dif = a-b;
			}
		}
		System.out.println();
	}

}
