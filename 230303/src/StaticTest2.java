
public class StaticTest2 {
	public static void main(String[] args) {
		
		//정적 필드, 메소드 : 객체 생성 없이 사용 가능 
		TestClass.sv = 100;
		TestClass.sfunc();
		TestClass.setPsv(100);
		System.out.println(TestClass.getPsv());
		
		//인스턴스 필드, 메소드 : 객체 생성 후 변수를 통해 사용 가능 
		TestClass t = new TestClass();
		t.iv = 20;
		t.ifunc();
	}
}


class TestClass {
	int iv;
	static int sv;
	private int piv;
	private static int psv;
	
	void ifunc() {
		iv = 10;
		sv = 200;
	}

	static void sfunc() { 
		//정적 메소드 내부에서 인스턴스 필드, 메소드 사용 불가 
		//iv = 20;
		sv = 200;
	}
	
	public int getPiv() {
		return piv;
	}

	public void setPiv(int piv) {
		this.piv = piv;
	}

	public static int getPsv() {
		return psv;
	}

	public static void setPsv(int psv) {
		TestClass.psv = psv;
	}
}