package J2;
import java.util.*;

public class TimeOnTask {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = new ArrayList<Integer>();
		int minutes =sc.nextInt();
		int numOfChores = sc.nextInt();
		for(int i = 0; i<numOfChores; i++){
			int num = sc.nextInt();
			myList.add(num);
		}
		Collections.sort(myList);
		int count = 0;
		for(int i = 0; i<myList.size(); i++){
			int a = myList.get(i);
			if(minutes-a >= 0){
				count++;
				minutes = minutes - a;
			}else{
				break;
			}
		}
		System.out.println(count);
	}
}
