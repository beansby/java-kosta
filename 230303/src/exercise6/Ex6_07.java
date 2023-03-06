package exercise6;

/**
 * 두 점의 거리를 계산하는 getDistance()를 완성하시오. 
 * [Hint] 제곱근 계산은 Math.sqrt(double a)를 사용하면 된다.
 * @author ebina
 *
 */
public class Ex6_07 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		// p(1,1)과 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2));
	}
}

class MyPoint {
	int x;
	int y;
	
	MyPoint(int x, int y) { 
		this.x = x;
		this.y = y;
	}
	
	// 두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
	double getDistance(int x1, int y1) {
		double result = Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
		
		return result;
	}
}