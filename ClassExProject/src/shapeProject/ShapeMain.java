package shapeProject;

import shapeProject.shape.Circle;
import shapeProject.shape.Point;
import shapeProject.shape.Rectangle;
import shapeProject.shape.Shape;
import shapeProject.shape.Triangle;

public class ShapeMain {
	public static void main(String[] args) {
//		shapes[cnt++] = new Circle("red",10,10,5);
//		shapes[cnt++] = new Circle("blue", new Point(20,20), 10);	//중심점, 반지름 
//		shapes[cnt++] = new Rectangle("green", 5, 5, 20, 10);	//시작점,가로,세로 
//		shapes[cnt++] = new Rectangle("yellow", new Point(1,1), 30, 20);
//		shapes[cnt++] = new Triangle("orange", 1, 1, 5, 5, 10, 10); //세 점 
//		shapes[cnt++] = new Triangle("purple", new Point(10,10), new Point(15,15), new Point(17,17));
		
		ShapeSet ss = new ShapeSet();
		
		ss.addShape(new Circle("red",10,10,5));
		ss.addShape(new Circle("blue", new Point(20,20), 10));	//중심점, 반지름 
		ss.addShape(new Rectangle("green", 5, 5, 20, 10));	//시작점,가로,세로 
		ss.addShape(new Rectangle("yellow", new Point(1,1), 30, 20));
		ss.addShape(new Triangle("orange", 1, 1, 5, 5, 10, 10)); //세 점 
		ss.addShape(new Triangle("purple", new Point(10,10), new Point(15,15), new Point(17,17)));
		
		ss.drawShapes();
	}
}
