package gameUnit;

public abstract class Unit {
	int x, y;
	
	int hitPoint;
	final int MAX_HP;
	
	public Unit() {
		MAX_HP = 0;
	}
	
	public Unit(int hp) {
		MAX_HP = hp;
	}
	
	abstract void move(int x, int y);
	void stop() {
		System.out.println("("+ x +", "+ y +")에 멈춤");
	}
	
}
