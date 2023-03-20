import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DataStreamTest3 {
	public static void main(String[] args) {
//		pers.add(new Person("hong", 20));
//		pers.add(new Person("son", 32));
//		pers.add(new Person("park", 30));
//		pers.add(new Student("kang", 50, "computer"));
//		writePersons();
		
		readPersons();
		for(Person p : pers) {
			System.out.println(p);
		}
	}
	
	static ArrayList<Person> pers = new ArrayList<>();
	
	
	public static void writePersons() {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("pers.data");
			dos = new DataOutputStream(fos);
			
			dos.writeInt(pers.size());	//데이터 갯수 저장 
			for (Person p : pers) {		//데이터 저장 : 데이터 갯수만큼 반복  
				// 타입을 구분하는 규칙 지정 : 앞 부분에 기재 
				if(p instanceof Student) {
					dos.writeChar('S');
					dos.writeUTF(((Student)p).major); //downcasting 먼저 
				} else { 
					dos.writeChar('P');
				}
				
				dos.writeUTF(p.name);
				dos.writeInt(p.age);
				
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dos != null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void readPersons() {
		/* 
		 * 1. 데이터 갯수
		 * 2. 3-4번 데이터 갯수만큼 반복
		 * 3. 이름 읽기
		 * 4. 나이 읽기
		 * 5. Person객체 생성 후 per에 추가 
		 */
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("pers.data");
			dis = new DataInputStream(fis);
			
			int data = dis.readInt();
			for (int i=0; i<data; i++) {
				char type = dis.readChar();
				String major = null;
				String name = null;
				int age = 0;
				
				if(type == 'S') {
					major = dis.readUTF();
					name = dis.readUTF();
					age = dis.readInt();
					pers.add(new Student(name, age, major));
				} else if(type == 'P') {
					name = dis.readUTF();
					age = dis.readInt();
					pers.add(new Person(name, age));
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dis != null) dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}


class Person {
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