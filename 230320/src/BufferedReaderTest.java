import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("fileExample.txt");
			br = new BufferedReader(fr);
			
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
