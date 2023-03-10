package cafeProject;

abstract public class NonCoffee extends Beverage {
	
	public NonCoffee(int price, boolean cold) {
		super(price, cold);
	}
	
	@Override
	public String toString() {
		return  getName()+": "+ price + "원";
	}
}
