
public class StringBuilderTest2 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("How are you~~.");
//		
//		
//		//charAt
//		char ch = sb.charAt(4);
//		System.out.println(ch);
//		
//		sb.delete(11, 13);
//		System.out.println(sb);
		
		StringBuilder sb = new StringBuilder("안녕하세요~~.");
		
		
		//charAt : 4번째 인덱스 값 
		char ch = sb.charAt(4);
		System.out.println(ch);
		
		//delete : 인덱스 5~7 값 제거 
		sb.delete(5, 7);
		System.out.println(sb);
		
		//insert : 인덱스 n부터 추가 
		sb.insert(sb.length()-1, " 반갑습니다");
		System.out.println(sb);
		StringBuilder sb2 = new StringBuilder("0123456789");
		System.out.println(sb2);
		sb2.insert(3, "추가");
		System.out.println(sb2);
		
		//replace : 인덱스 0~5를 대
		sb.replace(0, 5, "Hello, ");
		System.out.println(sb);
		
		//reverse : 문자열 거꾸로 뒤집기 
		sb.reverse();
		System.out.println(sb);
		
		
	}
}	
