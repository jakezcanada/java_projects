import java.util.*;

public class PalindromeAgain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int counter = 0;
		int[] num = new int[25];
		List<String> myList = new ArrayList<String>();
		for(int j = 0; j<a; j++){
			String input = sc.next();
			for(int i = 0; i<a; i++){
				char ch = input.charAt(i);
				num[ch-'a'] = num[ch-'a']+1;
			}
			for(int i = 0; i<25; i++){
				int n = num[i];
				if(n!=0){
					if(n%2!=0){
						counter++;
					}
				}
			}
			if(counter>1){
				myList.add("NO");
			}else{
				myList.add("YES");
			}
		}
		System.out.println(myList.toString().replace(" ", "\n").replace("[", "").replace("]", "").replace(",", ""));
	}

}
