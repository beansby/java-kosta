
public class ClassTest4 {
	public static void main(String[] args) {
		//p1 : (10,10), p2:(20,20), p3:(30,30)
		Triangle t1 = new Triangle(10,10,20,20,30,30);
		System.out.println(t1.draw());
	}
}


class Triangle {
	Point p1 = new Point();
	Point p2 = new Point();
	Point p3 = new Point();
	
	public Triangle() {
		
	}

	public Triangle(int x, int y, int x2, int y2, int x3, int y3) {
//		p1 = new Point(x,y);
//		p2 = new Point(x2, x2);
//		p3 = new Point(x3, y3);
		p1.x = x;
		p1.y = y;
		p2.x = x2;
		p2.y = y2;
		p3.x = x3;
		p3.y = y3;
	}
	
	String draw() {
		String str = "[삼각형 : 점1-"+p1+", 점2-"+p2+", 점3-"+p3.toString()+"]";
		return str;
	}
}