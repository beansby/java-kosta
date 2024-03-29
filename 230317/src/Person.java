import java.util.Objects;

public class Person implements Comparable<Person> {
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

	@Override
	public int compareTo(Person o) {
		//ascending (나이순)
//		return age - o.age;
		//descending (나이순)
//		return o.age - age;
	
		//ascending (이름순)
//		return name.compareTo(o.name);
		//descending (이름순)
		return name.compareTo(o.name)*(-1);
//		return o.name.compareTo(name);
		
	}
	
}