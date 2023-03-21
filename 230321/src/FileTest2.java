import java.io.File;

public class FileTest2 {
	public static void main(String[] args) {
		File file = new File("/Users/ebina/eclipse");
		
		if(file.exists() == false || file.isDirectory() == false){
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		File[] fileList = file.listFiles();
		int dicCnt = 0; //directory 갯수
		int totalSize = 0;
		for(File f : fileList) {
			if(f.isDirectory()) dicCnt++;
			totalSize += f.length();
			
//			String filename = f.getName();
//			System.out.println(f.isDirectory() ? "["+filename+"]" : filename);
		}
	}
}
