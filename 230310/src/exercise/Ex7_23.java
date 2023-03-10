package exercise;


/**
 * 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시오.
 * 
 * 1. 메서드명 : sumArea
 * 기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다. 
 * 반환타입 : double
 * 매개변수 : Shape[] arr
 * @author ebina
 *
 */
public class Ex7_23 {
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)}; 
		System.out.println("면적의 합:"+sumArea(arr));
	}
	
	static double sumArea(Shape[] arr) {
		double sum = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i] instanceof Circle) {
				Circle c = (Circle) arr[i];
				sum += c.calcArea();
			} else if (arr[i] instanceof Rectangle) {
				Rectangle r = (Rectangle)arr[i];
				sum += r.calcArea();
			}
		}
		return sum;
	}
}

/**
 * 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래 스와 Rectangle클래스를 작성하시오. 
 * 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야 한다.
 * (1) 클래스명 : Circle
 * 조상클래스 : Shape
 * 멤버변수 : double r - 반지름
 * (2) 클래스명 : Rectangle
 * 조상클래스 : Shape
 * 멤버변수 : double width - 폭 double height - 높이
 * 
 * (2-1) 메서드명 : isSquare
 * 기능 : 정사각형인지 아닌지를 알려준다. 
 * 반환타입 : boolean
 * 매개변수 : 없음 
 * @author ebina
 *
 */
abstract class Shape {
	Point p;
	
	//생성자 
	public Shape() {
		this(new Point(0,0));
	}

	public Shape(Point p) {
		this.p = p;
	}
	
	/**
	 * 도형 면적 계산해서 반환하는 메소드 
	 * @return
	 */
	abstract double calcArea();

	public Point getPosition() {
		return p;
	}

	public void setPosition(Point p) {
		this.p = p;
	}
}

class Point {
	int x;
	int y;
	
	public Point() {
		this(0,0);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
}


class Circle extends Shape {
	double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	double calcArea() {
		
		return r*r*Math.PI;
	}
	
	
}

class Rectangle  extends Shape {
	double width;
	double height;
	

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}


	@Override
	double calcArea() {
		return width * height ;
	}
	
	
	boolean isSquare() {
		if (width != 0 && height != 0) {
			return true;
		} else return false;
	}
}


