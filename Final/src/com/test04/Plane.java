package com.test04;

public abstract class Plane {
	String planeName;
	int fuelSize;
	
	public Plane() {
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	/**
	 * 일정양의 연료 주입, 기존 연료가 증가
	 * @param fuel
	 */
	void refuel(int fuel) {
		setFuelSize(fuelSize+fuel);
	};
	
	/**
	 * 일정거리만큼 운항, 연료감소
	 * 추상 메소드 
	 * @param distance
	 */
	abstract void flight(int distance);

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	@Override
	public String toString() {
		return planeName +" "+ fuelSize; 
	}
	
	
}
