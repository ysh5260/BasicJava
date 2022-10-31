package Exercise07;

import java.text.DecimalFormat;

public class BankAccount {
	protected int balance; // 잔액
	
	DecimalFormat formatter = new DecimalFormat("###,###"); // 숫자에 세자리 마다 , 를 찍어주는 함수 출력은 String 임 
	
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
		return String.format("%s",formatter.format(balance)); //String.format(",%d",balance)
	}
}
