import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		//List에 있는 배열의 타입 = Object
		ArrayList al = new ArrayList();
		
		//Object obj = 10; 불가
		//Object obj = new Integer(10); wrapper 클래스로 생성되어 upcasting되는 형태 == 박싱 
		//int n = (int) obj; 언박싱 
		al.add(10);
		al.add(20);
		al.add(30);
		
//		System.out.println(al.get(0));
//		int n2 = (int)(al.get(1));
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		for(Object data : al) {
			System.out.println(data);
		}
	}
}
