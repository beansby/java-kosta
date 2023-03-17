package exercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * 다음에 제시된 BanNoAscending클래스를 완성하여, 
 * ArrayList에 담긴 Student 인스턴스들이 반(ban)과 번호(no)로 오름차순 정렬되게 하시오.
 * (반이 같은 경우 번호를 비교해서 정렬한다.)
 * @author ebina
 *
 */
public class Ex11_07 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); 
		list.add(new Student("이자바",2,1,70,90,70));
		list.add(new Student("안자바",2,2,60,100,80)); 
		list.add(new Student("홍길동",1,3,100,100,100)); 
		list.add(new Student("남궁성",1,1,90,70,80)); 
		list.add(new Student("김자바",1,2,80,80,90));
		
		Collections.sort(list, new BanNoAscending());
		Iterator it = list.iterator();
		
		while(it.hasNext()) System.out.println(it.next());
	}
}

class BanNoAscending implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int res = o1.ban - o2.ban;
		if(res == 0) {
			res = o1.no - o2.no;
		}
		return res;
	} 
}

