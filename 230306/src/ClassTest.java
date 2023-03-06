

public class ClassTest {
	static Account[] accs = new Account[100];
	static int cnt; //실제 개설된 계좌수  
	
	//makeAccount() 메소드 오버로딩 
	static void makeAccount(Account acc) {
		//acc 대입 후 cnt++
		accs[cnt++] = acc;
	}
	
	static void makeAccount(String id, String name, int balance) {
		accs[cnt++] = new Account(id, name, balance);
	}
	
	static void allAccountInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(accs[i]);
		}
	}
	
	//은행 시점 
	static void deposit(String id, int money) {
//		for(int i=0; i<cnt; i++) {
//			if(accs[i].id.equals(id)) {
//				//Account class 의 deposit() 메소드 
//				accs[i].deposit(money);
//				break;
//			}
//		}
		
		Account account = searchAccById(id);
		if(account == null) {
			System.out.println("계좌번호가 틀립니다.");
		} else {
			account.deposit(money);
		}
	}
	
	static void withdraw(String id, int money) {
//		for(int i=0; i<cnt; i++) {
//			if(accs[i].id.equals(id)) {
//				accs[i].withdraw(money);
//				break;
//			}
//		}
		
		Account account = searchAccById(id);
		if(account == null) {
			System.out.println("계좌번호가 틀립니다.");
		} else {
			account.withdraw(money);
		}
	}

	//계좌번호로 계좌 검색 
	static Account searchAccById(String id) {
		Account acc = null;
		for(int i=0; i<cnt; i++) {
			if(accs[i].id.equals(id)) {
				acc = accs[i];
				break;
			}
		}
		return acc;
	}
	
	//계좌번호로 계좌 조회하기 
	static void accountInfo(String id) {
		Account acc = searchAccById(id);
		if (acc == null) {
			System.out.println("없는 계좌번호입니다.");
		} else
		System.out.println(acc);
	}
	
	
	public static void main(String[] args) {
		
		makeAccount(new Account("1001", "홍길동", 100000));
		makeAccount(new Account("1002", "고길동", 200000));
		makeAccount("1003", "하길동", 300000);
		deposit("1001", 5000);
		withdraw("1002", 10000);
		
		allAccountInfo();
		
		accountInfo("1004");
		
//		Account acc = new Account("1001", "홍길동", 100000);
//		System.out.println(acc.info());
//		
//		acc.deposit(10000);
//		System.out.println(acc.info());
//		
//		acc.withdraw(5000);
//		System.out.println(acc.info());
	}
}



class Account {
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
	
	void withdraw(int money) {
		if(money > balance) {
			System.out.println("잔액이 부족합니다.");
		} else { balance -= money; }
	}
	

	@Override
	public String toString() {
		String acc = "계좌번호 :" +id+ "\t 계좌주 : " +name+ "\t 잔액 : " +balance;
		return acc;
	}
}