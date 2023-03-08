import pac2.ATest;

/**
 * 다른 패키지에 있는 클래스 생성 및 접근 
 * @author ebina
 *
 */
public class AccessTest1 {
	public static void main(String[] args) {
		//public class - defalut constructor
//		ATest a = new ATest(0);
		//public class - public constructor
		ATest a2 = new ATest();
		
		//default class
//		BTest b = new BTest();
		
		//default variable -> getter, setter 로 변수 접근 
//		a2.n = 10;
		a2.setN(10);
		int n = a2.getN();
		//public variable -> 직접 접근 가능 
		a2.m = 100;
		
		//default method
//		a2.method1();
		//public method
		a2.method2();
	}
}
