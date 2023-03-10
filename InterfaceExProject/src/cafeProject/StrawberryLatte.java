package cafeProject;

public class StrawberryLatte extends NonCoffee implements ILatte {
	String milkType = "milk";
	
	public StrawberryLatte(int price) {
		super(price, true);
	}
	
	@Override
	String getName() {
		return "딸기라떼";
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
