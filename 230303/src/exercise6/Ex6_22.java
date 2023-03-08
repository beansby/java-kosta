package exercise6;
/**
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : isNumber
 * 기 능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다.
 * 모두 숫자로만 이루어져 있으면 true를 반환하고, 그렇지 않으면 false를 반환한다.
 * 만일 주어진 문자열이 null이거나 빈문자열“”이라면 false를 반환한다.
 * 반환타입 : boolean
 * 매개변수 : String str - 검사할 문자열
 * [Hint] String클래스의 charAt(int i)메서드를 사용하면 문자열의 i번째 위치한 문자를 얻을 수 있다.
 * @author ebina
 *
 */
public class Ex6_22 {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234d";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}
	
	static boolean isNumber(String str) {
		int leng = str.length();
		char[] letter = new char[leng];
		for(int i=0; i<letter.length; i++) {
			letter[i] = str.charAt(i);
		}
		
		for(int i=0; i<letter.length; i++) {
			if(letter[i] >= '0' && letter[i] <= '9') {

			} else { return false; }
		}
		return true;
		
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			if(!(ch>='0' && ch<='9')) return false;
//		}
//		return true;
	}
}
