import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReaderTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			File file = new File("person.txt");
			fis = new FileInputStream(file);	//file 객체에 stream 생성, byte 단위 
			isr = new InputStreamReader(fis); //byte -> 문자 단위 
			br = new BufferedReader(isr);	//문자 단위 
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
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
