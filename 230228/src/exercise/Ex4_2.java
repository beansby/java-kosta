package exercise;

public class Ex4_2 {
	public static void main(String[] args) {
		/**
		 * 1부터 20까지의 정수 중 2 또는 3의 배수가 아닌 수의 총합 구하
		 */
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(i%2 != 0 && i%3 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}