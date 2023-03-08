/**
 * 같은 패키지에 있는 클래스 생성 및 접근 
 * @author ebina
 *
 */
public class AccessTest2 {
	public static void main(String[] args) {
		//public class - default constructor
		CTest c = new CTest();
		//public class - private constructor
//		CTest c2 = new CTest(10);
		
		
		//default class
		DTest d = new DTest();
		//private variable 
//		d.n = 20;
		//default variable
		d.m = 10;
	}
}
