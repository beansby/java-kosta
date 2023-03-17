package exercise11;

import java.util.HashSet;
/**
 * 다음은 SutdaCard클래스를 HashSet에 저장하고 출력하는 예제이다. 
 * HashSet에 중복된 카드가 저장되지 않도록 SutdaCard의 hashCode()를 알맞게 오버라이딩하시오. 
 * [Hint] String클래스의 hashCode()를 사용하라.
 * @author ebina
 *
 */
@SuppressWarnings("unchecked")
public class Ex11_11 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3,true); 
		SutdaCard c2 = new SutdaCard(3,true); 
		SutdaCard c3 = new SutdaCard(1,true);
		
		HashSet set = new HashSet(); 
		set.add(c1);
		set.add(c2);
		set.add(c3);
		System.out.println(set);
	}
}



