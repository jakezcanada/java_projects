import java.util.*;

public class NotAWallOfText {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String space = " ";
		int NumOfWords = 0;
		boolean toggle = true;
		while(toggle){
			if(input.indexOf(" ") != -1){
				input = input.replaceFirst(space, "");
				NumOfWords += 1;
			}else{
				toggle = false;
			}
		}
		System.out.println(NumOfWords+1);
	}

}
