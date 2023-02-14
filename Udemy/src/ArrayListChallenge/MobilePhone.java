package ArrayListChallenge;
import java.util.*;
public class MobilePhone {
	private ArrayList<Contact> myContacts; 
	private String myNumber;
	public MobilePhone(){
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contact>();
	}
	public boolean addNewContact(Contact contact){
		if(findContact(contact.getName()) >= 0){
			System.out.println("U haz copi alredy");
			return false;
		}
		myContacts.add(contact);
		return true;
	}
	
	public boolean updateContact(Contact oldContact, Contact newContact){
		int foundPosition = findContact(oldContact);
		if(foundPosition<0){
			System.out.println(oldContact.getName() + " was not found");
			return false;
		}
		this.myContacts.set(foundPosition, newContact);
		System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
		return true;
	}
	private int findContact(Contact contact){
		return this.myContacts.indexOf(contact);
	}
	private int findContact(String contactName){
		for(int i = 0; i<this.myContacts.size(); i++){
			Contact contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName)){
				return i;
			}
		}
		return -1;
	}
/*	public Scanner sc = new Scanner(System.in);*/
/*	public static void main(String[] args) {
		
	}*/

}
