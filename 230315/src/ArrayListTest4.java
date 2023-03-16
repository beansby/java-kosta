import java.util.ArrayList;

public class ArrayListTest4 {
	public static void main(String[] args) {
		//사용시 타입 지정해서 생성 
		ArrayList<Person> pers = new ArrayList<>();
		pers.add(new Person("홍길동", 20));
		pers.add(new Person("고길동", 20));
		pers.add(new Person("장길동", 20));
		
		Person[] pArr = new Person[pers.size()];
		pers.toArray(pArr);
		
//		printInfo(pers); //compile error : parameter type !=
		printInfo(pArr);
		
	}
	
	
	public static void printInfo(Person[] pers) {
		for(Person p : pers) {
			System.out.println(p.info());
		}
	}
	
}
