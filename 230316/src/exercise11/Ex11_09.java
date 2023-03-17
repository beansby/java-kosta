package exercise11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * 문제11-8의 Student클래스에 반등수(classRank)를 저장하기 위한 인스턴스변수를 추가하였다. 
 * 반등수를 계산하고 반과 반등수로 오름차순 정렬하여 결과를 출력하시오. (1)~(2)에 알맞은 코드를 넣어 완성하시오.
 * @author ebina
 *
 */
@SuppressWarnings("unchecked")
public class Ex11_09 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Student("이자바",2,1,70,90,70)); 
		list.add(new Student("안자바",2,2,60,100,80)); 
		list.add(new Student("홍길동",1,3,100,100,100)); 
		list.add(new Student("남궁성",1,1,90,70,80)); 
		list.add(new Student("김자바",1,2,80,80,90));
		
		calculateSchoolRank(list); 
		calculateClassRank(list);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) 
			System.out.println(it.next());
	}
	
	
	public static void calculateClassRank(List list) {
		// 먼저 반별 총점기준 내림차순으로 정렬한다. 
		Collections.sort(list, new ClassTotalComparator());
		
		int prevBan = -1;
		int prevRank = -1;
		int prevTotal = -1;
		int length = list.size();
		
		int same = 0;
		
		/*(2) 아래의 로직에 맞게 코드를 작성하시오.
		1. 반복문을 이용해서 list에 저장된 Student객체를 하나씩 읽는다.
		1.1 반이 달라지면,(ban과 prevBan이 다르면)
		이전 등수(prevRank)와 이전 총점(prevTotal)을 초기화한다.
		1.2 총점(total)이 이전총점(prevTotal)과 같으면
		이전 등수(prevRank)를 등수(classRank)로 한다.
		1.3 총점이 서로 다르면,
		등수(classRank)의 값을 알맞게 계산해서 저장한다.
		이전에 동점자였다면, 그 다음 등수는 동점자의 수를 고려해야 한다. (실행결과 참고)
		1.4 현재 반과 총점과 등수를 이전 반(prevBan),
		이전 총점(prevTotal), 이전 등수(prevRank)에 저장한다.
		*/
		
		for(Object o : list) {
			Student student = (Student) o;
			if(student.ban != prevBan) {
				prevBan = -1;
				prevRank = -1;
				
				student.classRank = prevRank == -1 ? 1 : prevRank + same + 1;
				same = 0;
			} else {
				
				if(student.getTotal() == prevTotal) {
					student.classRank = prevRank;
					same++;
				} else {
					student.classRank = prevRank == -1 ? 1 : prevRank + same + 1;
					same = 0;
				}
			}	
			prevBan = student.ban;
			prevRank = student.classRank;
			prevTotal = student.getTotal();
			
		}

	}
	
	public static void calculateSchoolRank(List list) {
		Collections.sort(list); // 먼저 list를 총점기준 내림차순으로 정렬한다.
		int prevRank = -1; // 이전 전교등수 
		int prevTotal = -1; // 이전 총점 
		int length = list.size();
		
		int same = 0; 	//같은 등수 
		
		for(Object o : list) {
			Student student = (Student) o;
			if (student.getTotal() == prevTotal) {
				student.schoolRank = prevRank;
				same++;
			} else {
				student.schoolRank = prevRank == -1 ? 1 : prevRank + same + 1;
				same = 0;
			}
			prevRank = student.schoolRank;
			prevTotal = student.getTotal();
		}
	}
	
	
}


class ClassTotalComparator implements Comparator<Student> { 
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.ban == o2.ban) return o2.getTotal() - o1.getTotal();
		return o1.ban - o2.ban;
	}
}

