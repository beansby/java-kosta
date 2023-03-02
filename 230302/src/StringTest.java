
public class StringTest {
	public static void main(String[] args) {
//		String string = "abc123helloworld";
//		
//		for(int i=0; i<string.length(); i++) {
//			char ch = string.charAt(i);
//			System.out.print(ch+"\t");
//			int n = ch -'0';
//			System.out.println(n);
//			
//			if(ch >'0' && ch < '9') {	//숫자 
//				
//			} else {					//문자 
//				
//			}
//		}
		
		char ch = '5';
		String result = "";
		char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
		
		//'0':48, '1':49
		result += numCode[ch-'0'];
		System.out.println(result);
	}
}
