
public class ClassTest {
	public static void main(String[] args) {
		//기본 생성자로 인스턴스화 
		Person p = new Person();
		//레퍼런스 변수 p 로 객체 접근 
		p.name = "홍길동";
		p.age = 20;
		
		p.info();
		
		//사용자 생성자로 인스턴스화 
		Person p2 = new Person("가나다", 25);
		p2.info();
		
		
		//객체 옅은 복사 : 객체 공유(주소값 복사)
		Person p3 = p;
		p.age = 30;
		p3.info();
		
		
	}
}


class Person {
	String name;
	int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void info() {
		System.out.println("name=" + name + ", age=" + age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


class Tv{
	String model;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {channel++;}
	void channelDown() {channel--;}
}
