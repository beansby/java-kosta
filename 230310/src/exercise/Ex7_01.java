package exercise;

public class Ex7_01 {
	public static void main(String[] args) {
		/**
		 * 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 
		 * 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오.
		 * 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고,
		 * 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이어야 한다.
		 * 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
		 */
	
		SutdaDeck deck = new SutdaDeck();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
	}
}


class SutdaDeck {
	final int CARD_NUM = 20;
	
	//카드 20장을 담는 배열 cards 
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		for (int i=0; i<cards.length; i++) {
			//넘겨줄 숫자 
			int num = i%10+1;
			// i = 0~19 , num = 1~10
			boolean isKwang = (i<10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	//기본 생성
	SutdaCard() {
		this(1, true);
		
	}
	
	//생성자 
	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + ( isKwang ? "K":""); //광이 true면 K false면 ""
	}
}
