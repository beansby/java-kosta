import java.util.ArrayList;
import java.util.Iterator;
import java.util.jar.Attributes.Name;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> sarr = new ArrayList<>();
		sarr.add("원숭이");
		sarr.add("호랑이");
		sarr.add("기린");
		sarr.add("토끼");
		
		for(int i=0; i<sarr.size(); i++) {
			System.out.println(sarr.get(i));
		}
		
		System.out.println();
		
		//Iterator가 있어야 향상된 for 문 사용 가
		for (String ani : sarr) {
			System.out.println(ani);
		}
		
		System.out.println();
		
		Iterator<String> it = sarr.iterator();	//원숭이 이전의 포지션을 가지고 있음 
		while (it.hasNext()) {
			String ani = it.next();
			System.out.println(ani);
		}
		
		String name1 = "ha";
		String name2 = "ha";
		System.out.println(name1.compareTo(name2)); //0
		
		
	}
}
