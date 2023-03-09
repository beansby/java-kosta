import EmployeeProject.emp.Employee;

public class PolinoTest2 {
	public static void main(String[] args) {
		// 배열에 객체 담기 1) new 연산자로 바로 할당 
//		accs[cnt++] = new Account("1001", "hong", 100000);
//		accs[cnt++] = new SpecialAccount("1002", "gong", 200000, "VIP");
//		accs[cnt++] = new SpecialAccount("1003", "song", 300000, "Gold");
//		
		// 배열에 객체 담기 2) 변수로 할당 
		Account acc1 = new Account("1001", "hong", 100000);
		SpecialAccount acc2 = new SpecialAccount("1002", "gong", 200000, "VIP");
		SpecialAccount acc3 = new SpecialAccount("1003", "song", 300000, "Gold");
//		accs[cnt++] = acc1;
//		accs[cnt++] = acc2;
//		accs[cnt++] = acc3;
		
		// 배열에 객체 담기 3) 메소드 호출  
		addAccount(acc1);
		addAccount(acc2);
		addAccount(acc3);
		
		allAccountInfo();
		System.out.println();
//		allSpecialAccountInfo();
//		System.out.println();
//		allNotSpecialAccountInfo();
		
		deposit("1001", 10000);
		deposit("1002", 10000);
		deposit("1004", 10000);
		allAccountInfo();
		
		withdraw("1002", 10000);
		allAccountInfo();
		
	}
	
	static Account[] accs = new Account[100];
	static int cnt;
	
	public static void addAccount(Account acc) {
		accs[cnt++] = acc;
	}
	
	public static void allAccountInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(accs[i].info()); 	//오버라이딩 사용하기 위해 info() 사용 
		} 
	}
	
	public static void allSpecialAccountInfo() {
		for (int i=0; i<cnt; i++) {
			if(accs[i] instanceof SpecialAccount) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	public static void allNotSpecialAccountInfo() {
		for (int i=0; i<cnt; i++) {
			if(!(accs[i] instanceof SpecialAccount)) {
				System.out.println(accs[i].info());
			}
		}
	}
	
	public static void deposit(String id, int money) {
		Account acc = searchById(id);
		if (acc == null) {
			System.out.println(id+ " 는 없는 계좌번호입니다.");
			return;
		}
		acc.deposit(money);
	}
	
	public static void withdraw(String id, int money) {
		Account acc = searchById(id);
		if (acc == null) {
			System.out.println("없는 계좌번호입니다.");
			return;
		}
		acc.withdraw(money);
	}
	
	public static Account searchById(String id) {
		Account acc = null;
		
//		while(true) {
			for(int i=0; i<cnt; i++) {
				if(accs[i].id.equals(id)) {
					acc = accs[i];
					break;
				} 
			}
			
//			if(acc == null) {
//				System.out.println("없는 계좌입니다.");
//				run = false;
//			} else {
//				break;
//			}
//		}
		return acc;	
	}
		
	
}

