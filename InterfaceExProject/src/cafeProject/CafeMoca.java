package cafeProject;

public class CafeMoca extends Coffee {
	public CafeMoca(int price, boolean cold) {
		super(price, cold);
	}
	
	@Override
	String getName() {
		return "카페모카";
	}

}
