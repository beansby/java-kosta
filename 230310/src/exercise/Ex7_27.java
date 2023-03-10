package exercise;


public class Ex7_27 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		Outer1.Inner1 inner = o.new Inner1();
		
		inner.method1();
	} 
}

class Outer1 {
	int value = 10;
	
	class Inner1{
		int value = 20;
		void method1() {
			int value = 30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer1.this.value);
		}
	}
}