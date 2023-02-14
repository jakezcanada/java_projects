import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int looper = sc.nextInt();
		String[] strArr = new String[looper];
		boolean toggle = true;
		for(int i = 0; i<looper; i++){
			String str = sc.next();
			String[] strArr1 = str.split("X");
			String[] strArr2 = str.split("O");
			if(strArr2.length>strArr1.length){
			strArr[i] = "no";
			toggle = false;
			}//good
			if(toggle){
				strArr[i] = "yes";
			}
			if(str.equals(".........")){
				strArr[i] = "yes";
			}//good
			toggle = true;
			System.out.println(strArr[i]);
		}
	}
}
