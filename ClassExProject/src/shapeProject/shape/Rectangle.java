package shapeProject.shape;

public class Rectangle extends Shape {
	Point startPoint;
	int width;
	int height;
	
	public Rectangle(String color, int x, int y, int width, int height) {
		super(color);
		this.startPoint = new Point(x,y);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(String color, Point startPoint, int width, int height) {
		super(color);
		this.startPoint = startPoint;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void draw() {
		String r = "[ 사각형 : 색-"+getColor()+", 시작점-"+getStartPoint()+", 가로-"+getWidth()+", 세로-"+getHeight()+" ]";
		System.out.println(r);
	}

	@Override
	public String toString() {
		return "도형 : Rectangle \t" + super.toString() +"\t 시작점 : " + startPoint + "\t 가로 : " + width + "\t 세로 : " + height ;
	}

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
	

}
