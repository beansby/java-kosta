package gameUnit;

public class Marine extends Unit implements Fightable {

	@Override
	void move(int x, int y) {
		System.out.println("("+ x +", "+ y +")로 걸어서 이동");

	}
	
	void stimPack() {
		System.out.println("스팀팩한다");
	}

	@Override
	public void attack() {
		System.out.println("마린이 공격하고 있음");
	}
	
	
	
}
