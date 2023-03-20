import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) {
		FileOutputStream fos = null; 
		DataOutputStream dos = null;
		
		String name = "hong";
		int age = 20;
		double height = 178.3;
		
		
		try {
			// 기반 스트림 
			fos = new FileOutputStream("person.data");
			// 보조 스트림 
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(name);		//문자열 
			dos.writeInt(age);
			dos.writeDouble(height);
			
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
}
