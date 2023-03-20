
public class PrintStreamTest {
	public static void main(String[] args) {
		String name = "hong";
		int age = 20;
		double height = 173.5;
		
		// %의 갯수만큼 매개변수 존재 
		System.out.printf("이름: %s, 나이: %d, 키: %.1f", name, age, height);
	}
}
