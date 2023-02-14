import java.util.Scanner;

public class ReverseTehStrangs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";
		String[] strArr = str.split(" ");
		for(int i = strArr.length-1; i>-1; i--){
			result = result + strArr[i] + " ";
		}
		System.out.println(result);
	}

}
