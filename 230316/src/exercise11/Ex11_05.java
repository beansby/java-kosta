package exercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * 다음에 제시된 Student클래스가 Comparable인터페이스를 구현하도록 변경해서 
 * 이름(name)이 기본 정렬기준이 되도록 하시오.
 * @author ebina
 *
 */
public class Ex11_05 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("홍길동",1,1,100,100,100)); 
		list.add(new Student("남궁성",1,2,90,70,80)); 
		list.add(new Student("김자바",1,3,80,80,90)); 
		list.add(new Student("이자바",1,4,70,90,70)); 
		list.add(new Student("안자바",1,5,60,100,80));
	
		Collections.sort(list);
		Iterator it = list.iterator();
		
		while(it.hasNext()) 
			System.out.println(it.next());
	}
}



