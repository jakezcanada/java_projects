import java.util.*;

public class NailedItOrNailEdit {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		List<Integer> myList = new ArrayList<Integer>();
		List<Integer> sums = new ArrayList<Integer>();
		int l = 0;
		int h = 1;
		int c =sc.nextInt();
		for(int i = 0; i<c; i++){
			int input = sc.nextInt();
			myList.add(input);
		}
		for(int i = 0; i<c; i++){
			int a = myList.get(i);
			for(int j = 1; j<c-i; j++){
				int b = myList.get(j);
				sums.add(a+b);
			}
		}
		Collections.sort(sums);
		int greatest = 0;
		int num = 0;
		int num2 = 0;
		int counter = 1;
		for(int i = 0; i<sums.size(); i++){
			num = sums.get(i);
			if(num == num2){
				counter += 1;
				if(counter > greatest){
					greatest = counter;
					h = 1;
				}else if(counter == greatest){
					h = h + 1;
				}
			}else{
				num2 = num;
				counter = 1;
				if(counter > greatest){
					greatest = counter;
					h = 1;
				}else if(counter == greatest){
					h = h + 1;
				}
			}
		}
		l = greatest;
		l--;
		if(l == 1){
			h = c*2;
		}
		System.out.println(l + " " + h);
		}
}
