package Exercise07;
//저축계좌
public class SavingsAccount extends BankAccount{
	private double interestRate; 
	
	public SavingsAccount(int balance,double interestRate){
		super(balance);//슈퍼클래스로 잔액 불러옴
		this.interestRate = interestRate; //초기화
	}
	
	public void updateBalance(int period) {
		balance += balance*interestRate*period; // 원금 balance에 이자율 계산해서 넣어 주는 것
	}
}
