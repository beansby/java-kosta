package exercise;

import java.util.Scanner;

public class Ex5_07 {
	public static void main(String[] args) {
		/**
		 * 문제 5-6에 동전의 개수를 추가한 프로그램이다. 커맨드라인으로부터 거슬러 줄 금액을 입력받아 계산한다. 
		 * 보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다.
		 * 지불할 돈이 충분히 있으면, 거스름돈을 지불 한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. 
		 * (1)에 알맞은 코드를 넣 어서 프로그램을 완성하시오.
		 */

		Scanner scanner = new Scanner(System.in);

		// 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//		int money = scanner.nextInt();
		int money = 3170;

		System.out.println("money=" + money);

		// 2500 + 500 + 250 + 50 = 3300
		int[] coinUnit = { 500, 100, 50, 10 }; // 동전의 단위
		int[] coin = { 5, 5, 5, 5 }; // 단위별 동전의 개수
		
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;

			coinNum = money / coinUnit[i];

			/*
			 * (1) 아래의 로직에 맞게 코드를 작성하시오. 
			 * 1. 금액(money)을 동전단위로 나눠서 필요한 동전의 개수(coinNum)를 구한다.
			 * 2. 배열 coin에서 coinNum만큼의 동전을 뺀다. 
			 * (만일 충분한 동전이 없다면 배열 coin에 있는 만큼만 뺀다.) 
			 * 3. 금액에서 동전의 개수(coinNum)와 동전단위를 곱한 값을 뺀다.
			 */

			if (coin[i] >= coinNum) { 		// 코인 충분
				coin[i] = coin[i] - coinNum;
				money -= (coinUnit[i] * coinNum);
			} else { 						// 코인 부족
				coinNum = coin[i];
				money -= (coinUnit[i] * coinNum);
				coin[i] = 0;
			}
			
			
			//다른 풀이 
//			if(coinNum > coin[i]) {
//				coinNum = coin[i];
//			}
//			coin[i] -= coinNum;
//			money -= (coinUnit[i] * coinNum);
			
			System.out.println(coinUnit[i] + "원: " + coinNum);
		}
		
		if (money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0); // 프로그램을 종료한다.
		}
		
		System.out.println("=남은 동전의 개수 =");

		for (int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "원:" + coin[i]);
		}
	}
}
