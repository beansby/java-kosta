
public class Dropship extends Unit{

	@Override
	void move(int x, int y) {
		System.out.println("("+ x +", "+ y +")로 날아서 이동");
		
	}
	
	void load() {
		System.out.println("짐을 싣는다");
	}
	
	void unload() {
		System.out.println("짐을 내린다");
	}

}
