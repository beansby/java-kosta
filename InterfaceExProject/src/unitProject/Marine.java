package unitProject;

public class Marine extends GroundUnit implements Repairable {
	public Marine() {
		super(40);
		hitPoint = MAX_HP;
	}

	@Override
	public String toString() {
		return "Marine";
	}
	
}
