
public class ForTest2 {
	public static void main(String[] args) {
		/**
		 * 반복문 for
		 */
		//구구단 2단
		for(int i=1; i<=9; i++) {
			int value = 2*i;
			System.out.println("2 x "+i+" = "+value);
		}
		
		
		/**
		 * 중첩 for
		 */
		//구구단 2~9단 
		for (int i=2; i<=9; i++) {
			System.out.println("<구구단 " +i+ "단>");
			for (int j=1; j<=9; j++) {
				int value = i*j;
				System.out.println(i +" X "+ j +" = "+value);
			}
			System.out.println();
		}
	}
}
