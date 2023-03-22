package com.test04;

public class Airplane extends Plane {
	public Airplane() {
	}
	
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	/**
	 * 10운항시 연료30감소
	 */
	@Override
	void flight(int distance) {
		int amount = distance / 10;
		setFuelSize(getFuelSize()-(30*amount));
	}

}
