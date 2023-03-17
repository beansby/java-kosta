import java.util.HashMap;

@SuppressWarnings("unchecked")
public class HashMapTest {
	public static void main(String[] args) {
		//generic
		HashMap<String, Person> pers = new HashMap<>();
		pers.put("hong@naver.com", new Person("홍길동", 20));
		pers.put("song@daum.net", new Person("송길동", 25));
		pers.put("lee@daum.net", new Person("이길동", 30));
		
		Person p = pers.get("lee@daum.net");
		System.out.println(p);
		
		//Object -> type casting 필요 
		HashMap pers2 = new HashMap();
		pers2.put("hong@naver.com", new Person("홍길동", 20));
		pers2.put("song@daum.net", new Person("송길동", 25));
		pers2.put("lee@daum.net", new Person("이길동", 30));
		
		Person p2 = (Person) pers2.get("lee@daum.net");
		System.out.println(p2);
		
		System.out.println();
		
		//HashMap key, value : value의 목록 -> Person 타입 
		for(Person per : pers.values()) {
			System.out.println(per);	//25:송길동 30:이길동 20:홍길동 
		}
		
		System.out.println();
		
		pers.remove("hong@naver.com");
		
		//containsKey : 해당 값이 key에 포함되어 있는지 확인 
		if(pers.containsKey("lee2@daum.net") == false) {
			pers.put("lee2@daum.net", new Person("이길동2", 30));
		}
		
		for(String key : pers.keySet()) {
			System.out.println(pers.get(key));	
		}
	}
}
