package exercise11;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 다음의 코드는 성적평균의 범위별로 학생 수를 세기 위한 것이다. 
 * TreeSet이 학 생들의 평균을 기준으로 정렬하도록 compare(Object o1, Object o2)와 
 * 평균점수의 범위를 주면 해당 범위에 속한 학생의 수를 반환하는 getGroupCount()를 완성하라.
 * [Hint] TreeSet의 subSet(Object from, Object to)를 사용하라.
 * @author ebina
 *
 */
public class Ex11_06 {
	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		TreeSet set = new TreeSet(new Comparator<Student>() {	//익명구현클래스 : 일회성 사용, 메소드, 매개변수 내에 정의 (inner class)

			@Override
			public int compare(Student o1, Student o2) {
//				return (int)(o1.getAverage() - o2.getAverage());
				//double 타입의 소수점을 비교하기 위해 int로 casting하는 약식 코드 수정 
				if(o1.getAverage() > o2.getAverage()) return 1;
				else if(o1.getAverage() < o2.getAverage()) return -1;
				else return 0;
			}
			
		});
		
		set.add(new Student("홍길동",1,1,100,100,100)); 
		set.add(new Student("남궁성",1,2,90,70,80)); 
		set.add(new Student("김자바",1,3,80,80,90)); 
		set.add(new Student("이자바",1,4,70,90,70)); 
		set.add(new Student("안자바",1,5,60,100,80));
		
		Iterator it = set.iterator();
		while(it.hasNext()) 
			System.out.println(it.next());
		
		System.out.println("[60~69] :"+getGroupCount(set,60,70)); 
		System.out.println("[70~79] :"+getGroupCount(set,70,80)); 
		System.out.println("[80~89] :"+getGroupCount(set,80,90)); 
		System.out.println("[90~100] :"+getGroupCount(set,90,101));
	}
	
	static int getGroupCount(TreeSet tset, int from, int to) {

//		Student s1 = new Student("from", 0, 0, from, from, from);
//		Student s2 = new Student("to", 0, 0, to, to, to);
//		System.out.println(tset.subSet(s1, s2));
//		System.out.println();
//		
//		return (tset.subSet(s1, s2)).size();
		
		SortedSet<Student> sset = tset.subSet(new Student(null, 0, 0, from, from, from), new Student(null, 0, 0, to, to, to));
		return sset.size();
	}
	
}
