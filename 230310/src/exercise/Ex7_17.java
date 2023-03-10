package exercise;

/**
 * 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이 클래스를 상속받도록 코드를 변경하시오
 * @author ebina
 *
 */
public class Ex7_17 {
	public static void main(String[] args) {
		Tank tank = new Tank();
		tank.move(1, 2);
		tank.stop();
		tank.changeMode();
	}
}

class Unit{
	//현재 위치 
	int x;
	int y; 
	
	//지정된 위치로 이동 
	void move(int x, int y) {
		System.out.println("( "+x+ ", "+y+ " )로 이동");
		this.x = x;
		this.y = y;
	}
	
	//현재 위치에 정지 
	void stop() {
		System.out.println("현재 위치 ("+x+", "+y+ ")에 정지");
	}
}

class Marine extends Unit { // 보병
	int x, y; // 현재 위치 
	
	//스팀팩 사용 
	void stimPack() {}
}


class Tank extends Unit { // 탱크

	//공격모드 변경 
	void changeMode() {System.out.println("공격모드 변환");}
}


class Dropship extends Unit { // 수송선 
	
	//선택 대상 태우기 
	void load() {}
	
	//선택 대상 내리기 
	void unload() {}

}
