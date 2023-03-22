package com.test05;

public class Secretary extends Employee implements Bonus{
	
	public Secretary() {
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	/**
	 * 세금 리턴. salary에 10% 징수.
	 */
	@Override
	double tax() {
		double tax = getSalary()*0.1;
		return tax;
	}

	/**
	 * 인센티브 지급. pay에 80%가 기존 salary에 더해진다.
	 * @param pay
	 */
	@Override
	public void incentive(int pay) {
		setSalary((int)(getSalary()+(pay*0.8)));
	}
	
	

}
