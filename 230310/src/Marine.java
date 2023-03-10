
public class Marine extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("("+ x +", "+ y +")로 걸어서 이동");

	}
	
	void stimPack() {
		System.out.println("스팀팩한다");
	}
	
}
