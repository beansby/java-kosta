
public class MethodTest1 {
	public static void main(String[] args) {
		int n=30;
		System.out.println(n);
		
		//메소드 호출 
		function1();
		
		System.out.println("main 종료");
	}
	
	/**
	 * 메소드 정의 
	 */
	public static void function1() {
		int n=10;
		System.out.println(n);
		function2();
		System.out.println("function1 종료");
	}
	
	public static void function2() {
		int n=20;
		System.out.println(n);
		System.out.println("function2 종료");
	}
}
