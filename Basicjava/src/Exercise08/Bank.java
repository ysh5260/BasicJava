package Exercise08;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomers;
	
	public Bank() {
		customers = new Customer[10]; //배열크기 10으로 초기화
	}
	
	public void addCustomer(Customer customer) {
		customers[numberOfCustomers] = customer; // 배열에 고객정보를 저장 -> customers[numberOfCustomers++]도 가능
		numberOfCustomers ++;// 고객 수 증가
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers; 
	}
	public Customer[] getCustomers() {
		return customers;
	} 
	public Customer getCustomer(int index) {
		return customers[index];
	}	
}
