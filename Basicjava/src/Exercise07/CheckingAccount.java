package Exercise07;
//체크카드
public class CheckingAccount extends BankAccount {
	private SavingsAccount protectedBy;
	
	public CheckingAccount(int balance) {
		super(balance);
	}
	public CheckingAccount(int balance,SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy; 
	}
	@Override
	public boolean withdraw(int amount) {
		if(balance + protectedBy.balance < amount) { //출금 할 수 없는 조건 
			System.out.println("출금할 수 없습니다.");
			return false;
		}else if(balance<amount) { 
			protectedBy.withdraw(amount - balance); //부족한 돈은 saving 계좌에서 출금
			balance -= balance; //balance = 0 부족한 돈은 saving 계좌에서 출금했기 때문에 checking은 0이 됨
			return true;
		}else {
			super.withdraw(amount);//출금액이 계좌 잔고보다 큰 경우
			return true;
		}
	}
}
