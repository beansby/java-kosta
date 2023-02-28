import java.util.Iterator;

public class ForTest {
	public static void main(String[] args) {
		/**
		 * 반복문 for
		 */
		
		//1~100까지 짝수의 합계 구하
		int evensum = 0;
		
		for(int i=1; i<=100; i++) {
			if (i%2 == 0) {
				int current = evensum;
				evensum += i;
				System.out.println(current +"와 "+ i+"의 합 = "+evensum);
			}
		}
		
		System.out.println("1~100까지의 수 중 짝수의 합 : "+evensum);		//2550
		
		
		//1~100까지 3의 배수의 합
		int ex3d = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0) {
				ex3d += i;
			}
		}
		
		System.out.println("1~100까지의 수 중 3의 배수의 합 : "+ex3d); 	//3367
	}
}
