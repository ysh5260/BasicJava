package Exercise08;

public abstract class BankAccount {
	protected int balance; // 잔액
	public abstract String getAccountType();
	
	public BankAccount(int balance) {
		this.balance = balance; 
	}
	public int getBalance() {
		return balance;//현재 계좌의 잔액
	}
	public void deposit(int amount) {
		balance += amount; //입금
	}
	public boolean withdraw(int amount) {
		if(balance>=amount) {
			balance -= amount; //잔액에서 출금액 금액만큼 뺌
			return true; 
		}else {
			return false;
		}
	}
	public boolean transfer(int amount, BankAccount otherAccount) { //현재계좌에서 amount 만큼 다른계좌로 송금
		if(withdraw(amount)== true) {
			otherAccount.deposit(amount); //amount 만큼 송금된 것을 다른 사람 계좌에 옮겨졌으면 true를 반환
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return String.format("%,d",balance);
	}
}
