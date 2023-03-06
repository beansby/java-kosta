
public class ClassTest2 {
	public static void main(String[] args) {
		//x,y,radius
		Circle c1 = new Circle(10,10,20);	
		Circle c2 = new Circle(new Point(20, 20), 30);

		Circle c3 = new Circle();
		Circle c4 = new Circle(25);
		c3.toString();
		c4.toString();
		
		System.out.println(c1.draw());
		
	}
}

class Circle {
	Point center;
	int radius;
	
	//생성자 
	public Circle(int x, int y, int radius) {
		center = new Point(x, y);
		this.radius = radius;
	}
	

	public Circle(Point center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	
	public Circle() {
		center = new Point();
	}
	
	
	public Circle(int radius) {
		center = new Point();
		this.radius = radius;
	}
	
	String draw() {
		String str = "[원: 중심점-"+center.toString() +", 반지름-"+ radius +"]";
		return str;
	}


	@Override
	public String toString() {
		String str = "Circle [center=" + center.x +", "+ center.y + ", radius=" + radius + "]";
		System.out.println(str);
		return str;
	}
}


class Point{
	int x;
	int y;

	
	//생성
	public Point() {
		
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		String string = "Point [x=" + x + ", y=" + y + "]";
		String str = "(" + x + ", " + y + ")";
		return str;
	}
	
	
}