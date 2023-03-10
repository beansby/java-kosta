package unitProject;

public class SCV extends GroundUnit implements Repairable {
	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "SCV";
	}
	
	public void repair (Repairable unit) {
		if(unit instanceof Unit) {
			Unit u = (Unit) unit;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
		}
	}
}
