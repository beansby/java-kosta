package shapeProject.shape;

//객체 생성 불가 
public abstract class Shape {
	String color;

	public Shape() {}
	
	public Shape(String color) {
		this.color = color;
	}

	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	//추상 메소드 : 오버라이딩 필수 
	public abstract void draw();
	
	@Override
	public String toString() {
		return "색상 : " + color;
	}	
}
