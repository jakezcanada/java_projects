import java.util.*;
public class test2 {
	void testme(List<Integer> a){
		a.add(88);
		this.testm2();
	}
	void testm2(){}
	test2(int age,int height,int weight){}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		String c = "5";
		a.add(1);
		b = a;
		new test2(13,139,100).testme(a);
		a.add(2);
	
		new test2(13,139,100);
		
		
		System.out.println(b);
		System.out.println(a);
		
		
		String a2 = "a";
		String b2 = "";
		b2 = a2;
		a2 = a2+ " hi";
		
		System.out.println(b2);
		System.out.println(a2);
	}

}
