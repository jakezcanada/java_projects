import java.util.*;

public class SpellCheck {

	public static boolean equals(final String s1, final String s2) {
		return s1 != null && s2 != null && s1.hashCode() == s2.hashCode()
		    && s1.equals(s2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		ArrayList<ArrayList<String>> storage = new ArrayList<ArrayList<String>>();
		for(int i = 0; i<27; i++) {
			storage.add(new ArrayList<String>());
		}
		for(int i = 0; i<N; i++) {
			String input = sc.next();
			int space = 0;
			if((int)input.charAt(0)-48<=9) {
				space = 26;
			}else{
				space = ((int)input.charAt(0))-97;
			}
			ArrayList<String> temp = storage.get(space);
			temp.add(input);
			storage.remove(space);
			storage.add(space, temp);
		}
		int result = -1;
		for(int i = 0; i<M; i++) {
			String input = sc.next();
			//System.out.println("loop: " + input);
			int space = 0;
			if((int)input.charAt(0)-48<=9) {
				space = 26;
			}else{
				space = ((int)input.charAt(0))-97;
			}
			//System.out.println("Space: " + space);
			ArrayList<String> temp = storage.get(space);
			if(!temp.isEmpty()) {
				boolean urMom = false;
				//System.out.println("a: " + i);
				for(int j = 0; j<temp.size(); j++){
					if(equals(temp.get(j), input)) {
						urMom = true;
						break;
					}
				}
				if(!urMom) {
					if(result != -1){
						System.out.print(result + " ");
					}
					result = i+1;
				}
			}else {
				if(result != -1){
					System.out.print(result + " ");
				}
				result = i+1;
			}
		}
		System.out.print(result);
	}

}
