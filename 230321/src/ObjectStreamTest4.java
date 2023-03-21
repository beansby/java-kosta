import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ObjectStreamTest4 {
	public static void main(String[] args) {
		pers.add(new Person("홍길동", 20));
		pers.add(new Person("김길동", 25));
		pers.add(new Student("이길동", 23, "인지심리학"));
		
		savePers();
		loadPers();
		for (Person p : pers) {
			System.out.println(p);
		}
	}
	
	static ArrayList<Person> pers = new ArrayList<>();
	
	static void savePers() {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("person2.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(pers);		
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
			fis = new FileInputStream("person2.ser");
			ois = new ObjectInputStream(fis);
			
			pers = (ArrayList<Person>) ois.readObject();
			
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
