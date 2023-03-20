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
			
//			int data;
//			while((data = fis.read()) != -1) {
//				fos.write(data);
//			}
			
			byte[] buff = new byte[512];
			int len;
			// 읽어온 길이가 0보다 크면 
			while((len = fis.read(buff)) > 0) {
				//0,len을 생략할경우 buff의 길이를 읽어오게 됨 : buff에 있는 데이터 중 읽어온 0번째부터 ? 까지 
				fos.write(buff, 0, len);
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
