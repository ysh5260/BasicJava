package Exercise08;

import java.text.DecimalFormat;

public class Customer{
	private String firstName;
	private String lastName;
	private BankAccount[] accounts; 
	private int numberOfAccounts;

	DecimalFormat formatter = new DecimalFormat("###,###"); // 숫자에 세자리 마다 , 를 찍어주는 함수 출력은 String 임

	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public BankAccount getAccount(int index) {
		return accounts[index] ;
	}
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts]= account;
		numberOfAccounts ++;
	}
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	
	public String toString() {
		return String.format("이름: %s %s ",firstName,lastName);
	}
}
