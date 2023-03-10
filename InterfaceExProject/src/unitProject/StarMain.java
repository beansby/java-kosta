package unitProject;

public class StarMain {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Marine marine = new Marine();
		SCV scv = new SCV();
		DropShip dropShip = new DropShip();
		
		scv.repair(tank);
		scv.repair(scv);
		scv.repair(marine);
//		scv.repair(dropShip);
		
	}
}
