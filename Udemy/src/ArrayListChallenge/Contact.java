package ArrayListChallenge;

public class Contact {
	public String name;
	public String phoneNumber;
	public Contact(String name, String phoneNumber){
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName(){
		return name;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public static Contact CreateContact(String name, String phoneNumber){
		return new Contact(name,phoneNumber);
	}
}
