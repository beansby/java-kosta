package shapeProject.shape;

public class Circle extends Shape {
	Point center;
	int r;
	
	public Circle() {}

	public Circle(String color, int x, int y, int r) {
		super(color);
		center = new Point(x,y);
		this.r = r;
	}
	
	public Circle(String color, Point center, int r) {
		super(color);
		this.center = center;
		this.r = r;
	}
	
	//도형끼리의 공통 코드가 아니기 때문에 따로 구현해도 상관없으나 껍데기라도 부모 클래스에 정의하고 오버라이드 해서 쓰는 것이 다형성 구현에 효과적 
	@Override
	public void draw() {
		String c = "[ 원: 색-"+getColor()+", 중심점-"+getCenter()+", 반지름-"+getR()+" ]";
		System.out.println(c);
	}
	
	
  
	@Override
	public String toString() {
		return "도형 : Circle \t"+ super.toString() + "\t 중심점 : " + center + "\t 반지름 :" + r ;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	
	
	
	
	
	
}
