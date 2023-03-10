package com.empProject;

import com.empProject.emp.Employee;

public class Company {
	Employee[] emps = new Employee[100];
	int cnt;
	
	public void enterEmp(Employee e) {
		emps[cnt++] = e;
	}
	
	public void allEmpInfo() {
		for(int i=0; i<cnt; i++) {
			System.out.println(emps[i]);
		}
	}
	
	public int getTotalPay() {
		int total=0;
		for(int i=0; i<cnt; i++) {
			total += emps[i].getPay();
		}
		return total;
	}
	
	
}
