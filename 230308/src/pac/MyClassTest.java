package pac;

import java.sql.Date;
//import com.kosta.MyClass;
//import com.kosta.YourClass;
import com.kosta.*;	//kosta의 하위 패키지까지 import 되는 것은 아님 

public class MyClassTest {
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		Date date = new Date(2023, 3, 8);
		java.util.Date date2 = new java.util.Date();
		
		YourClass yc = new YourClass();
	}
}
