import java.util.*;

public class FederalVotingAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> myList = new ArrayList<String>();
		int a = sc.nextInt();
		for(int i = 0; i<a; i++){
			int year = sc.nextInt();
			int month = sc.nextInt();
			int date = sc.nextInt();
			if(year <= 1989){
				if(year == 1989){
					if(month==2){
						
					}else{
						
					}
				}else{
					myList.add("Yes");
				}
			}else{
				myList.add("No");
			}
		}
	}

}
