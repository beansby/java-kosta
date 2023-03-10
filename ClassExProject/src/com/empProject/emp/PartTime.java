package com.empProject.emp;

public class PartTime extends Employee {
	int time;
	int payPerTime;
	
	public PartTime() {
	}
	
	public PartTime(String id, String name, int time, int payPerTime) {
		super(id, name);
		setTime(time);
		setPayPerTime(payPerTime);
	}

	@Override
	public int getPay() {
		return getTime()*getPayPerTime();
	}
	
	@Override
	public String toString() {
		return super.toString()+", 급여: " + getPay();
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getPayPerTime() {
		return payPerTime;
	}

	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	
	
}
