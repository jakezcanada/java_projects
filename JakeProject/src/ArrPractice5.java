import java.util.*;

public class ArrPractice5 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numOfInputs = sc.nextInt();
		int[] arr = new int[numOfInputs];
		for(int i = 0; i<numOfInputs; i++){
			int theInput = sc.nextInt();
			if(theInput >= 0 && theInput%2==0){
				arr[i] += theInput;
			}else{
			}
		}
		for(int i = numOfInputs-1; i>=0; i--){
			if(arr[i] == 0){
				
			}else{
				System.out.print(arr[i] + " ");
			}
		}
	}
}
