
public class SuperTest {
	public static void main(String[] args) {
		Child child = new Child();
		child.method();
	}
}

class Parent {
	int x =10;
	int y = 100;
}

class Child extends Parent {
	int x =20;
	
	void method() {
		System.out.println("x : "+x);				//20
		System.out.println("this.x : "+this.x);		//20  변수명이 같은 변수가 있을시 this는 자식 인스턴스 
		System.out.println("super.x : "+super.x);	//10
		
		System.out.println("this.y : "+this.y);		//100 변수명이 같은 변수가 없을 시 this = super 
		System.out.println("super.y : "+super.y);	//100
	}
}
