
public class InheritTest2 {
	public static void main(String[] args) {
		Derived d1 = new Derived();
		Derived d2 = new Derived(100);
		System.out.println(d1.bnum);	//0
		System.out.println(d1.dnum);	//0
		System.out.println(d2.bnum);	//0
		System.out.println(d2.dnum);	//100
		
		System.out.println("========================= 자식 객체 생성 ");
		Derived d3 = new Derived(100,200);
		System.out.println(d3.bnum);	//100
		System.out.println(d3.dnum);	//200
		
		d3.method1();
		d3.method2();
		
		System.out.println("========================= 부모 객체 생성 ");
		Base b1 = new Base();
		b1.method1();
		b1.method2();
	}
}


class Base {
	int bnum;
	
	public Base() {
		System.out.println("Parents() constructor");
	}

	public Base(int bnum) {
		this.bnum = bnum;
		System.out.println("Parents(int bnum) constructor");
	}
	
	void method1() {
		System.out.println("method1 - Parents");
	}
	
	void method2() {
		System.out.println("method2 - Parents");
	}
	
}


class Derived extends Base {
	int dnum;
	
	public Derived() {
//		super();
		System.out.println("Child() constructor");
	}
	
	public Derived(int num) {
		dnum = num;
		System.out.println("Child(int num) constructor");
	}
	
	public Derived(int bnum, int dnum) {
//		this.bnum = bnum;	//부모의 기본 생성자 호출 
		super(bnum);		//부모의 매개변수 bnum을 갖는 생성자 명시적 지정 호출 : 효율적 
		this.dnum = dnum;
		System.out.println("Child(int bnum, int dnum) constructor");
	}
	
	// 오버로딩 Overloading : 부모 메소드와 함수명은 같으나 파라미터가 다름 
	void method1(int n) {
		System.out.println("method1 - Child (Overloading)");
	}
	
	// 오버라이딩 Overriding : 부모 메소드와 함수명, 파라미터가 같음 
	void method1() {
		super.method1();
		System.out.println("method1 - Child (Overriding)");
	}
	
	void method2() {
		System.out.println("method2 - Child");
	}
}
