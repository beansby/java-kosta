import pac2.ATest;

public class ETest extends ATest{
	

	void method3() {
		//부모클래스의 default variable 접근 불가
//		System.out.println(n);
		//protected variable 접근 가능 
		System.out.println(l);
	}
}
