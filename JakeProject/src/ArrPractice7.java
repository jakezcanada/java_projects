
import java.util.*;

public class ArrPractice7 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numOfInputs = sc.nextInt();
		List<String> jakeList = new ArrayList<String>();
		String[] arr = new String[numOfInputs];
		for(int i = 0; i<numOfInputs; i++){
			String theInput = sc.next();
			if(theInput.split("0").length==2){
				jakeList.add(theInput);
			}
		}
		Collections.reverse(jakeList);
		for(String str : jakeList){
			System.out.print(str + " ");
		}
	}
}

