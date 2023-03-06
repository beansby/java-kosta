package exercise6;
/**
 * 다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의
 * 문제6-1에서 정의한 StudaCard클래스에 두 개의 생성자와 info()를 추가해서 실행 결과와 같은 결과를 얻도록 하시오
 * @author ebina
 *
 */
public class Ex6_02 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false); 
		SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		num = 1;
		isKwang = true;
	}

	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang ? "K" : "");
	}	
}