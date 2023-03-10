
public abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() {
		System.out.println("("+ x +", "+ y +")에 멈춤");
	}
}
