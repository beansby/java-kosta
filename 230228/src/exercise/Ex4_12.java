package exercise;

public class Ex4_12 {
	public static void main(String[] args) {
		/**
		 * 구구단의 일부분을 다음과 같이 출력하시오.
		 */
		
		for(int i=1; i<=3; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j +"*"+ i +"="+ (i*j) +"\t");
			}
			System.out.println();
		}
	}
}
