import java.util.*;

public class ChangeCharacters {
	public static void change(int x, int y, String c, List<String> myList){
		String a = myList.get(x);
		String[] strArr = a.split("");
		strArr[y] = c;
		String changed = Arrays.toString(strArr);
		myList.set(x, changed);
	}
	public static void reverse(int x, List<String> myList){
		String a = myList.get(x);
		List<String> myList1 = new ArrayList<String>();
		myList1.equals(a.split(""));
		Collections.reverse(myList1);
		String changed = myList1.toString().replace(",","").replace("[", "").replace("]", "").replace(" ", "").replace("\n","");
		myList.set(x, changed);
	}
	public static void changeDiagonal(int loop, String c, List<String> myList){
		
		for(int i = 0; i<loop; i++){
			String a = myList.get(i);
			String[] strArr = a.split("");
			strArr[i] = c;
			String changed = Arrays.toString(strArr);
			myList.set(i, changed);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> myList = new ArrayList<String>();
		int loop = sc.nextInt();
		int numOfOperations = sc.nextInt();
		for(int i = 0; i<loop; i++){
			String input = sc.next();
			myList.add(input);
		}
		for(int i = 0; i<numOfOperations; i++){
			String input = sc.next();
			if(input.equals("change")){
				int x = sc.nextInt();
				int y = sc.nextInt();
				String c = sc.next();
				change(x,y,c,myList);
			}else if(input.equals("changeDiagonal")){
				String c = sc.next();
				changeDiagonal(loop,c,myList);
			}else if(input.equals("reverse")){
				int x = sc.nextInt();
				reverse(x,myList);
			}
			
		}
		System.out.println(myList.toString().replace(",","\n").replace("[", "").replace("]", "").replace(" ", ""));
	}

}
