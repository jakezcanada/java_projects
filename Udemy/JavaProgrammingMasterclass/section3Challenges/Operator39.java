package section3Challenges;

public class Operator39 {

	public static void main(String[] args) {
		double a = 20.00;
		double b = 80.00;
		double c = 100 * (a + b);
		double d = c % 40.00;
		boolean e = d == 0 ? true:false;
		if(e) {
			System.out.println(e);	
		}else {
			System.out.println("Got some remainder");
		}
	}

}
