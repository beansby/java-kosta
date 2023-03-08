package EmployeeProject;

import java.util.Scanner;

public class Company {
	public static void main(String[] args) {
		
		//사번, 이름, 소속, 급여 : id, name, department, pay
//		Employee e1 = new Employee("1001", "홍길동", "홍보부", 1000000);
//		Employee e2 = new Employee("1002", "하길동", 2000000);
//		
//		System.out.println(e1);
//		System.out.println(e2);
		
		Company company = new Company();
//		company.enter(new Employee());
		
		while(true) {
			int num = company.menu();
			if(num == 0) break;
			switch (num) {
			case 1: company.enter();
				System.out.println();
				break;
			case 2: company.empInfo();
				System.out.println();
			 	break;
			case 3: company.allEmpInfo();
				System.out.println();
		 		break;
			case 4: company.transfer();
				System.out.println();
		 		break;
			case 5: company.negotiation();
				System.out.println();
	 			break;
			case 6: company.totalPay();
				System.out.println();
				break;
			default:
				break;
			}
		}
		
	}
	
	Employee[] emps = new Employee[100];
	int cnt;
	Scanner sc = new Scanner(System.in);
	
	/**
	 * 입사등록 
	 * @param e
	 */
	void enter() {
		System.out.println("[ 입사등록 ]");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("부서 : ");
		String dept = sc.nextLine();
		System.out.print("급여 : ");
		int pay = Integer.parseInt(sc.nextLine());
		
		if(dept == null || dept.length() == 0) {
			emps[cnt++] = new Employee(name, pay);
		}
		else emps[cnt++] = new Employee(name, dept, pay);
		
		System.out.println("입사 등록이 완료되었습니다.");
	}
	
	/**
	 * 사원검색 
	 */
	void empInfo() {
		System.out.println("[ 사원검색 ]");
		
		// 1) 방법 
//		System.out.print("사번 : ");
//		String id = sc.nextLine();
//		Employee e = searchById(id);
//		if(e == null) {
//			System.out.println("존재하지 않는 사원입니다.");
//		} else {
//			System.out.println(e);
//		}
		
		// 2) 방법 do-while
//		Employee e = null;
//		do {
//			System.out.print("사번 : ");
//			String id = sc.nextLine();
//			e = searchById(id);
//			if(e == null) {
//				System.out.println("존재하지 않는 사원입니다.");
//			} 
//		} while (e == null);
//		System.out.println(e);
		
		// 3) 방법 while
//		Employee e = null;	
//		while(true) {
//			System.out.print("사번 : ");
//			String id = sc.nextLine();
//			e = searchById(id);
//			if(e == null) {
//				System.out.println("존재하지 않는 사원입니다.");
//			} else {
//				break;
//			}
//		}
//		System.out.println(e);
		
		// searchById() : 사번 입력, 조회, employee 리턴 
		Employee e = null;
		e = searchById();
		System.out.println(e);
		
		
	}
	
	/**
	 * 전체사원검색 
	 * @return
	 */
	void allEmpInfo() {
		System.out.println("[ 전체사원조회 ]");
		for(int i=0; i<cnt; i++) {
			System.out.println(emps[i]);
		}
	}
	
	/**
	 * 부서이동 
	 * 1. 사번 입력 -> 2. 사번으로 검색 -> 3. 사번 체크 -> 4. 현재부서 출력 -> 5. 이동부서 입력 -> 6. 부서 변경 
	 * @return
	 */
	void transfer() {
		System.out.println("[ 부서이동 ]");
		// 1) 방법 
//		System.out.print("사번 : ");
//		String id = sc.nextLine();
//		Employee e = searchById(id);
//		
//		if(e == null) {
//			System.out.println("존재하지 않는 사원입니다.");
//		} else {
//			System.out.println("현재 부서 : "+ e.dept);
//			System.out.print("이동할 부서 : ");
//			String dept = sc.nextLine();
//			e.dept = dept;
//			System.out.println("부서 이동이 완료되었습니다.");
//		}
		
		// 2) 방법 while -> 반복되는 코드이기 때문에 searchById 에 작성 
//		Employee e = null;
//		while(true) {
//			System.out.print("사번 : ");
//			String id = sc.nextLine();
//			e = searchById(id);
//			
//			if(e == null) {
//				System.out.println("존재하지 않는 사원입니다.");
//			} else {
//				break;
//			}
//		}
//		System.out.println("현재 부서 : "+ e.dept);
//		System.out.print("이동할 부서 : ");
//		String dept = sc.nextLine();
//		e.dept = dept;
//		System.out.println("부서 이동이 완료되었습니다.");
		
		// 3) 방법 searchById() 수정
		Employee e = null;
		e = searchById();
		System.out.println("현재 부서 : "+ e.dept);
		System.out.print("이동할 부서 : ");
		String dept = sc.nextLine();
		e.dept = dept;
		System.out.println("부서 이동이 완료되었습니다.");
		
	}
	
	/**
	 * 급여 변경 
	 */
	void negotiation() {
		System.out.println("[ 급여변경 ]");
//		System.out.print("사번 : ");
//		String id = sc.nextLine();
//		Employee e = searchById(id);
//		
//		if(e == null) {
//			System.out.println("존재하지 않는 사원입니다.");
//		} else {
//			System.out.println("현재 급여 : "+ e.pay);
//			System.out.print("변경된 급여 : ");
//			int pay = Integer.parseInt(sc.nextLine());
//			e.pay = pay;
//			System.out.println("급여 변경이 완료되었습니다.");
//		}
		
		// searchById() : 사번 입력, 조회, employee 리턴 
		Employee e = null;
		e = searchById();
		System.out.println("현재 급여 : "+ e.pay);
		System.out.print("변경된 급여 : ");
		int pay = Integer.parseInt(sc.nextLine());
		e.pay = pay;
		System.out.println("급여 변경이 완료되었습니다.");
	}
	
	/**
	 * 급여총금액 
	 * @return
	 */
	void totalPay() {
		System.out.println("[ 급여총금액 ]");
		int total = 0;
		for(int i=0; i<cnt; i++) {
			total += emps[i].pay;
		}
		System.out.println(total + " 원 ");
	}
	
	
//	Employee searchById(String id) {
//		Employee e = null;
//		for(int i=0; i<cnt; i++) {
//			if(emps[i].id.equals(id)) {
//				e = emps[i];
//				break;
//			}
//		}
//	}
	
	/**
	 * 사번으로 사원 조회하기
	 * 사번 입력, null값 처리, 객체 리턴시까지 반복 
	 * @return Employee 객체 
	 */
	Employee searchById() {
		Employee e = null;
		while(true) {
			System.out.print("사번 : ");
			String id = sc.nextLine();
			
			for(int i=0; i<cnt; i++) {
				if(emps[i].id.equals(id)) {
					e = emps[i];
					break;
				}
			}
			
			if(e == null) {
				System.out.println("존재하지 않는 사원입니다.");
			} else {
				break;
			}
		}
		return e;
	}
	
	int menu() {
		System.out.println("[ KI COMPANY ]");
		System.out.println(" 0. 종료 | 1. 입사등록 | 2. 사원검색 | 3. 전체사원조회");
		System.out.println(" 4. 부서이동 | 5. 급여변경 | 6. 급여총금액 ");
		System.out.print("선택>> ");
		int sel = Integer.parseInt(sc.nextLine());
		System.out.println();
		return sel;
	}
}
