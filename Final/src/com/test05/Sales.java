package com.test05;

public class Sales extends Employee implements Bonus {
	public Sales() {
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	/**
	 * 세금 리턴. salary에 13% 징수.
	 */
	@Override
	double tax() {
		double tax = getSalary()*0.13;
		return tax;
	}
	
	/**
	 * 인센티브 지급. pay에 120%가 기존 salary에 더해진다.
	 */
	@Override
	public void incentive(int pay) {
		setSalary((int)(getSalary()+(pay*1.2)));
	}

	

}
