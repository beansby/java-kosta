
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
	
	void deposit(int money) {
		balance += money;
	}
	
	boolean withdraw(int money) {
		if(money > balance) {
			System.out.println("잔액이 부족합니다.");
			return false;
		} else { 
			balance -= money; 
			return true;
		}
	}
	
	@Override
	public String toString() {
		String acc = "계좌번호 :" +id+ "\t 계좌주 : " +name+ "\t 잔액 : " +balance;
		return acc;
	}
}
