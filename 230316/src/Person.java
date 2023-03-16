import java.util.Objects;

public class Person {
	int age;
	String name;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	String info() {
		return name+":"+age;
	}

	@Override
	public String toString() {
		return "" + age + ":" + name + "";
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person == false) return false;
		Person p = (Person) obj;
		return name.equals(p.name) && age == p.age;
	}
	
	
	
	
}