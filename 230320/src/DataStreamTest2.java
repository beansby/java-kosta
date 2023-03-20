import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream("person.data");
			dis = new DataInputStream(fis);
			
			String name = dis.readUTF();
			int age = dis. readInt();
			double height = dis.readDouble();
			
			System.out.println(name+", "+age+", "+height);
			
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

