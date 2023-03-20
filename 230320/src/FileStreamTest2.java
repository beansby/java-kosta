import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileStreamTest2 {
	public static void main(String[] args) {
		
		FileReader fis = null;
		try {
//			fis = new FileInputStream("fileExample.txt");	//데이터 깨짐 
			fis = new FileReader("fileExample.txt");
			int data;
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
