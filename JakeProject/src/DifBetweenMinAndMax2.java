import java.util.*;

public class DifBetweenMinAndMax2 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numOfInputSets = sc.nextInt();
		List<Integer> myList = new ArrayList<Integer>();
		for(int i = 0; i<numOfInputSets; i++){
			int numOfInputs = sc.nextInt();
			List<Integer> tempList = new ArrayList<Integer>();
			for(int j = 0; j<numOfInputs; j++){
				int a = sc.nextInt();
				tempList.add(a);
			}
			Collections.sort(tempList);
			int highest = tempList.get(tempList.size()-1);
			int lowest = tempList.get(0);
			int dif = highest-lowest;
			myList.add(dif);
		}
		String str = Arrays.toString(myList.toArray()).replace("[", "").replace("]", "").replace(",", "\n").replace(" ", "");
		System.out.println(str);
		
	}
}
