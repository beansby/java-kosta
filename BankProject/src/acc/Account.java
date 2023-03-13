package acc;

import exception.BANK_ERR;
import exception.BankException;

public class Account {
	String id;
	String name;
	int balance;
	
	public Account(String id, String name, int balance) {	
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public String info() {
		return "계좌번호 :" +id+ ", 이름 : " +name+ ", 잔액 : " +balance;
	}
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withdraw(int money) throws BankException {
//		if(money > balance) {
//			System.out.println("잔액이 부족합니다.");
//			return false;
//		} else { 
//			balance -= money; 
//			return true;
//		}
		
		if(balance < money) {
			throw new BankException("출금오류", BANK_ERR.WITHDRAW);
		}
		balance -= money;
		
	}
	
	@Override
	public String toString() {
		String acc = "계좌번호 :" +id+ "\t 계좌주 : " +name+ "\t 잔액 : " +balance;
		return acc;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
