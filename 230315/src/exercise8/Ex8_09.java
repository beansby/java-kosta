package exercise8;

import java.util.jar.Attributes.Name;

/**
 * 다음과 같은 조건의 예외클래스를 작성하고 테스트하시오. 
 * [참고] 생성자는 실행결과를 보고 알맞게 작성해야한다.
 * 
 * 클래스명 : UnsupportedFuctionException 
 * 조상클래스명 : RuntimeException
 * 멤버변수 :
 * 이 름 : ERR_CODE 
 * 저장값 : 에러코드
 * 타 입:int
 * 기본값 : 100
 * 제어자 : final private
 * 
* 메서드 :
* 1. 메서드명 : getErrorCode
* 기  능 : 에러코드(ERR_CODE)를 반환한다. 
* 반환타입 : int
* 매개변수 : 없음
* 제어자 : public
* 
* 2. 메서드명 : getMessage
* 기  능 : 메세지의 내용을 반환한다.(Exception클래스의 getMessage()를 오버라이딩) 
* 반환타입 : String
* 매개변수 : 없음
* 제어자 : public
 * @author ebina
 *
 */
public class Ex8_09 {
	public static void main(String[] args) throws Exception {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.",100);
	}
}

class UnsupportedFuctionException extends RuntimeException {
	final private int ERR_CODE;
	
	public UnsupportedFuctionException(String message, int errCode) {
		super(message);
		ERR_CODE = errCode;
		
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}

	@Override
	public String getMessage() {
		return "["+ERR_CODE+"]"+super.getMessage();
	}
}
