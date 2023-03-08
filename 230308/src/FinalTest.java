
public class FinalTest {
	public static void main(String[] args) {
		final int n;
		n=10;
//		n=20;
	}
}


class Test {
	//각 객체당 가지고 있는 변수 : setter 함수 사용 불가, 생성자 or 명시적 초기화만 가능 
	final int NUM;
	
	public Test(int n) {
		NUM = n;
	}
}

final class Test2 {}
//class Test3 extends Test2 {}

class Test4 {
	final void method() {}
}

class Test5 extends Test4 {
//	void method() {}
}