import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class DataStreamTest3 {
	public static void main(String[] args) {
//		pers.add(new Person("hong", 20));
//		pers.add(new Person("song", 25));
//		pers.add(new Person("park", 30));
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
				String name = dis.readUTF();
				int age = dis.readInt();
				pers.add(new Person(name, age));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
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