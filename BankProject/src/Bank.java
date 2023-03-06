import java.awt.Menu;
import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		
		while(run) {
			int num = bank.menu();
			switch (num) {
				case 1 : bank.makeAccount();
					break;
				case 2 : bank.deposit();
					break;
				case 3 : bank.withdraw();
					break;
				case 4 : bank.accountInfo();
					break;
				case 5 : bank.allAccountInfo();
					break;
				default :
					run = false;
			}
			System.out.println();
		}
		
	}
	
	Account[] accs = new Account[100];
	int cnt; //실제 개설된 계좌수  
	static boolean run = true;
	
	//사용자 입력
	Scanner sc = new Scanner(System.in);
	
	int menu() {
		System.out.println("[ COCO BANK ]");
		System.out.println(" 0. 종료 | 1. 계좌개설 | 2. 입금 | 3. 출금 | 4. 계좌조회 | 5. 전체계좌조회 ");
		System.out.print("선택 >> ");
		
		int sel = Integer.parseInt(sc.nextLine());
		return sel;
	}
	
	
	/**
	 * 계좌개설 
	 */
	void makeAccount() {
		System.out.println("[ 계좌개설 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc != null) {
			System.out.println("중복된 계좌번호입니다.");
		} else {
			System.out.print("이름 :");
			String name = sc.nextLine();
			System.out.print("입금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			
			accs[cnt++] = new Account(id, name, money);
			System.out.println("계좌개설이 완료되었습니다.");
		}
	}
	
	
	/**
	 * 입금하기 
	 */
	void deposit() {
		System.out.println("[ 입금하기 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc == null) {
			System.out.println("없는 계좌번호입니다.");
		} else {
			System.out.print("입금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			acc.deposit(money);
			System.out.println(money+"원 입금 완료되었습니다.");
		}
	}
	
	/**
	 * 출금하기 
	 */
	void withdraw() {
		System.out.println("[ 출금하기 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc == null) {
			System.out.println("없는 계좌번호입니다.");
		} else {
			System.out.print("출금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			
			if(acc.withdraw(money)) {
				System.out.println(money+"원 출금 완료되었습니다.");
			} else { System.out.println("출금 실패했습니다."); }
			
		}
	}
	

	/**
	 * 특정 계좌조회 
	 */
	void accountInfo() {
		System.out.println("[ 계좌조회 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc == null) {
			System.out.println("없는 계좌번호입니다.");
		} else System.out.println(acc);
	}
	
	/**
	 * 전체 계좌조회 
	 */
	void allAccountInfo() {
		System.out.println("[ 전체 계좌조회 ]");
		for(int i=0; i<cnt; i++) {
			System.out.println(accs[i]);
		}
	}
	
	/**
	 * 아이디로 계좌조회, 계좌 리턴 
	 * @param id
	 * @return
	 */
	Account searchAccById(String id) {
		Account acc = null;
		for(int i=0; i<cnt; i++) {
			if(accs[i].id.equals(id)) {
				acc = accs[i];
				break;
			}
		}
		return acc;
	}
}
