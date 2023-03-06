

public class ClassTest3 {
	public static void main(String[] args) {
		//시작점(startPoint) 10,10 , 가로(width) 20, 세로(height) 5
		Rectangle r1 = new Rectangle(10,10,20,5); 
		Rectangle r2 = new Rectangle(new Point(5,5), 30, 10);
		Rectangle r3 = new Rectangle();
		Rectangle r4 = new Rectangle(30, 10);
	}
}

class Rectangle {
	Point startPoint;
	int width;
	int height;
	
	//생성자 
	public Rectangle(int x, int y, int width, int height) {
		startPoint = new Point(x,y);
		this.width = width;
		this.height = height;
	}

	public Rectangle(Point startPoint, int width, int height) {
		this.startPoint = startPoint;
		this.width = width;
		this.height = height;
	}

	public Rectangle() {
		startPoint = new Point();
	}

	public Rectangle(int width, int height) {
		startPoint = new Point();
		this.width = width;
		this.height = height;
	}
		
}
