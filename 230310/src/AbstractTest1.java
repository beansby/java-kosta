
public class AbstractTest1 {
	public static void main(String[] args) {
		//추상 클래스는 객체 생성 불가 
//		Player p = new Player();
	}
}

abstract class Player {
	int currentPos;
	
	Player() {
		currentPos = 0;
	}
	
	abstract void play(int pos);
	abstract void stop();
	
	//Overloading
	void play() {
		play(currentPos);
	}
}

class Marin extends Player {

	@Override
	void play(int pos) {

		
	}

	@Override
	void stop() {
		
	}
	
}