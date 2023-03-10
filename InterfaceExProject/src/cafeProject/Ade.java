package cafeProject;

public class Ade extends NonCoffee {
	//ice only 음료 
	public Ade(int price) {
		super(price, true);
	}
	
	@Override
	String getName() {
		return "에이드";
	}
}
