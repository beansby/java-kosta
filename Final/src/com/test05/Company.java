package com.test05;

import java.util.HashMap;

/**
 * 추상 클래스 및 인터페이스를 사용한 두 개의 클래스를 구현하여 실행 결과의 예와 같이 출력되도록 프로그램을 작성
 * @author ebina
 *
 */
public class Company {
	public static void main(String[] args) {
		 HashMap<Integer, Employee> map = new HashMap<>();

	     // 1번의 데이터를 기반으로 객체를 생성하여 HashMap에 저장한다.
		 // HashMap에 저장시 키 값은 각 객체의 Number로 한다.
		 Employee e1 = new Secretary("홍길동", 1, "Secretary", 800);
		 Employee e2 = new Sales("이순신", 2, "Sales", 1200);
		 
		 map.put(e1.number, e1);
		 map.put(e2.number, e2);
		 
	     // 모든 객체의 기본 정보를 출력한다. 
		 System.out.println("name          department    salary");
		 System.out.println("------------------------------------------");
		 for(Employee e : map.values()) {
			 System.out.println(e);
		 }
		 
	     // 모든 객체의 인센티브 100씩 지급한다.
		 System.out.println();
		 System.out.println("인센티브 100지급");
		 System.out.println();
		 
//		 ((Secretary)e1).incentive(100);
//		 ((Sales)e2).incentive(100);
		 
	     // 모든 객체의 정보와 세금을 출력한다. 
		 System.out.println("name          department    salary   tax");
		 System.out.println("------------------------------------------");
		 for(Employee e : map.values()) {
			 if(e instanceof Secretary) {
				 Secretary se = (Secretary) e;
				 se.incentive(100);		//인센티브 지급 
				 System.out.print(se);
				 System.out.printf("%.2f", se.tax());
				 
			 } else if (e instanceof Sales) {
				 Sales sa = (Sales) e;
				 sa.incentive(100);		//인센티브 지급 
				 System.out.print(sa);
				 System.out.printf("%.2f", sa.tax());
			 }
			 System.out.println();
		 }
	}
}
