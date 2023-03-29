import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

import javax.imageio.event.IIOReadWarningListener;

public class TextStreamTest {
	public static void main(String[] args) {
//		pers.add(new Person("홍길동", 20));
//		pers.add(new Person("김길동", 25));
//		pers.add(new Student("고길동", 23, "심리학"));
//		savePers();
		loadPers();
	}
	
	static ArrayList<Person> pers = new ArrayList<>();
	
	static void savePers() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;	//라인 단위로 작성하지 않아도 성능 향상 
		try {
			fw = new FileWriter("person.txt");
			bw = new BufferedWriter(fw);
			
			for(Person p : pers) {
				String pstr = "";
				pstr += p.name;
				pstr += ","+p.age;	//구분자 ,
				
				if(p instanceof Student) {
					pstr += ","+((Student)p).major;
				}	
				
				bw.write(pstr);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	static void loadPers() {
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			fr = new FileReader("person.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while((line = br.readLine()) != null) {
//				System.out.println(line);
				String[] lines = line.split(",");
				String name = lines[0];
				int age = Integer.parseInt(lines[1]);
				String major = "";
				if(lines.length == 2) {
					pers.add(new Person(name, age));
				} else if(lines.length == 3) {
					major = lines[2];
					pers.add(new Student(name, age, major));
				}
			}
			
			for (Person p : pers) {
				System.out.println(p);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}