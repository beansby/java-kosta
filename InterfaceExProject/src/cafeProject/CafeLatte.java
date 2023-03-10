package cafeProject;

public class CafeLatte extends Coffee implements IShot, ILatte {
	String milkType = "milk";
	
	public CafeLatte(int price, boolean cold) {
		super(price, cold);
	}

	@Override
	public void addShot(int cnt) {
		this.shot += cnt;
		this.setPrice(getPrice()+(cnt*SHOT_PRICE));
	}
	
	@Override
	String getName() {
		return "카페라떼";
	}

	@Override
	public void changeMilk(String milk) {
		milkType = milk;
	}

	@Override
	public String toString() {
		return super.toString()+", " + milkType ;
	}
	
	
	

}
