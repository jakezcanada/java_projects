import java.util.*;

public class ListMin {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = new ArrayList<Integer>();
		int a = sc.nextInt();
		for(int i = 0; i<a; i++){
			int input = sc.nextInt();
			myList.add(input);
		}
		Collections.sort(myList);
		String str = myList.toString().replace("[", "").replace("]", "").replace(",", "").replace(" ", "\n");
		System.out.println(str);
	}
}
