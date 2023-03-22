package com.test04;

public class Cargoplane extends Plane {
	public Cargoplane() {
	}
	
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	/**
	 * 10운항시 연료50감소
	 * @param distance
	 */
	@Override
	void flight(int distance) {
		int amount = distance / 10;
		setFuelSize(getFuelSize()-(50*amount));
	}
}
