import gameUnit.Dropship;
import gameUnit.Marine;
import gameUnit.Tank;
import gameUnit.Unit;

public class AbstractTest2 {
	public static void main(String[] args) {
		
		Unit[] units = new Unit[4];
		units[0] = new Marine();
		units[1] = new Tank();
		units[2] = new Dropship();
		units[3] = new Marine();
		
//		for (int i=0; i<units.length; i++) {
//			units[i].move(i+100, i+100);
//		}
	}
}
