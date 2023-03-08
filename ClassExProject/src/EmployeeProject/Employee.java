package EmployeeProject;

public class Employee {
	static int sid = 1000;	//사번 자동생성 
	String id;
	String name;
	String dept;
	int pay;
	
	public Employee() {	
		this.id = ++sid + "";
;	}
	
	public Employee(String name, String dept, int pay) {
		this.id = ++sid + "";
		this.name = name;
		this.dept = dept;
		this.pay = pay;
	}
	
	public Employee( String name, int pay) {
		this.id = ++sid + "";
		this.name = name;
		this.pay = pay;
		dept = "NONE";
	}


	@Override
	public String toString() {
//		System.out.println("Employee [사번 =" + id + ", 이름 =" + name + ", 소속 =" + dept + ", 급여 =" + pay + "]");
		return "사번 : " + id + "\t 이름 : " + name + "\t 부서 : " + dept + "\t 급여 : " + pay ;
	}

	
}