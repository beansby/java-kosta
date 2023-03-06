
public class StaticTest {
	public static void main(String[] args) {
		MyClass.sn = 50;
		MyClass mc = new MyClass();
		mc.in = 10;
//		mc.sn = 20;
		
		MyClass mc2 = new MyClass();
		System.out.println(mc2.in);	//0
		System.out.println(mc2.sn);	//20
	}
}

class MyClass {
	int in;
	static int sn;
	
}