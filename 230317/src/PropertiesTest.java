import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.setProperty("id", "10001");
		prop.setProperty("name", "hong");
		prop.setProperty("email", "hong@naver.com");
		prop.setProperty("address", "seoul");
		
		//Properties -> file 저장 
		try {
			//실행 후 project folder refresh -> file 생성 
			prop.store(new FileOutputStream("member.txt"), "Member Info");
			prop.storeToXML(new FileOutputStream("memberXML.xml"), "Member Info XML");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//file 읽기 
		try {
			prop.load(new FileInputStream("member.txt"));
			System.out.println(prop);	
			System.out.println(prop.getProperty("id"));
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("email"));
			System.out.println(prop.getProperty("address"));
			
			prop.loadFromXML(new FileInputStream("memberXML.xml"));
			System.out.println(prop.getProperty("id"));
			System.out.println(prop.getProperty("name"));
			System.out.println(prop.getProperty("email"));
			System.out.println(prop.getProperty("address"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
