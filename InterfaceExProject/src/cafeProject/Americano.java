package cafeProject;

public class Americano extends Coffee implements IShot {
	public Americano(int price, boolean cold) {
		super(price, cold);
	}
	
	@Override
	public void addShot(int cnt) {
		this.shot += cnt;
		this.setPrice(getPrice()+(cnt*SHOT_PRICE));
	}

	@Override
	String getName() {
		return "아메리카노";
	}
	
	

}
