package cafeProject;

public class Cafe {
	public static void main(String[] args) {
		Americano americano = new Americano(1500, true);
		CafeLatte latte = new CafeLatte(2000, false);
		CafeMoca moca = new CafeMoca(3000, true);
		Americano americano2 = new Americano(1500, true);
		
		addShot(americano, 2);
		addShot(latte, 1);
//		addShot(moca, 1);
	
		StrawberryLatte sLatte = new StrawberryLatte(3000);
		CafeLatte latte2 = new CafeLatte(2000, false);
	
		
		Cafe cafe = new Cafe();
		cafe.addShot(americano, 2);
		cafe.addShot(latte, 1);
		cafe.changeMilk(sLatte, "soy");
		cafe.changeMilk(latte2, "soy");
		
		cafe.addBeverage(americano);
		cafe.addBeverage(latte);
		cafe.addBeverage(americano2);
		cafe.addBeverage(latte2);
		cafe.addBeverage(moca);
		cafe.addBeverage(sLatte);
		
		cafe.calculate();
		
		
	}
	
	
	
	Beverage[] cart = new Beverage[100];
	int cnt;
	
	public void addBeverage(Beverage beverage) {
		cart[cnt++] = beverage;
	}
	
	public static void addShot(IShot beverage, int cnt) {
		beverage.addShot(cnt);
	}
	
	public static void changeMilk(ILatte beverage, String milk) {
		beverage.changeMilk(milk +" 로 변경");
	}
	
	public void calculate() {
		int total = 0;
		for (int i=0; i<cnt; i++) {
			total += cart[i].getPrice();
			System.out.println(cart[i]);
		}
		System.out.println("총 가격 : "+total+"원 ");
	}
}
