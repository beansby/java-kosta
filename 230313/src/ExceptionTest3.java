
public class ExceptionTest3 {
	public static void main(String[] args) {
		// 예외처리 1)
//		try {
//			method1();
//		} catch (NullPointerException e) {
//			System.out.println("null 예외 발생 ");
//			e.printStackTrace();
//		}
//		System.out.println("종료");
		
		// 예외처리 2)
		try {
			method1();
		} catch (Exception e) {
			System.out.println("null 예외 발생 ");
			e.printStackTrace();
		}
		System.out.println("종료");
	}
	
	// 예외처리 1)
//	static void method1() {
//		String str = null;
//		try {
//			System.out.println(str.toString());
//		} catch (NullPointerException e) {
//			System.out.println("1차 null 예외 처리 - main에서 예외처리 하지 않음 ");
//			throw e; //main에서도 예외처리 함 
//			thorow new Exception("2차 예외 처리 ";
//		}
//	}
	
	// 예외처리 2)
	static void method1() throws Exception {
		String str = null;
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println("1차 null 예외 처리 - main에서 예외처리 하지 않음 ");
			throw new Exception("2차 null 예외 처리 ");
		}
	}
}
