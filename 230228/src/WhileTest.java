
public class WhileTest {
	public static void main(String[] args) {
		/**
		 * 반복문 while
		 */
		//1~10까지 합 구하기 
		int sum = 0, i=1;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1~10까지 합계 : "+sum);
		
		
		//1~100까지 5의 배수의 합
		int d5x = 0, j=1;
		while(j<=100) {
			//5로 나눈 나머지가 0일 때 
			if(j%5 == 0) {
				d5x += j;
			}
			j++;
		}
		System.out.println("1~100까지 5의 배수 합계 : "+d5x);	
	}
}
