package shapeProject;

import shapeProject.shape.Shape;

public class ShapeSet {

	Shape[] shapes = new Shape[100];
	int cnt;
	
	void addShape(Shape shape) {
		shapes[cnt++] = shape;
	}
	
	void drawShapes() {
		for(int i=0; i<cnt; i++) {
			//부모클래스 Shape 에 draw() 구현 전 
//			if(shapes[i] instanceof Circle) {
//				Circle circle = (Circle) shapes[i];
//				circle.draw();
//			} else if (shapes[i] instanceof Rectangle) {
//				Rectangle rectangle = (Rectangle) shapes[i];
//				rectangle.draw();
//			} else if (shapes[i] instanceof Triangle) {
//				Triangle triangle = (Triangle) shapes[i];
//				triangle.draw();
//			}
			
			//부모클래스 Shape 에 draw() 구현 후 오버라이딩 
			shapes[i].draw();
		}
	}
}
