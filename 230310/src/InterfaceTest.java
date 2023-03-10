
public class InterfaceTest {
	public static void main(String[] args) {
		Fighter f1 = new Fighter();
		f1.attack();
		f1.move(0, 0);
		f1.stop();
		
		System.out.println();
		
		//upcasting - class 
		Unit f2 = new Fighter();
//		f2.attack();
		f2.move(0, 0);
		f2.stop();
		
		//upcasting - interface 
		Fightable f3 = new Fighter();
		f3.attack();
//		f3.move(0, 0);
//		f3.stop();
		
		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		attack(f1);
//		attack(f2);	//error
		attack(f3);
		attack(marine);
		attack(tank);
//		attack(dropship);	//error
	}
	
	static void attack(Fightable f) {
		
		
	}
}


interface Fightable {
	void attack();
}


class Fighter extends Unit implements Fightable {

	@Override
	public void attack() {
		System.out.println("공격하고 있음");
	}

	@Override
	void move(int x, int y) {
		System.out.println("이동하고 있음");
	}
}