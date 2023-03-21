import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectStreamTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("person.ser");
			ois = new ObjectInputStream(fis);
			
//			Person p = (Person) ois.readObject();
//			System.out.println(p);
//			
//			p = (Person) ois.readObject();
//			System.out.println(p);
			
			//첫번째 저장된 값 
			Object o = ois.readObject();
			if(o instanceof Student) {
				Student s = (Student) o;
				System.out.println(s);
			} else {
				Person p = (Person) o;
				System.out.println(p);
			}
			
			//두번째 저장된 값 
			o = ois.readObject();
			if(o instanceof Student) {
				Student s = (Student) o;
				System.out.println(s);
			} else {
				Person p = (Person) o;
				System.out.println(p);
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
