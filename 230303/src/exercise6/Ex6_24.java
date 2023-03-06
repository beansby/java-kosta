package exercise6;
/**
 * 다음과 같이 정의된 메서드를 작성하고 테스트하시오.
 * 메서드명 : abs
 * 기 능 : 주어진 값의 절대값을 반환한다. 
 * 반환타입 : int
 * 매개변수 : int value
 * @author ebina
 *
 */
public class Ex6_24 {
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value)); 
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}
	
	static int abs(int value) {
		return Math.abs(value);
	}
}
