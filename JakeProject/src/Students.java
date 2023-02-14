import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int counter = 1;
		String str[] = new String[10];
		for(int i = 0; i<10; i++){
			String fn = sc.next().toLowerCase();
			String ln = sc.next().toLowerCase();
			str[i] = ln;
		}
		String findTHIS = sc.next().toLowerCase();
		for(int i = 0; i<10; i++){
			if(str[i].equals(findTHIS)){
				counter++;
			}
		}
		System.out.println(counter);
	}

}
