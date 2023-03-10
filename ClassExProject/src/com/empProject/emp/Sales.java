package com.empProject.emp;

public class Sales extends Permanent {
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
}
