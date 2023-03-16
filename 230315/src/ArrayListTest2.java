import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		//
		ArrayList alist = new ArrayList();
		alist.add(new Person("hong", 20));
		alist.add(new Person("song", 25));
		alist.add(new Person("hang", 30));
		
//		for(Person p : alist) {
//			System.out.println(p.info());
//		}
		
		for(Object p : alist) {
			System.out.println(((Person)p).info());
		}
		
		
		//generic 타입 : 기본 타입(int) 불가, 클래스 타입(Integer) 허용
		ArrayList<Person> alist2 = new ArrayList<Person>();
		alist2.add(new Person("hong", 20));
		alist2.add(new Person("song", 25));
		alist2.add(new Person("hang", 30));
		
		for(Person p : alist2) {
			System.out.println(p.info());
		}
	}
}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String info() {
		return name+", "+age;
	}
	
}