import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.colorchooser.AbstractColorChooserPanel;

public class ObjectStreamTest3 {
	public static void main(String[] args) {
		pers.add(new Person("홍길동", 20));
		pers.add(new Person("김길동", 25));
		pers.add(new Student("이길동", 23, "인지심리학"));
//		
//		savePers();
		loadPers();
		
		for (Person person : pers) {
			System.out.println(person);
		}
		
	}
	
	static ArrayList<Person> pers = new ArrayList<>();
	
	static void savePers() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("person.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeInt(pers.size());		//데이터 갯수 
			
			for (Person p : pers) {
				oos.writeObject(p);;
			}
			
			
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
	
	static void loadPers() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("person.ser");
			ois = new ObjectInputStream(fis);
			
			int size = ois.readInt(); 	//데이터 갯수 읽기 
			for(int i=0; i<size; i++) {
				Object o = ois.readObject();
				if(o instanceof Student) {
					pers.add((Student)o);
					
				} else {
					pers.add((Person)o);
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
			} catch (IOException e) { 
				e.printStackTrace();
			}
		}
	}
	
	
	
}
