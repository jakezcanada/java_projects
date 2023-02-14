import java.util.Scanner;

public class Boolean {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String sub = a.substring(a.length()-5,a.length());
		String[] str = a.split(" ");
		boolean toggle = false;
		if(sub.equals(" true")){
			toggle = true;
		}else{
			toggle = false;
		}
		for(int i = 0; i< str.length; i++){
			if(str[i] == "not"){
				toggle = !toggle;
			}
		}
	}
}
