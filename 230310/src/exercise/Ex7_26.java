package exercise;

import exercise.Outer.Inner;
import exercise.Outer.Inner2;

/**
 * Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력
 * @author ebina
 *
 */
public class Ex7_26 {
	public static void main(String[] args) {
		Inner2 inner2 = new Inner2();
		System.out.println(inner2.iv);
		
		
		Outer o = new Outer();
		Outer.Inner inner = o.new Inner();
		System.out.println(inner.iv);
		
	}
}

class Outer {
	public Outer() {
		
	}
	
	class Inner {
		int iv = 100;
		public Inner() {
		
		}
	}
	
	static class Inner2 {
		int iv = 200;
	}
}