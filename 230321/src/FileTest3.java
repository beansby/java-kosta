import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest3 {
	public static void main(String[] args) {
		File dir = new File("/Users/ebina/eclipse");
		
		if(dir.exists() == false || dir.isDirectory() == false) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mma");
		File[] files = dir.listFiles();
		String attribute = "";
		for(File f : files) {
			String name = f.getName();
			if(f.isDirectory()) {
				attribute = "DIR";	
			} else {
				attribute = f.canRead() ? "R" : " ";
				attribute += f.canWrite() ? "W" : " ";
				attribute += f.isHidden() ? "H" : " ";
				
			}
			System.out.printf("%s %3s %5d %s \n", 
					df.format(new Date(f.lastModified())), //날짜 객체 -> 원하는 형식  
					attribute, 
					f.length(), 
					name);
		}
		
	}
}
