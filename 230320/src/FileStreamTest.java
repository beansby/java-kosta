import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("fileExample.txt");
			fos = new FileOutputStream("fileCopy.txt");
			
			int data;
			while((data = fis.read()) != -1) {
				fos.write(data);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
