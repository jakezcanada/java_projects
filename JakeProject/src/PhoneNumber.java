import java.util.Scanner;

public class PhoneNumber {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String subStr = str.substring(0,3);
		if(subStr.equals("416")){
			System.out.println("valuable");
		}else if(subStr.equals("647") || subStr.equals("437")){
			System.out.println("valueless");
		}else{
			System.out.println("invalid");
		}
	}
}