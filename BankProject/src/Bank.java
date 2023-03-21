import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

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
		bank.loadAllAccount(); //데이터 읽어오기 
		
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
		bank.saveAllAccount();	//데이터 저장하기 
		
	}
	
	//계좌번호, 계좌 
//	Account[] accs = new Account[100];
//	HashMap<String, Account> accs = new HashMap<>();
	TreeMap<String, Account> accs = new TreeMap<>();
	
	
	int cnt; //실제 개설된 계좌수  
	static boolean run = true;
	
	//사용자 입력
	Scanner sc = new Scanner(System.in);
	
	int menu() throws BankException {
		System.out.println("[ COCO BANK ]");
		System.out.println(" 0. 종료 | 1. 계좌개설 | 2. 입금 | 3. 출금 | 4. 계좌조회 | 5. 전체계좌조회 ");
		System.out.print("선택 >> ");
		
		int sel = 9;
		try {
			sel = Integer.parseInt(sc.nextLine());
			if(sel < 0 || sel > 5) {
				throw new BankException("메뉴오류", BANK_ERR.MENU);
			}
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
		
		if(accs.containsKey(id)) {
//			System.out.println("중복된 계좌번호입니다.");
			throw new BankException("계좌오류", BANK_ERR.DOUBLE_ID);
		} 
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		
		accs.put(id, new Account(id, name, money));
		System.out.println("계좌개설이 완료되었습니다.");
	}
	
	void makeSpecialAccount() throws BankException {
		System.out.println("[ 특수계좌개설 ]");
		System.out.print("계좌번호 : ");
		String id = sc.nextLine();
		
		if(accs.containsKey(id)) {
//			System.out.println("중복된 계좌번호입니다.");
			throw new BankException("계좌오류", BANK_ERR.DOUBLE_ID);
		} 
		
		System.out.print("이름 :");
		String name = sc.nextLine();
		System.out.print("입금액 : ");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급 : ");
		String grade = sc.nextLine();
		
		accs.put(id, new SpecialAccount(id, name, money, grade));
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
		
		if(!accs.containsKey(id)) {
//			System.out.println("없는 계좌번호입니다.");
			throw new BankException("계좌오류", BANK_ERR.NOT_ID);
		} else {
			System.out.print("입금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			
			if(money <= 0) {
				throw new BankException("금액오류", BANK_ERR.DEPOSIT);
			}
			accs.get(id).deposit(money);
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
		
		if(!accs.containsKey(id)) {
//			System.out.println("없는 계좌번호입니다.");
			throw new BankException("계좌오류", BANK_ERR.NOT_ID);
		} else {
			System.out.print("출금액 : ");
			int money = Integer.parseInt(sc.nextLine());
			
//			if(acc.withdraw(money)) {
//				System.out.println(money+"원 출금 완료되었습니다.");
//			} else { System.out.println("출금 실패했습니다."); }
			
//			if(acc.getBalance() < money) {
//				throw new BankException("금액오류", BANK_ERR.WITHDRAW);
//			}
			accs.get(id).withdraw(money);
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
		
		if(!accs.containsKey(id)) {
			throw new BankException("계좌오류", BANK_ERR.NOT_ID);
		}
		System.out.println(accs.get(id).info());
	}
	
	/**
	 * 전체 계좌조회 
	 */
	void allAccountInfo() {
		System.out.println("[ 전체 계좌조회 ]");
		for(Account acc : accs.values()) {
			System.out.println(acc.info());
		}
	}
	
	/**
	 * data file 저장하기 
	 */
	void saveAllAccount() {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("acc.txt");
			bw = new BufferedWriter(fw);
			
			for(Account acc : accs.values()) {
				String str = "";
				str += acc.getId();
				str += "," + acc.getName();
				str += "," + acc.getBalance();
				if(acc instanceof SpecialAccount) {
					str += "," + ((SpecialAccount)acc).getGrade();
				}
				bw.write(str);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * data file 읽어오기 
	 */
	void loadAllAccount() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("acc.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
				String[] lines = line.split(","); 
				String id = lines[0];
				String name = lines[1];
				int balance = Integer.parseInt(lines[2]);
				if (lines.length == 4) {
					String grade = lines[3];
					accs.put(id, new SpecialAccount(id, name, balance, grade));
				} else {
					accs.put(id, new Account(id, name, balance));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
