package exercise11;
/**
 * 다음은 섯다게임에서 카드의 순위를 결정하는 등급목록(족보)이다. 
 * HashMap에 등급과 점수를 저장하는 registerJokbo()와 게임참가자의 점수를 계산해서 반환하는 getPoint()를 완성하시오.
 * [참고] 섯다게임은 두 장의 카드의 숫자를 더한 값을 10으로 나눈 나머지가 높은 쪽이 이기는 게임이다. 
 * 그 외에 도 특정 숫자로 구성된 카드로 이루어진 등급(족보)이 있어서 높은 등급의 카드가 이긴다.
 * @author ebina
 *
 */
public class Ex11_12 {
	public static void main(String[] args) throws Exception {
		SutdaDeck deck = new SutdaDeck();
		deck.shuffle();
		Player p1 = new Player("타짜", deck.pick(), deck.pick()); 
		Player p2 = new Player("고수", deck.pick(), deck.pick());
		System.out.println(p1+" "+deck.getPoint(p1)); 
		System.out.println(p2+" "+deck.getPoint(p2));
	}
}
