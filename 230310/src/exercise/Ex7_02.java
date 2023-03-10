package exercise;

public class Ex7_02 {
	public static void main(String[] args) {
		/**
		 * 문제 7-1 SutdaDeck의 클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하시오.
		 * [주의]  Math.random() . 을 사용하는 경우 실행결과와 다를 수 있음
		 * 
		 * 1. 메서드명 : shuffle 
		 * 기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다 (Math.random() 사용)
		 * 반환타입 : 없음 
		 * 매개변수 : 없음 
		 * 
		 * 2. 메서드명 : pick 
		 * 기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
		 * 반환타입 : SutdaCard
		 * 매개변수 : int index - 위치
		 * 
		 * 3. 메서드명 : pick 
		 * 기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다 (Math.random() 사용)
		 * 반환타입 : SutdaCard
		 * 매개변수 : 없음 
		 */
		
		SutdaDeck2 deck = new SutdaDeck2();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
		
	}
}

class SutdaDeck2 {
	final int CARD_NUM = 20;
	SutdaCard2[] cards = new SutdaCard2[CARD_NUM];
	SutdaDeck2() {
		for (int i=0; i<cards.length; i++) {
			//넘겨줄 숫자 
			int num = i%10+1;
			// i = 0~19 , num = 1~10
			boolean isKwang = (i<10) && (num == 1 || num == 3 || num == 8);
			cards[i] = new SutdaCard2(num, isKwang);
		}
	}
	
	/**
	 * cards[] 에 담긴 카드의 위치 뒤섞기 
	 */
	public void shuffle() {
		for(int i=0; i<100; i++) {
			int num1 = (int) (Math.random()*(cards.length-1));
			int num2 = (int) (Math.random()*(cards.length-1));
			
			SutdaCard2 tmp = cards[num1];
			cards[num1] = cards[num2];
			cards[num2] = tmp;
		}
	}
	
	/**
	 * cards[] 에서 지정된 위치의 SutdaCard 리턴 
	 * @param idx
	 * @return
	 */
	public SutdaCard2 pick(int idx) {
		return cards[idx];
	}
	
	/**
	 * cards[] 에서 임의의 위치의 SutdaCard 리턴 
	 * @return
	 */
	public SutdaCard2 pick() {
		int num = (int) (Math.random()*(cards.length-1));
		return cards[num];
	}
}

class SutdaCard2 {
	int num;
	boolean isKwang;
	
	SutdaCard2() {
		this(1, true);
	}
	
	SutdaCard2(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}
