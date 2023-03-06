
public class MethodTest2 {
	
	long add(long a, long b) {
		long result = a+b;
		a=100;
		b=200;
		return result;
	}
	
	
	public static void main(String[] args) {
		System.out.println(MyMath.add(20, 30));
		
		MethodTest2 mm = new MethodTest2();
		int a=10, b=20;
		long sum = mm.add(a, b);
		System.out.println(sum +" "+ a +" "+ b);
	}
	
	
}

class MyMath{
	static long add(long a, long b) {
		long result = a+b;
		return result;
	}
}
