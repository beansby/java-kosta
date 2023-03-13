import java.util.Objects;

public class CloneTest2 {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동", 20);
		Person p2 = p1;				//얕은 복사 
		Person p3 = new Person(p1);	//깊은 복사 
		Person p4 = (Person) p1.clone();
		
		p1.age = 30;
		System.out.println(p1);
		System.out.println(p2);
		
		
		System.out.println(p3);
		System.out.println(p4);
		
		Person p5 = new Person("고길동", 20);
		Person p6 = new Person("고길동", 20);
		
		System.out.println(p5 == p6);		//false
		System.out.println(p5.equals(p6));	//true
		
	}
}

/**
 * 복제가 가능하게 지원해주는 인터페이스 
 * implements Cloneable 안할 경우 CloneNotSupportedException 발생 
 * @author ebina
 *
 */
class Person implements Cloneable {
	int age;
	String name;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public Person(Person p) {
		this.age = p.age;
		this.name = p.name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	//protected -> public, throws Exception 생략 후 try-catch로 예외처리 
	@Override
	public Object clone() {
		Object obj = null;
		
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}


	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false; 
		//Person 
		Person p = (Person) obj;
		return age == p.age && name.equals(p.name);	//true
	}

	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}

	
	

	
	
	
	
	
}