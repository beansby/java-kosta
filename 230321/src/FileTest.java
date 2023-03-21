import java.io.File;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("./file/fileExample.txt");
		String fileName = file.getName();
		
		System.out.println(fileName);
		int pos = fileName.indexOf(".");
		System.out.println(fileName.substring(0,pos));
		System.out.println(fileName.substring(pos+1));
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath()); 	//절대경로 = 전체경로 
		System.out.println(file.getParent()); 			//파일이 포함된 폴더 
		
		System.out.println(File.pathSeparator);		// :(linux), ;(window) : 여러개의 패스가 환경변수에 등록되어 있을 때 패스 구분자 
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);			// /(linux), \(window) : 폴더, 디렉토리 구분자 
		System.out.println(File.separatorChar);
	}
}
