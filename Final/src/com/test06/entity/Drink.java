package com.test06.entity;

public class Drink {
	int price;	//잔액 
	
	public Drink() {
	}

	public Drink(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "를 구입했습니다.";
	}
	
}
