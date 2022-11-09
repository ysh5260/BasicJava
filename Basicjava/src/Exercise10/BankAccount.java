package Exercise10;

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
	  public boolean transfer(int amount,BankAccount otherAccount){  
		  if(amount<0||amount>balance) {
	          throw new IllegalArgumentException();
	       }
		  if(otherAccount == null){
	    	  throw new NullPointerException();
	       }
		  
		  this.balance -= amount;
		  otherAccount.deposit(amount);
	      return true;	        
	  }
	  
	public String toString() {
		return String.format("%,d",balance);
	}
}
