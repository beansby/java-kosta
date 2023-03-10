package com.empProject.emp;

import com.empProject.BusinessTrip;

public class Sales extends Permanent implements BusinessTrip {
	int incentive;
	
	public Sales() {}

	public Sales(String id, String name, int pay, int incentive) {
		super(id, name, pay);
		setIncentive(incentive);
	}

	@Override
	public int getPay() {
		return super.getPay()+getIncentive();
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}
	
	@Override
	public void goBusinessTrip(int day) {
		incentive += 100000;
	}
}
