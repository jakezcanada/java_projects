
public class RANDOM {
	String firstName;
	String lastName;
	int age;
	int grade;
	
	public RANDOM(String fn, String ln, int a, int g){
		lastName = ln;
		firstName = fn;
		age = a;
		grade = g;
	}
	String getName(){
		String name = firstName + lastName;
		return name;
	}
	void setAge(int a){
		age = a;
	}
	public static void main(String args[]){
		RANDOM st = new RANDOM("peter", "chan", 12,13);
		System.out.println("The student is " + st.getName());
	}
}
