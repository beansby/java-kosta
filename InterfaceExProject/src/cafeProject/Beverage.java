package cafeProject;

abstract public class Beverage {
	int price;
	boolean cold;
	
	public Beverage(int price, boolean cold) {
		this.price = price;
		this.cold = cold;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isCold() {
		return cold;
	}

	public void setCold(boolean cold) {
		this.cold = cold;
	}
	
	abstract String getName();
	

}
