import java.util.Scanner;

import acc.Account;
import acc.SpecialAccount;
import exception.BANK_ERR;
import exception.BankException;

/**
 * 사용자 예외처리 4가지
 * new -> 던져주고 받는 처리 필요 
 * @author ebina
 *
 */
public class Bank {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		
		while(true) {
			try {
				int num = bank.menu();
				if(num == 0) break;
				switch (num) {
					case 1 : bank.makeAccountMenu();
						break;
					case 2 : bank.deposit();
						break;
					case 3 : bank.withdraw();
						break;
					case 4 : bank.accountInfo(); // try-catch 처리 필요 : 함수를 호출한 곳 
						break;
					case 5 : bank.allAccountInfo();
						break;
					default :
						throw new BankException("선택오류", BANK_ERR.MENU);
				}
			} catch (NumberFormatException e) {
				System.out.println("입력 형식이 바르지 않습니다.");
			} catch (BankException e) {
				System.out.println(e);	//toString()의 결과 
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
		
		int sel = 9;
		try {
			sel = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("입력 형식이 바르지 않습니다.");
		}
		
		return sel;
	}
	

	/**
	 * 계좌개설 
	 * @throws BankException 
	 */
	void makeAccountMenu() throws BankException  {
		System.out.println("[ 계좌개설 ]");
		System.out.println(" 1. 일반계좌 | 2. 특수계좌 ");
		System.out.print("선택>> ");
		int num = Integer.parseInt(sc.nextLine());
		
		switch (num) {
		case 1: makeAccount();
			break;
		case 2: makeSpecialAccount();
		break;

		default: throw new BankException("선택오류", BANK_ERR.ACC_MENU);
		}
	}
	
	void makeAccount() throws BankException {
		System.out.println("[ 일반계좌개설 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc != null) {
//			System.out.println("중복된 계좌번호입니다.");
			throw new BankException("계좌오류", BANK_ERR.DOUBLE_ID);
		} 
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		accs[cnt++] = new Account(id, name, money);
		System.out.println("계좌개설이 완료되었습니다.");
	}
	
	void makeSpecialAccount() throws BankException {
		System.out.println("[ 특수계좌개설 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc != null) {
//			System.out.println("중복된 계좌번호입니다.");
			throw new BankException("계좌오류", BANK_ERR.DOUBLE_ID);
		} 
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급 : ");
		String grade = sc.nextLine();
		
		accs[cnt++] = new SpecialAccount(id, name, money, grade);
		System.out.println("계좌개설이 완료되었습니다.");
		
	}
	
	
	/**
	 * 입금하기 
	 * @throws BankException 
	 */
	void deposit() throws BankException {
		System.out.println("[ 입금하기 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc == null) {
//			System.out.println("없는 계좌번호입니다.");
			throw new BankException("계좌오류", BANK_ERR.NOT_ID);
		} else {
			System.out.print("입금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			
			if(money <= 0) {
				throw new BankException("금액오류", BANK_ERR.DEPOSIT);
			}
			acc.deposit(money);
			System.out.println(money+"원 입금 완료되었습니다.");
		}
	}
	
	/**
	 * 출금하기 
	 * @throws BankException 
	 */
	void withdraw() throws BankException {
		System.out.println("[ 출금하기 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		Account acc = searchAccById(id);
		if(acc == null) {
//			System.out.println("없는 계좌번호입니다.");
			throw new BankException("계좌오류", BANK_ERR.NOT_ID);
		} else {
			System.out.print("출금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			
//			if(acc.withdraw(money)) {
//				System.out.println(money+"원 출금 완료되었습니다.");
//			} else { System.out.println("출금 실패했습니다."); }
			
			if(acc.getBalance() < money) {
				throw new BankException("금액오류", BANK_ERR.WITHDRAW);
			}
			acc.withdraw(money);
			System.out.println(money+"원 출금 완료되었습니다.");
			
		}
	}
	

	/**
	 * 특정 계좌조회 
	 * @throws BankException 
	 */
	void accountInfo() throws BankException {
		System.out.println("[ 계좌조회 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		Account acc = searchAccById(id);
		if(acc == null) {
			throw new BankException("계좌오류", BANK_ERR.NOT_ID);
		}
		System.out.println(acc.info());
	}
	
	/**
	 * 전체 계좌조회 
	 */
	void allAccountInfo() {
		System.out.println("[ 전체 계좌조회 ]");
		for(int i=0; i<cnt; i++) {
			System.out.println(accs[i].info());
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
			if(accs[i].getId().equals(id)) {
				acc = accs[i];
				break;
			}
		}
		return acc;
	}
}
