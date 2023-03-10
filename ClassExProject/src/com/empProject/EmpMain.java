package com.empProject;

import com.empProject.emp.Employee;
import com.empProject.emp.PartTime;
import com.empProject.emp.Permanent;
import com.empProject.emp.Sales;

/**
 * [Inherit]
 * Employee -> Permanent -> Sales
 * Employee -> PartTime
 *          
 * Employee : 필드(id, name), 메소드(toString())
 * Permanent : 필드(pay), 메소드(toString(), getPay()) 
 * Sales : 필드(incentive), 메소드(getPay())
 * PartTime : 필드(time, payPerTime), 메소드(toString(), getPay())
 * 
 * toString() : 사번 : 1000, 이름 : 홍길동, 급여 : 1000000
 * @author ebina
 *
 */
public class EmpMain {
	public static void main(String[] args) {
		Company com = new Company();
		
		Permanent emp1 = new Permanent("1001","hong", 2000000);
		Sales emp2 = new Sales("1002","kim", 2000000, 500000);
		PartTime emp3 = new PartTime("1003", "lee", 160, 15000);
		
		com.enterEmp(emp1);
		com.enterEmp(emp2);
		com.enterEmp(emp3);
		
//		com.enterEmp(new Permanent("1001","hong", 2000000));
//		com.enterEmp(new Sales("1002","kim", 2000000, 500000));
//		com.enterEmp(new PartTime("1003", "lee", 160, 15000));
		
		com.allEmpInfo();
		System.out.println("급여 총액: "+com.getTotalPay()+"원 ");
		
		System.out.println();
		
//		com.regBusinessTrip(emp1, 2);
		com.regBusinessTrip(emp2, 2);
		com.regBusinessTrip(emp3, 3);
		com.allEmpInfo();
	}
}
