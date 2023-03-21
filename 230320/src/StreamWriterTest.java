import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamWriterTest {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			fos = new FileOutputStream("test.txt");
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			
			bw.write("FileOutputStream : byte 기반");
			bw.newLine();
			bw.write("OutputStreamWriter : byte -> 문자");
			bw.newLine();
			bw.write("BufferedWriter : 문자 기반");
			bw.newLine();
			
			
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
}
