import java.util.*;

public class From1987to2013 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Set<String> strSet = new HashSet<String>();
		String str = sc.next();
		String[] strArr = str.split("");
		boolean b = false;
		while(b==false){
			int OrigStr = Integer.parseInt(str);
			OrigStr = OrigStr + 1;
			String str2 = OrigStr + "";
			for(int i = 0; i<str.length(); i++){
				String temp = strArr[i];
				strSet.add(temp);
				if(strSet.equals(str2)){
					System.out.println(str2);
					b = true;
				}
			}
			strArr = str2.split("");
		}
	}
}
