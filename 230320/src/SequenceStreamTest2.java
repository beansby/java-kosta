import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamTest2 {
	public static void main(String[] args) {
		Vector vector = new Vector();
		SequenceInputStream sis = null;
		FileOutputStream fos = null;
		
		try {
			vector.add(new FileInputStream("fileExample.txt"));
			vector.add(new FileInputStream("fileExample2.txt"));
			vector.add(new FileInputStream("fileExample3.txt"));
			
			sis = new SequenceInputStream(vector.elements()); //enumeration을 주는 메소드 elements() 
			fos = new FileOutputStream("fileMerge3.txt");
			
			byte[] buff = new byte[512];
			int len;
			while((len = sis.read(buff)) > 0) {
				fos.write(buff, 0, len);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(sis != null) sis.close();
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
