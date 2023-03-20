import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("fileExample.txt");
			fos = new FileOutputStream("fileCopy.txt");
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
//			int data;
//			while((data = fis.read()) != -1) {
//				fos.write(data);
//			}
			
			byte[] buff = new byte[512];
			int len;
			// 읽어온 길이가 0보다 크면 
			while((len = bis.read(buff)) > 0) {
				//0,len을 생략할경우 buff의 길이를 읽어오게 됨 : buff에 있는 데이터 중 읽어온 0번째부터 ? 까지 
				bos.write(buff, 0, len);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 보조 스트림 close() -> 기반 스트림도 함께 close() 
				if(bis != null) bis.close();
				if(bos != null) bos.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}
}
