import java.util.ArrayList;

public class ArrListExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("john");
		al.add("Tom");
		al.add("Peter");
		
		for(String st : al){
			System.out.println( st );
		}
	}

}
