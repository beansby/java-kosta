package exercise;

public class Ex3_05 {
	public static void main(String[] args) {
		/**
		 * 아래는 변수 num의 값 중에서 일의 자리를 1로 바꾸는 코드이다. 
		 * 만일 변수 num의 값이 333이라면 331이 되고, 777이라면 771이 된다. 
		 * (1)에 알맞은 코드를 넣으시오.
		 */
		int num = 787;
		int num1 = num/10; 
		System.out.println((num1*10)+1);
	}
}
