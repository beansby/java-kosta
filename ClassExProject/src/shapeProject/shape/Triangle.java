package shapeProject.shape;

public class Triangle extends Shape {
//	Point p1;
//	Point p2;
//	Point p3;
	Point[] points = new Point[3];
	
	
	
	public Triangle(String color) {
		super(color);
	}

	public Triangle(String color, int x, int y, int x2, int y2, int x3, int y3) {
		super(color);
		this.points[0] = new Point(x,y);
		this.points[1] = new Point(x2, y2);
		this.points[2] = new Point(x3, y3);
	}
	
	public Triangle(String color, Point p1, Point p2, Point p3) {
		super(color);
		this.points[0] = p1;
		this.points[1] = p2;
		this.points[2] = p3;
	}
	
	@Override
	public void draw() {
		String t = "[ 삼각형 : 색-"+getColor()+", 점1-"+getPoints()[0]+", 점2-"+getPoints()[1]+", 점3-"+getPoints()[2]+" ]";
		System.out.println(t);
	}

	@Override
	public String toString() {
		return "도형 : Triangle \t" + super.toString() +"\t 점1 : " + getPoints()[0] + "\t 점2 : " + getPoints()[1] + "\t 점3 : " + getPoints()[2] ;
	}

	public Point[] getPoints() {
		return points;
	}

	public void setPoints(Point[] points) {
		this.points = points;
	}

	
	
	
	

}
