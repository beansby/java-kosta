
public class Tank extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("("+ x +", "+ y +")로 굴러서 이동");
	}
	
	void changeMode() {
		System.out.println("공격모드를 변환한다.");
	}
}
