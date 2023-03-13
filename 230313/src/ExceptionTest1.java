
public class ExceptionTest1 {
	public static void main(String[] args) {
		String str = null;
		
		try {
			System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("종료 ");
	}
}
