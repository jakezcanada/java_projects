package HackerRank;

public class Person {
	String firstName;
	String lastName;
	Person(String firstName, String lastName){
		setFirstName(firstName);
		setLastName(lastName);
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getFirstName(){
		return this.firstName;
	}
	public String getLastName(){
		return this.lastName;
	}
	public static void main(String[] args) {
		Person ppl = new Person("JAKE","ZHANG");
		System.out.println(ppl.getFirstName() + " " + ppl.getLastName());
	}

}
