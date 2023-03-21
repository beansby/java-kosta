import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("person.ser");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(new Person("홍길동", 20));
			oos.writeObject(new Person("김길동", 25));
//		} catch (NotSerializableException e) {
//			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

//NotSerializableException 예외처리 : implements Serializeble
class Person implements Serializable {
	int age;
	String name;
	
	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return name+":"+age;
	}
}


class Student extends Person {
	String major;

	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString()+":"+major;
	}
	
}