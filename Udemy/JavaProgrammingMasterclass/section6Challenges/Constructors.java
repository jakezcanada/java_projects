package section6Challenges;

import java.util.Scanner;

public class Constructors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Account user = new Account("12346789",1000.00,"888-888-8888","Bob Jones", "Bob_Jones@gmail.com");
//		user.setAccountNumber("123456789");
//		user.setBalance(1000.00);
//		user.setPhoneNumber("888-888-8888");
//		user.setCustomerName("Bob Jones");
//		user.setEmail("Bob_Jones@gmail.com");
//		while(true) {
//			System.out.println("Your balance is " +  String.format("%.2f",user.getBalance()));
//			System.out.println("What would you like to do? (Withdraw or Deposit)");
//			String transaction = sc.next();
//			System.out.println("How much do you want to " + transaction);
//			if(transaction.equals("withdraw")) {
//				user.withdraw(sc.nextDouble());
//			}else if(transaction.equals("deposit")) {
//				user.deposit(sc.nextDouble());
//			}
//		}
		
		VIPCustomer person1 = new VIPCustomer();
		System.out.println(person1.getName());
		VIPCustomer person2 = new VIPCustomer(25000.00, "Bob");
		System.out.println(person2.getName());
		VIPCustomer person3 = new VIPCustomer(25000.00, "Boo", "boo@gmail.com");
		System.out.println(person3.getName());
		System.out.println(person3.getEmail());
		
	}

}

class VIPCustomer {
	private double creditLimit; 
	private String name;
	private String email;
	
	public VIPCustomer() {
		this(50000.00, "default Name", "default Email");
	}
	
	public VIPCustomer(double creditLimit, String name) {
		this(creditLimit, name, "default Email");
	}
	
	public VIPCustomer(double creditLimit, String name, String email) {
		this.creditLimit = creditLimit;
		this.name = name;
		this.email = email;
	}

	public double getCreditLimit() {return creditLimit;}
	public String getName() {return name;}
	public String getEmail() {return email;}

}

class Account {
	
	private String number;
	private double balance;
	private String phoneNumber;
	private String customerName;
	private String email;
	public Account() {
		this("56789", 2.50, "Default name", "Default address", "default phone");
	}
	public Account(String number, double balance, String customerName, String email, String phoneNumber) {
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		System.out.println("Account initialized");
	}
	public String getAccountNumber() {return number;}
	public void setAccountNumber(String number) {this.number = number;}
	public double getBalance() {return balance;}
	public void setBalance(double balance) {this.balance = balance;}
	public String getPhoneNumber() {return phoneNumber;}
	public void setPhoneNumber(String phoneNumber) {this.phoneNumber = phoneNumber;}
	public String getCustomerName() {return customerName;}
	public void setCustomerName(String customerName) {this.customerName = customerName;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	public void deposit(double amount) {
		System.out.println("Balance before transaction: " +  String.format("%.2f",balance));
		this.balance += amount;
		System.out.println("Balance after transaction: " +  String.format("%.2f",balance));
	}
	public void withdraw(double amount) {
		if(amount>balance) {
			System.out.println("Insufficient funds");
		}else {	
			System.out.println("Balance before transaction: " +  String.format("%.2f",balance));
			this.balance -= amount;
			System.out.println("Balance after transaction:" +  String.format("%.2f",balance));
		}
	}
	
	
	
}
