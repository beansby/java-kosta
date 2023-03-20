
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("./src/fileWrite.txt"); //상대경로 : 현재경로(.) 기준 
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요? 반갑습니다.");
			bw.newLine();
			bw.write("개행하는 메소드 newLine()");
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
