import java.util.*;

public class WetlandsOfFlorida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> myList = null;
		int numOfCases = sc.nextInt()+1;
		String input = "";
		String line1 = sc.nextLine();
		int a = line1.length();
		for(int i = 0; i<=numOfCases; i++){
			myList = new ArrayList<String>();
			while(!(input.equals(line1))){
				for(int j = 0; j<a; j++){
					input = sc.next();
					myList.add(sc.next());
				}
			}
		}
		System.out.println(myList.get(1));
	}

}
