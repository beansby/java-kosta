package cafeProject;


abstract public class Coffee extends Beverage {
	String bean;
	//생성자에서 초기화 가능 
	int shot = 1;
	
	public Coffee(int price, boolean cold) {
		super(price, cold);
	}

	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}

	@Override
	public String toString() {
		return  getName()+": "+ shot +  "shot, " + price + "원";
	}
	
	
	
	
	

}
